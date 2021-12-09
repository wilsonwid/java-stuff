import java.util.*;

class ZipCode {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a zip code: ");
        int zip = sc.nextInt();
        sc.close();
        
        // beginning a switch statement
        switch(zip / 10000) { // this performs an integer division of things
            case 0: case 1: case 2: case 3:
                System.out.println(zip + " is on the East Coast."); break;
            case 4: case 5: case 6:
                System.out.println(zip + " is in the Central Plains."); break;
            case 7:
                System.out.println(zip + " is in the South."); break;
            case 8: case 9:
                System.out.println(zip + " is in the West."); break;
            default:
                System.out.println(zip + " is an invalid ZIP code."); break;

        }
    }
}