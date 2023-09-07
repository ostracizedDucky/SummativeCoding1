import java.util.Scanner;


// Summative Coding 1
public class App {


    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int rating1;
        int rating2;
        int rating3;

        double focus1;
        double focus2;

        double averageRating;


        // Website 
        System.out.println("Please enter three ratings from the movie review website: ");
        rating1 = scan.nextInt();
        rating2 = scan.nextInt();
        rating3 = scan.nextInt();

        // Focus
        System.out.println("Please enter ratings from the focus group: ");
        focus1 = scan.nextDouble();
        focus2 = scan.nextDouble();

        // Critic
        System.out.println("Please enter the average movie critic rating: ");
        averageRating = scan.nextDouble();


        //Print
        System.out.println("Average website rating: " + ((rating1 + rating2 + rating3)/3.0));
        System.out.println("Average focus group rating: " + (focus1 + focus2)/2.0);
        System.out.println("Average movie critic rating: " + (averageRating));

        System.out.println("Overall movie rating: " + (((rating1 + rating2 + rating3)/3.0)*0.2 + ((focus1 + focus2)/2.0)*0.3 + averageRating*0.5));


       

    }

}
