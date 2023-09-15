/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luchn1k
 */
public class CardHandler {

    private final Map<String, Card> CARD_LIST = new HashMap();
 
    private static CardHandler instacnce;
    private CardHandler(){
       
    }  
    
    public static CardHandler getInstance(){
        if(instacnce == null)
            instacnce = new CardHandler();
        return instacnce;
    }
    
    public void addCard(Card card) {
        if (card != null) {
            CARD_LIST.put(card.getCardNumber(), card);
        }
    }

    public Card createCard(String cardNumber, String cardHolder, String cardPassword, Date cardExpDate, String cardVender,double avilableMoney) {
        return new Card(cardNumber, cardHolder, cardPassword, cardExpDate, cardVender,avilableMoney);
    }

    public boolean isValidPassword(String cardNumber, String password) {
        boolean valid = false;
        Card enterdCard = CARD_LIST.get(cardNumber.trim());
        if (enterdCard != null) {
            valid = enterdCard.getCardPassword().equals(password.trim());
        }
        return valid;
    }

    public boolean isValidCardNumber(String cardNumber) {
        return CARD_LIST.get(cardNumber) != null;
    }
    public Card getCard(String cardNumber){
        return CARD_LIST.get(cardNumber);
    }
    public void setCard(Card card, String cardNumber){
        CARD_LIST.replace(cardNumber, card);
    }
}
