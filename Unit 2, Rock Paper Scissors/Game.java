import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String args[]){
        char rock = 'r';
        char paper = 'p';
        char scissors = 's';
        char exit = 'x';
        int w = 0;
        int l = 0;
        char Playerchoice = ' ';


        var scan = new Scanner(System.in);


        System.out.println("\nChoose rock, paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'\n\n****************************************************************************************************\n");
        
        while(Playerchoice != exit)
        {

        System.out.format("Wins: %d Losses: %d", w, l);
        System.out.println("\n\nPlayer Choice:\n");
        Playerchoice = scan.next().charAt(0);
        // System.out.println(Playerchoice);
        
        Random r = new Random();
        String alphabet = "rps";
        char Computerchoice = alphabet.charAt(r.nextInt(alphabet.length()));
        //System.out.println(Computerchoice);

        //boolean res;
        //if(res = r.equals(r));
        if(Computerchoice == rock && Playerchoice == paper){
        System.out.println("\nYou Win! \n\nComputer Choice: rock    Player Choice: paper\n\n****************************************************************************************************\n");
        w++;
    }

        else if(Computerchoice == rock && Playerchoice == scissors){
        System.out.println("\nYou lose! \n\nComputer Choice: rock    Player Choice: scissors\n\n****************************************************************************************************\n");
        l++;
    }

        else if(Computerchoice == paper && Playerchoice == scissors){
        System.out.println("\nYou win! \n\nComputer Choice: paper    Player Choice: scissors\n\n****************************************************************************************************\n");
        w++;
    }

        else if(Computerchoice == paper && Playerchoice == rock){
        System.out.println("\nYou lose! \n\nComputer Choice: paper    Player Choice: rock\n\n****************************************************************************************************\n");
        l++;
    }
        
        else if(Computerchoice == scissors && Playerchoice == rock){
        System.out.println("\nYou win! \n\nComputer Choice: scissors    Player Choice: rock\n\n****************************************************************************************************\n");
        w++;
    }

        else if(Computerchoice == scissors && Playerchoice == paper){
        System.out.println("\nYou lose! \n\nComputer Choice: scissors    Player Choice: paper\n\n****************************************************************************************************\n");
        l++;    
    }

        else if(Computerchoice == rock && Playerchoice == rock){
        System.out.println("\nDraw! \n\nComputer Choice: rock    Player Choice: rock\n\n****************************************************************************************************\n");
        }

        else if(Computerchoice == paper && Playerchoice == paper){
        System.out.println("\nDraw! \n\nComputer Choice: paper    Player Choice: paper\n\n****************************************************************************************************\n");
        }

        else if(Computerchoice == scissors && Playerchoice == scissors){
        System.out.println("\nDraw! \n\nComputer Choice: scissors    Player Choice: scissors\n\n****************************************************************************************************\n");
        }

        else if(Playerchoice == exit){
            System.out.println("\nThank you for playing!");
        }

        else{
            System.out.println("\nInvalid selection choice please play again.\n\n****************************************************************************************************\n"); 
        }

        /*
        else if(!(Playerchoice == rock) || !(Playerchoice == paper) || !(Playerchoice == scissors)){
            System.out.println("\nInvalid selection choice please play again.");
        }
        */

        System.out.println(" ");
    }
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

    