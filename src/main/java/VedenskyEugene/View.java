package VedenskyEugene;

import java.util.Scanner;

/**
 * Created by eugenevendensky on 2/14/17.
 */
public class View {
    Scanner scanner = new Scanner(System.in);
    public String askUserTime(){
        System.out.println("What time is it?");
        String userEnteredTime = scanner.nextLine();

        //ask user to input and return the string
       return userEnteredTime;
    }

    public void returnParsedTime(String parsedTime){

        System.out.println("It's " + parsedTime + "!");
    }

}
