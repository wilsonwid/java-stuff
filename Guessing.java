import java.util.Scanner;

class Guessing {
    public static boolean mainGame() {
        int guess = (int) (Math.random() * 10) + 1;
        int numGuesses = 0;
        boolean hit = false;
        Scanner sc = new Scanner(System.in);

        while(!hit) {
            if(numGuesses == 5) {
                System.out.println("Maximum number of guesses reached.");
                break;
            }
            else {
                System.out.println("Guess no: " + (numGuesses + 1));
                System.out.print("Please enter an integer from 1-10: ");
                int userGuess = sc.nextInt();

                if(userGuess > guess) {
                    System.out.println("Guess too high!");
                    numGuesses++;
                } 
                else if(userGuess < guess) {
                    System.out.println("Guess too low!");
                    numGuesses++;
                }
                else {
                    System.out.println("Jackpot!");
                    numGuesses++;
                    hit = true;
                }
            }
        }

        sc.close();
        return hit;
    }

    public static void main(String[] args) {
        // need to make the initial game
        mainGame();

        while(true) {
            Scanner mainScan = new Scanner(System.in);
            int newGame = 0;
            System.out.print("Do you want to play again? (1 for yes, 0 for no): ");
            newGame = mainScan.nextInt();
            mainScan.close();

            if(newGame == 0) {
                System.out.println("Thank you for playing!");
                break;
            }
            else if(newGame == 1) {
                mainGame();
            }
            else {
                System.out.println("Invalid input. Please enter another number.");
            }
        }
    }
}