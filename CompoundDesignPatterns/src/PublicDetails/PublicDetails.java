/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PublicDetails;

import CombinedPattern.PrototypeDesignPattern.Bill;

/**
 *
 * @author Luchn1k
 */
public class PublicDetails {

    private static String bankName = "commercial bank";
    private static String bankAddress = "Seeduwa";

    private static Bill templateBill;

    public PublicDetails() {

    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankNamev) {
        bankName = bankNamev;
    }

    public static String getBankAddress() {
        return bankAddress;
    }

    public static void setBankAddress(String bankAddressv) {
        bankAddress = bankAddressv;
    }

    public static Bill getTemplateBill() {
        if (templateBill == null) {
            templateBill = new Bill("ABC", "", "", "", bankName, bankAddress);
        }
        return templateBill;
    }

}
