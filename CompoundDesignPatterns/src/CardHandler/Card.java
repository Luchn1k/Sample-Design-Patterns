/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardHandler;

import java.util.Date;

/**
 *
 * @author Luchn1k
 */
public class Card {

    private String cardNumber;
    private String cardHolder;
    private String cardPassword;
    private Date cardExpDate;
    private String cardVender;
    private double avilableMoney;
    private boolean accountStatus;

    public Card(String cardNumber, String cardHolder, String cardPassword, Date cardExpDate, String cardVender, double avilableMoney) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cardPassword = cardPassword;
        this.cardExpDate = cardExpDate;
        this.cardVender = cardVender;
        this.avilableMoney = avilableMoney;
        this.accountStatus = true;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAvilableMoney() {
        return avilableMoney;
    }

    public void setAvilableMoney(double avilableMoney) {
        this.avilableMoney = avilableMoney;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public Date getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(Date cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public String getCardVender() {
        return cardVender;
    }

    public void setCardVender(String cardVender) {
        this.cardVender = cardVender;
    }

}
