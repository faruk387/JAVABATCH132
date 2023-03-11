package b132practices.practice08;

import java.util.Scanner;

public class Q02 {
     /*
    Type a Rock Paper Scissors game
    -Take a guess from user
    -Take a guess from computer
    -Compare guesses
    -Who reaches 3 first wins
    -Who wins by 3-0 gets Golden Score
    -Who wins by 3-1 gets Silver Score
    -Who wins by 3-2 gets Bronze Score
    */
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int playerScore=0;
         int computerScore=0;
         int counter=0;
         while(playerScore<3&&computerScore<3){
             counter++;
             System.out.println("Enter your "+counter+ " decision:\nRock\nPaper\nScissors");
             String playerDecision=input.next().trim().toLowerCase();
             if(!(playerDecision.equals("rock")||playerDecision.equals("paper")||playerDecision.equals("scissors"))){
                 System.out.println("Enter a valid decision");
                 counter--;
                 continue;
             }
             //Take a guess from computer
             String[] rockPaperScissorsOptions={"rock","paper","scissors"};
            int randomIndex= (int)(Math.random()*3);
            String computerDecision=rockPaperScissorsOptions[randomIndex];
             System.out.println("computerDecision= "+ computerDecision);
             //compare quess
if(playerDecision.equals(computerDecision)){
    System.out.println("Draw! Score: "+playerScore+" <==> "+computerScore);
}else if(playerDecision.equals("rock")&&computerDecision.equals("scissors")||playerDecision.equals("paper")&&computerDecision.equals("rock")||playerDecision.equals("scissors")&&computerDecision.equals("rock")){
    playerScore++;
    System.out.println("You win! Score: "+playerScore+" <==> "+computerScore);

}else{
    computerScore++;
    System.out.println("Computer wins! Score: "+playerScore+" <==> "+computerScore);

}

         }
         System.out.println("==Game Over==");
         String score;
         if (playerScore==3) {
             if(computerScore==0){
                 score="Golden";
             }else if(computerScore==1){
                 score="silver";
             }else{
                 score="brown";
             }
             System.out.println("You win with "+score+" score! Congratulations");
         }else{ if(playerScore==0){
             score="Golden";
         }else if(playerScore==1){
             score="silver";
         }else{
             score="brown";
         }
             System.out.println("Computer wins with "+score+" score! ");


         }

     }
}
