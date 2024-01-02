import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        double memberFees;
        double totalFees;
        String memberName;
        char memberCode;

        System.out.println("Enter the membership fees ");
        memberFees = input.nextDouble();
        input.nextLine();

        System.out.println("enter the membership name ");
        memberName = input.nextLine();

        System.out.println("Enter the membership code (T,R,S) select one of your own ");
        memberCode = input.next().charAt(0);

        switch (memberCode){
            case 'T':
                totalFees = memberFees + 160.00;
                System.out.println("Hi "+ memberName +" the fees is "+ totalFees + " in code " + memberCode);
                break;
            case 'S':
                totalFees = memberFees + 140.00;
                System.out.println("Hi "+ memberName +" the fees is "+totalFees + " in code " + memberCode);
                break;
            case 'R':
                totalFees = memberFees + 150.00;
                System.out.println("Hi "+ memberName +" the fees is "+totalFees + " in code " + memberCode);
                break;
            default:
                System.out.println("Hi you entered an invalid input");


        }



    }
}