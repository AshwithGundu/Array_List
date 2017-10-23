/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 *
 * @author Ashwith Gundu
 */
public class CardsArrayList {
            private ArrayList<Card> clubs;
            private ArrayList<Card> diamonds;
            private ArrayList<Card> hearts;
            private ArrayList<Card> spades;
            
    /**
     *No arg constructor
     */
    public CardsArrayList()
            {
                clubs = new ArrayList<>();
                diamonds = new ArrayList<>();
                hearts = new ArrayList<>();
                spades = new ArrayList<>();
          
            }

    /**
     *Getter method for clubs
     * @return
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**
     *Getter method for diamonds
     * @return
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**
     *Getter method for Hearts
     * @return
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**
     *Getter method for Spades
     * @return
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }
            
    /**
     * Adding method
     * @param c
     * @return
     */
    public String addCardsToList(Card c) {
         
         switch(c.getType())
         {
             case "clubs":
                 clubs.add(c);
                 break;
              case "diamonds":
                 diamonds.add(c);
                 break;
              case "hearts":
                 hearts.add(c);
                 break;
              case "spades":
                 spades.add(c);
                 break;
              default:
                  break;
                 
         }
        return "cards added successfully";                 
     }      

    /**
     * remove method
     * @param position
     * @param c
     * @return
     */
    public String removeCardsFromList(int position, ArrayList<Card> c)
     {          
         
                if (position<0 && position>c.size())
                {
                   return "ArrayList size underflow, card cannot be removed";
                }
                else
                {
                    c.remove(position);
                    
                }
         
                return "Card is removed successfully!";
               
     }
            @Override
    public String toString()
    {    String ss="";
       ss+="Hearts Array:[ " ;
    for(Card a:hearts)
        {   
            ss+= a.toString();
            
        }
        ss+="]\n";
         ss+="Diamonds Array:[ " ;
    for(Card b:diamonds)
        {   
            ss+= b.toString();
            
        }
        ss+="]\n";
         ss+="Spades Array:[ " ;
    for(Card c:spades)
        {   
            ss+= c.toString();
            
        }
        ss+="]\n";
         ss+="Clubs Array:[ " ;
    for(Card d:clubs)
        {   
            ss+= d.toString();
            
        }
        ss+="]";
                return ss;
                
    
                        
    }                    
}
