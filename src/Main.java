import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the total rent");
        int rent=sc.nextInt();
        System.out.println("enter the total number of roommates in flate :");
        int roomates=sc.nextInt();
        System.out.println("enter other expences ");
        int expences=sc.nextInt();
        System.out.println("enter the electricity bill");
        float electricity=sc.nextInt();
        System.out.println("enter the  electricity per unity");
        float perunit=sc.nextInt();
        float totalelectricity=electricity*perunit;

        System.out.println("amount per person has to be pay is :`");
        float total_rent= rent+totalelectricity+expences;
        float PerPersonHasToPay=total_rent/roomates;
        System.out.println(PerPersonHasToPay);

    }
}