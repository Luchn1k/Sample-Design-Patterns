/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.PrototypeDesignPattern;

/**
 *
 * @author Luchn1k
 */
public class Bill implements BillCloner {

    private String customername;
    private String ammount;
    private String balance;
    private String date;
    private String bank;
    private String bankAddress;

    public Bill(String customername, String ammount, String balance, String date, String bank, String bankAddress) {
        this.customername = customername;
        this.ammount = ammount;
        this.balance = balance;
        this.date = date;
        this.bank = bank;
        this.bankAddress = bankAddress;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public Bill clone() {
        return new Bill(this.customername, this.ammount, this.balance, this.date, this.bank, this.bankAddress);
    }

}
