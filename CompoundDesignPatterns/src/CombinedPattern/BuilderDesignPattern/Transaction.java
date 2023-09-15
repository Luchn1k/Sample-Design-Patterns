/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.BuilderDesignPattern;

import CardHandler.Card;
import java.util.Date;

/**
 *
 * @author Luchn1k
 */
public class Transaction {

    private final Date TRANSACTION_DATE;
    private final Card TRANSACTION_CARD;
    private final double AMMOUNT;

    private Transaction(Builder builder) {
        this.TRANSACTION_CARD = builder.transactionCard;
        this.TRANSACTION_DATE = builder.Transaction_DATE;
        this.AMMOUNT = builder.ammount;
    }

    public Date getTransactionDate() {
        return TRANSACTION_DATE;
    }

    public Card getTransactionCard() {
        return TRANSACTION_CARD;
    }

    public double getAmmount() {
        return AMMOUNT;
    }

   public static class Builder {

        private final Date Transaction_DATE;
        private Card transactionCard;
        private double ammount;

        public Builder(Card card) {
            transactionCard = card;
            Transaction_DATE = new Date();
        }

        public Transaction build() {
            return new Transaction(this);
        }

        public void setTransactionCard(Card transactionCard) {
            this.transactionCard = transactionCard;
        }

        public void setAmmount(double ammount) {
            this.ammount = ammount;
        }

    }
}
