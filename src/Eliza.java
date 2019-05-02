import java.util.Scanner;

public class Eliza {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String answer;
        boolean done = false;

        System.out.println("Good day! What is your problem? ");

        while (!done){

            System.out.print("Enter your response here: ");
            answer = input.nextLine();
            if (answer.toLowerCase().equals("q") ||
                    answer.toLowerCase().equals("i'm feeling great")){
                done = true;

            } else {

                done = false;
                System.out.println(answer);


            }
        }
        System.out.println("Good buy!");


    }
}
