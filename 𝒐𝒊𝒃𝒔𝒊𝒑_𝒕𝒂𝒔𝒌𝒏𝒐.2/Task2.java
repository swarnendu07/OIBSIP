import java.util.*;
import java.util.Random;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int attempt = 10;
        int highscore = 0;
        int num = r.nextInt(20)+1;
        boolean isMatched = false;
        boolean isLimitCross = false;
        int noOfRound = 0;
        System.out.println("<> WELCOME TO NUMBER GUESSING GAME <>");
        System.out.println("--------------------------------------------");

        while (true) {
            if(isLimitCross || isMatched) {

                System.out.println();
                num = r.nextInt(20)+1;
                attempt = 10;
            }
            System.out.println("PRESS 1 - QUICK PLAY");
            System.out.println("PRESS 2 - EXIT GAME");
            System.out.println("CURRENT HIGHSCORE : " + highscore);
            System.out.println("ENTER YOUR CHOICE: ");
            int input = sc.nextInt();
            if (input == 1) {

                System.out.println("\n<> ROUND " + ++noOfRound + " STARTS...! <>");

                while (attempt >= 0) {
                    System.out.println("=========================");

                    if (attempt == 0) {
                        System.out.println("NO ATTEMPT LEFT.");
                        System.out.println("GAME OVER !!!!!");
                        isLimitCross = true;
                        break;
                    }
                    System.out.println("GUESS THE NUMBER : ");
                    int guess = sc.nextInt();
                    System.out.println("ATTEMPT LEFT : " + attempt);
                    if (guess > num) {
                        System.out.println("YOUR GUESS IS TOO HIGH");
                    } else if (guess < num) {
                        System.out.println("YOUR GUESS IS TOO LOW");
                    } else {
                        System.out.println("WELL DONE !! YOU GUESSED THE CORRECT NUMBER...");
                        System.out.println("YOUR SCORE IS " + attempt * 10);
                        highscore = Math.max((attempt * 10), highscore);
                        System.out.println("HIGHSCORE : " + highscore);
                        System.out.println("GAME OVER !!!!!");
                        isMatched=true;
                        break;
                    }
                    System.out.println("=========================");
                    attempt--;
                }
            } else {
                System.out.println("THANK YOU FOR PLAYING THE GAME.");
                System.exit(0);
            }
        }
    }
}