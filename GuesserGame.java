import java.util.Scanner;

class  Guesser{
    int guessNum;
    int GuessNum(){
        System.out.println("Hey Guesser,guess the number b/w 0 to 9");
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        guessNum=sc.nextInt();
        if(guessNum>10){
            System.out.println("Please enter the a valid number ");
        }
        return guessNum;
    }
}
class Players{
    String name;
    int guessNum;

    String PlayerName(){
        System.out.println("Please enter the your name ! , PLAYER ");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        return name;
    }
    int guessNum(){
        System.out.println("Players guess the number b/w 1 to 10");

        Scanner sc=new Scanner(System.in);
        guessNum=sc.nextInt();
        if(guessNum>10){
            System.out.println("hey Player Please enter the valid number");
            guessNum=sc.nextInt();
        }
        return guessNum;

    }
}

class Umpire{
    int numFromGuesser;
    int guessNumFromPlayer1;
    int guessNumFromPlayer2;
    int guessNumFromPlayer3;

    int tiedPlayerA;
    int tiedPlayerB;

    String nameOfPlayer1;
    String nameOfPlayer2;
    String nameOfPlayer3;

    void collectionGuessNum(){
        Guesser g=new Guesser();
        numFromGuesser=g.GuessNum();
    }
    void collectionNameFromPlayer(){
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();

        nameOfPlayer1=p1.PlayerName();
        nameOfPlayer2=p2.PlayerName();
        nameOfPlayer3=p3.PlayerName();
    }
    void  collectionNumFromPlayers(){
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();

        guessNumFromPlayer1=p1.guessNum();
        guessNumFromPlayer2=p2.guessNum();
        guessNumFromPlayer3=p3.guessNum();
    }

    void tied(){
        Guesser g=new Guesser();
        numFromGuesser =g.GuessNum();

        Players pA=new Players();
        Players pB=new Players();

        tiedPlayerA=pA.guessNum();
        tiedPlayerB= pB.guessNum();
    }
    void compare(){
        if(numFromGuesser==guessNumFromPlayer1){
            if(numFromGuesser==guessNumFromPlayer2 && numFromGuesser==guessNumFromPlayer3){
                System.out.println("All Players won the game ");
            }
            else if(numFromGuesser==guessNumFromPlayer2) {
                System.out.println("Game is tied b/w " + nameOfPlayer1 + " & " +nameOfPlayer2);
                System.out.println("Let's start the final ");

                System.out.println("***********");

                tied();

                if(tiedPlayerA==numFromGuesser){
                    System.out.println("Congrats " +nameOfPlayer1 + " won the game ");
                }
                else {
                    System.out.println("Congrats " + nameOfPlayer2 + " won the game ");
                }
            }
            else if (numFromGuesser==guessNumFromPlayer3){
                System.out.println("Game is tied b/w " + nameOfPlayer1 + " & "+nameOfPlayer3);
                System.out.println("Let's start the Final");

                System.out.println("***********");

                tied();

                if(tiedPlayerA==numFromGuesser) {
                    System.out.println("Congrats "+ nameOfPlayer1+", you won the game");
                }else {
                    System.out.println("Congrats " + nameOfPlayer3 + ", you won the game");
                }
            }
            else {
                System.out.println("Congrats "+ nameOfPlayer1+", you won the game");
            }
        }
        else if (numFromGuesser == guessNumFromPlayer2) {
                 if (numFromGuesser == guessNumFromPlayer3) {

                    System.out.println("Game is tied b/w " + nameOfPlayer2 + " & "+nameOfPlayer3 + " ");
                    System.out.println("Let's start the Final");

                     System.out.println("***********");


                    tied();

                    if(tiedPlayerA==numFromGuesser) {
                        System.out.println("Congrats "+ nameOfPlayer2+", you won the game");
                    }else {
                        System.out.println("Congrats " + nameOfPlayer3 + ", you won the game");
                    }

                    } else {
                        System.out.println("Congrats " + nameOfPlayer2 + ", you won the game");
                    }
                } else if (numFromGuesser == guessNumFromPlayer3) {
                    System.out.println("Congrats " + nameOfPlayer3 + ", you won the game");
                } else {
            System.out.println("Lost the Game, Guesser number was "+ numFromGuesser);
        }
    }

}
public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏 " + " WELCOME TO GUESSER GAME " + "🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏 ");
        Scanner sc=new Scanner(System.in);
        Umpire u=new Umpire();
        u.collectionGuessNum();
        u.collectionNumFromPlayers();
        u.collectionNameFromPlayer();
        u.compare();


    }
}
