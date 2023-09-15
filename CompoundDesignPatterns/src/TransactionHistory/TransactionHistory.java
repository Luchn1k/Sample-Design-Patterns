/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransactionHistory;

import CombinedPattern.BuilderDesignPattern.Transaction;
import CombinedPattern.PrototypeDesignPattern.Bill;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luchn1k
 */
public class TransactionHistory {

    public static TransactionHistory instance;
    private final List<Transaction> TRANSACTION_HISTORY;

    private final List<Bill> RECIPT_HISTORY;

    private TransactionHistory() {
        TRANSACTION_HISTORY = new ArrayList();
        RECIPT_HISTORY = new ArrayList();
    }

    public static TransactionHistory getInstance() {
        if (instance == null) {
            instance = new TransactionHistory();
        }
        return instance;
    }

    public void addRecipt(Bill recipt) {
        getInstance().RECIPT_HISTORY.add(recipt);
    }

    public void addToHistory(Transaction transaction) {
        getInstance().TRANSACTION_HISTORY.add(transaction);
    }

}
