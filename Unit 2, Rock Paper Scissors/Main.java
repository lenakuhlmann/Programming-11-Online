import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String args[]){
        char rock = 'r';
        char paper = 'p';
        char scissors = 's';

        var scan = new Scanner(System.in);


        System.out.println("\nChoose rock, paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors.\n");
        char Playerchoice = scan.next().charAt(0);
        // System.out.println(Playerchoice);
        
        Random r = new Random();
        String alphabet = "rps";
        char Computerchoice = alphabet.charAt(r.nextInt(alphabet.length()));
        //System.out.println(Computerchoice);

        //boolean res;
        //if(res = r.equals(r));
        if(Computerchoice == rock && Playerchoice == paper){
        System.out.println("\nYou Win! \n\nComputer Choice: rock    Player Choice: paper");
        }

        else if(Computerchoice == rock && Playerchoice == scissors){
        System.out.println("\nYou lose! \n\nComputer Choice: rock    Player Choice: scissors");
        }

        else if(Computerchoice == paper && Playerchoice == scissors){
        System.out.println("\nYou win! \n\nComputer Choice: paper    Player Choice: scissors");
        }

        else if(Computerchoice == paper && Playerchoice == rock){
        System.out.println("\nYou lose! \n\nComputer Choice: paper    Player Choice: rock");
        }
        
        else if(Computerchoice == scissors && Playerchoice == rock){
        System.out.println("\nYou win! \n\nComputer Choice: scissors    Player Choice: rock");
        }

        else if(Computerchoice == scissors && Playerchoice == paper){
        System.out.println("\nYou lose! \n\nComputer Choice: scissors    Player Choice: paper");
        }

        else if(Computerchoice == rock && Playerchoice == rock){
        System.out.println("\nDraw! \n\nComputer Choice: rock    Player Choice: rock");
        }

        else if(Computerchoice == paper && Playerchoice == paper){
        System.out.println("\nDraw! \n\nComputer Choice: paper    Player Choice: paper");
        }

        else if(Computerchoice == scissors && Playerchoice == scissors){
        System.out.println("\nDraw! \n\nComputer Choice: scissors    Player Choice: scissors");
        }

        else{
            System.out.println("\nInvalid selection choice please play again."); 
        }

        /*
        else if(!(Playerchoice == rock) || !(Playerchoice == paper) || !(Playerchoice == scissors)){
            System.out.println("\nInvalid selection choice please play again.");
        }
        */

        System.out.println(" ");
    }
}

        /*
        if(Random r = new Random();
        String alphabet = "abcdefghijklmnoqtuvwxyz";
        Playerchoice == alphabet.charAt(r.nextInt(alphabet.length()))); 
        System.out.println("\nInvalid selection please play again.");
        }
        */
        
       // System.out.println(" ");


        /*isMatch(Computerchoice.equals(rock))
        if(isMatch == true){
            System.out.println("Computer Choice: rock");
        }
        else();
        /* if(Playerchoice = Computerchoice){
            System.out.println("Draw! \nComputer Choice: Computerchoice    Player choice: Playerchoice");
            */

    