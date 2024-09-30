//demo

public class UnpredictableCardGame{
    public static void main(String[] args){
        
        boolean isGoingToHelp = Math.random() < 0.8;
        
        if(!isGoingToHelp){
            System.out.println("Not picking a card for you this time");
            System.exit(1);
        }
        
        //to call the variable it can also be String suiteName = "";
        String suitName;
        int suit = (int) (Math.random() * 4);
        
        switch(suit){
            case 0:
                suitName = "Clubs"; break;
            case 1:
                suitName = "Diamonds"; break;
            case 2:
                suitName = "Spades"; break;
            case 3:
                suitName = "Hearts"; break;
            default:
                suitName = "Error, this should never happen"; 
        }

        
//        if(suit == 0){
//            suitName = "Clubs";
//        }
//        else if (suit == 1){
//            suitName = "Diamonds";
//        }
//        else if (suit == 2){
//            suitName = "Spades";
//        }
//        else if (suit == 3){
//            suitName = "Hearts";
//        }
//        else{
//            suitName = "Error, this should never happen";
//        }
        
        System.out.println(suitName);
        
        int rank = (int) (1 + Math.random() * 13);
        
        String rankName = "";
        
        switch(rank){
            case 1: rankName = "Ace"; break;
            case 11: rankName = "Jack"; break;
            case 12: rankName = "Queen"; break;
            case 13: rankName = "King"; break;
            default: rankName += rank;
        }
        
        System.out.print("Your card is: ");
        System.out.println(rankName + " of " + suitName);
    }
}