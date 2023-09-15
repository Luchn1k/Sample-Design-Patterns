/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.TemplateDesignPattern;

import CardHandler.Card;


/**
 *
 * @author Luchn1k
 */
public abstract class TransactionProcess {

    protected final double BANK_TRANSACTION = 5;
    protected final double OTHER_BANK_TRANASCTION = 50;

    protected Card card;
    protected double requestedMoney;
    protected String bankName;
    protected double totalExpence;
   

    public TransactionProcess(Card card, double requestedMoney) {
        this.card = card;
        this.requestedMoney = requestedMoney;
        this.bankName = PublicDetails.PublicDetails.getBankName();
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setRequestedMoney(double requestedMoney) {
        this.requestedMoney = requestedMoney;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public abstract boolean validate();

    public abstract void Calculation();

    public abstract void buildTransaction();

    public abstract void printRecipt();

    public boolean proceed(boolean printRecept) {
        boolean valid = false;
        if (validate()) {
            Calculation();
            buildTransaction();
            if (printRecept) {
                printRecipt();
            }
            return true;
        }
        return valid;
    }

}
