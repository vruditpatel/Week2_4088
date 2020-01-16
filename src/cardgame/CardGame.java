
package cardgame;

/**
 *
 * @author vrudit patel
 */
public class CardGame {
    private String suit;//clubs, spades,diamonds,hearts
    private int number;//1-13
    
    public CardGame(int n, String s){
        this.number=n;
        this.suit=s;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String[] suits={"Hearts", "Spades", "daimonds","Clubs"};
        CardGame[] card = new CardGame[52];
        for (int i = 0; i <card.length; i++) {
            if (i<13) {
                card[i] =new CardGame(i,suits[0]);
            }
            if (i>=13 && i<26) {
                card[i]=new CardGame(i-13,suits[1]);
            }
            if(i>=26 && i <39){
                card[i]=new CardGame(i-26,suits[2]);
            }
             if(i>=39 && i <52){
                card[i]=new CardGame(i-39,suits[3]);
            }
        }
        for (int i = 0; i <card.length; i++) {
            System.out.println(card[i].number+""+card[i].suit);
        }
    }
public String getSuit(){
    return suit;
}
public void setSuit(String suit){
    this.suit=suit;
}}
