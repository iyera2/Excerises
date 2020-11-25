import java.util.*;

public class Exercise1 {
  public static void main ( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);
    String inChars;
    int selection, spread;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );

    Pantry hubbard = new Pantry(goose, apple, rhub);
    while(true){
        System.out.println("Welcome to Mother Hubbard's Pantry");
        System.out.println(hubbard);
        System.out.println("Enter your selection: (1, 2, 3)");
        selection = scan.nextInt();
        if(selection == -1) {
            break;
        }

        System.out.println("Enter amount to spread");
        spread = scan.nextInt();

        hubbard.select(selection);
        hubbard.select(spread);
    }
  }
}