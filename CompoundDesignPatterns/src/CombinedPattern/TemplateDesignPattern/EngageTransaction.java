/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.TemplateDesignPattern;

import CardHandler.Card;
import CardHandler.CardHandler;
import CombinedPattern.BuilderDesignPattern.Transaction;
import CombinedPattern.ChainOfResponcibility.FinalValidation;
import CombinedPattern.ChainOfResponcibility.ValidateBalance;
import CombinedPattern.ChainOfResponcibility.ValidateExperationDate;
import CombinedPattern.ChainOfResponcibility.ValidationDetails;
import CombinedPattern.InterpreterDesignPattern.AddOperation;
import CombinedPattern.InterpreterDesignPattern.Expression;
import CombinedPattern.PrototypeDesignPattern.Bill;
import GUI.Receipt;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Luchn1k
 */
public class EngageTransaction extends TransactionProcess {
    
    public EngageTransaction(Card card, double requestedMoney) {
        super(card, requestedMoney);
    }
    
    @Override
    public boolean validate() {
        ValidateBalance validateBalance = new ValidateBalance();
        ValidateExperationDate validateExpDate = new ValidateExperationDate();
        FinalValidation finalValidation = new FinalValidation();
        
        ValidationDetails validateDetail = new ValidationDetails(card.isAccountStatus(), card.getCardExpDate(), card.getAvilableMoney(), requestedMoney);
        validateBalance.setNext(validateExpDate);
        validateExpDate.setNext(finalValidation);
        
        return validateBalance.validate(validateDetail);
        
    }
    
    @Override
    public void Calculation() {
        Expression currentTotal = new CombinedPattern.InterpreterDesignPattern.Number(String.valueOf(requestedMoney));
        Expression bankServiceCharge = new CombinedPattern.InterpreterDesignPattern.Number(String.valueOf(BANK_TRANSACTION));
        
        Expression addOperation = new AddOperation(currentTotal, bankServiceCharge);
        double total = addOperation.interpret();
        
        if (bankName.equals(card.getCardVender())) {
            Expression BankPenlty = new CombinedPattern.InterpreterDesignPattern.Number(String.valueOf(OTHER_BANK_TRANASCTION));
            Expression totalExpression = new CombinedPattern.InterpreterDesignPattern.Number(String.valueOf(total));
            addOperation = new AddOperation(totalExpression, BankPenlty);
            total = addOperation.interpret();
        }
        totalExpence = total;
        
    }
    
    @Override
    public void buildTransaction() {
        Transaction.Builder transactionBuilder = new Transaction.Builder(card);
        transactionBuilder.setAmmount(totalExpence);
        Transaction currentTransaction = transactionBuilder.build();
        card.setAvilableMoney(card.getAvilableMoney() - totalExpence);
        System.out.println(card.getAvilableMoney());
        CardHandler.getInstance().setCard(card,card.getCardNumber());
        TransactionHistory.TransactionHistory.getInstance().addToHistory(currentTransaction);
    }
    
    @Override
    public void printRecipt() {
        Bill cloneedBill = PublicDetails.PublicDetails.getTemplateBill().clone();
        cloneedBill.setCustomername(card.getCardHolder());
        cloneedBill.setAmmount("RS . " + totalExpence);
        cloneedBill.setBalance("RS . " + card.getAvilableMoney());
        cloneedBill.setDate(new SimpleDateFormat("yyyy-MMM-dd").format(new Date()));
        TransactionHistory.TransactionHistory.getInstance().addRecipt(cloneedBill);
         new Receipt(cloneedBill.getBank(),cloneedBill.getBankAddress(),cloneedBill.getCustomername(),cloneedBill.getBalance(),cloneedBill.getAmmount()).setVisible(true);
    }
    
}
