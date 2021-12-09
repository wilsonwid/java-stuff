import java.util.Scanner;

class Guessing {
    public static void main(String[] args) {
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
        
        System.out.println("You made a right guess in " + numGuesses + " moves.");
        System.out.println("Congratulations!");

    }
}