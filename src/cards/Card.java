/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author Ashwith Gundu
 */
public class Card {
     private int number;
     String type;

    /**
     *card with two arguments
     * @param number
     * @param type
     */
    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    /**
     * getter method for number
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * setter method for number
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getter type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * setter type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

     @Override
    public String toString()
    {
        return number+" ";
    }
    
    
}
