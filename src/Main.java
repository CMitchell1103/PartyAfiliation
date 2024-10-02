import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        System.out.println("Enter your party affiliation [R,D,I]: ");
        partyAfil = in.nextLine();

        //Republican
        if (partyAfil.equals("R")) {
            System.out.println("You get a Republican Elephant! ");

        // Democrat
        } else if (partyAfil.equals("D")) {

            System.out.println("You get a Democrat Donkey! ");

        // Independent
        } else if (partyAfil.equals("I")) {

            System.out.println("You get an Independent Man! ");

        // Other
        } else {

            System.out.println("I dont know what party this is: " + partyAfil);
        }
        in.close();

    }





}