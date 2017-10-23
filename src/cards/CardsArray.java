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
public class CardsArray {
    Card[] clubs;
    Card[] diamonds;
    Card[] hearts;
    Card[] spades;
    int DECK_SIZE = 5;
    int clubsCount;
    int diamondsCount;
    int heartsCount;
    int spadesCount;
    public CardsArray()
    {
        clubs = new Card[DECK_SIZE];
        diamonds = new Card[DECK_SIZE];
        hearts = new Card[DECK_SIZE];
        spades = new Card[DECK_SIZE];
        clubsCount = 0;
        diamondsCount = 0;
        spadesCount = 0;
        heartsCount = 0;
    }

    public int getClubsCount() {
        return clubsCount;
    }

    public int getDiamondsCount() {
        return diamondsCount;
    }

    public int getHeartsCount() {
        return heartsCount;
    }

    public int getSpadesCount() {
        return spadesCount;
    }
   
    public String addCardsToArray(Card c)
    {
        switch(c.getType()){
            case "clubs":
                if(clubsCount < DECK_SIZE){
                    clubs[clubsCount]=c;
                    clubsCount++;
                }
                else{
                    removeCardsFromArray(0,c.getType());
                    addCardsToArray(c);
                }
                break;
                
                
            case "hearts":
                if(heartsCount<DECK_SIZE)
                {
                    hearts[heartsCount]=c;
                    heartsCount++;
                }
                else{
                   removeCardsFromArray(0,c.getType());
                     addCardsToArray(c);
                }
                break;
             case "spades":
                if(spadesCount<DECK_SIZE)
                {
                    spades[spadesCount]=c;
                    spadesCount++;
                }
                else{
                   removeCardsFromArray(0,c.getType());
                       addCardsToArray(c);
                }
                break;
             case "diamonds":
                if(diamondsCount<DECK_SIZE)
                {
                    diamonds[diamondsCount]=c;
                    diamondsCount++;
                }
                else{
                   removeCardsFromArray(0,c.getType());
                    addCardsToArray(c);
                }
               // break;
       
        }
         return null;
    }
    
    public String removeCardsFromArray(int position, String cardType)
    {
       
        if("clubs".equals(cardType)){
        if(position<=clubsCount||position>=0){
           clubs[position]=null;  
        for(int i=position;i<clubsCount;i++){
            
        if(i+1 != clubsCount){
            clubs[i]=clubs[i+1];
           
        }
        else{
            clubs[i]=null;
             }

          }
    clubsCount--; 
    
        }  
      }
      
      if("hearts".equals(cardType)){
        if(position<=heartsCount||position>=0){
           hearts[position]=null;  
        for(int i=position;i<heartsCount;i++){
            
        if(i+1 != heartsCount){
            hearts[i]=hearts[i+1];
           
        }
        else{
            hearts[i]=null;
             }

          }
    heartsCount--; 
    
        }  
      }
        
        if("spades".equals(cardType)){
        if(position<=spadesCount||position>=0){
           spades[position]=null;  
        for(int i=position;i<spadesCount;i++){
            
        if(i+1 != spadesCount){
            spades[i]=spades[i+1];
           
        }
        else{
            spades[i]=null;
             }

          }
    spadesCount--; 
    
        }  
      }
        
      if("diamonds".equals(cardType)){
        if(position<=diamondsCount||position>=0){
           diamonds[position]=null;  
        for(int i=position;i<diamondsCount;i++){
            
        if(i+1 != diamondsCount){
           diamonds[i]=diamonds[i+1];
           
        }
        else{
            diamonds[i]=null;
             }

          }
    diamondsCount--; 
    
        }  
      }
        
        
        return null;

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
            if(b != null){
            ss+= b.toString();}
            
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


