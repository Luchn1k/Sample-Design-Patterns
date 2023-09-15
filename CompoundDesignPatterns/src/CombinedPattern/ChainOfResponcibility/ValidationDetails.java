/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CombinedPattern.ChainOfResponcibility;

import java.util.Date;

/**
 *
 * @author Luchn1k
 */
public class ValidationDetails {

    private final boolean ACCOUNT_STATUS;
    private final Date EXP_DATE;
    private final double AVILABLE_MONEY;
    private final double REQUESTED_MONEY;

    public ValidationDetails(boolean ACCOUNT_STATUS, Date EXP_DATE, double AVILABLE_MONEY, double REQUESTED_MONEY) {
        this.ACCOUNT_STATUS = ACCOUNT_STATUS;
        this.EXP_DATE = EXP_DATE;
        this.AVILABLE_MONEY = AVILABLE_MONEY;
        this.REQUESTED_MONEY = REQUESTED_MONEY;
    }

    public double getRequestedMoney() {
        return REQUESTED_MONEY;
    }

    public boolean isAccountStatus() {
        return ACCOUNT_STATUS;
    }

    public Date getExpDate() {
        return EXP_DATE;
    }

    public double getAvilableMoney() {
        return AVILABLE_MONEY;
    }

}
