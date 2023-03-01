/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        if(name.toLowerCase().compareTo("alice")==0 || name.toLowerCase().compareTo("bob")==0){
            System.out.println("Howdy " + name);
        }
        /*if(name.compareTo("Alice")==0 || name.compareTo("Bob")==0){ // I commented this one out cause its worse imo
            System.out.println("Howdy " + name);
        }*/
    }
}
