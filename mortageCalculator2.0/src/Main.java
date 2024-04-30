import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months_in_year=12;
        final byte percentage=100;
        Scanner scanner=new Scanner(System.in);
        int principal;
        float annualIntrest;
        float monthlyIntrest;
        int numberOfPayments;
        byte years;
        while(true){
            System.out.print("Principal($1K-$1M): ");
             principal=scanner.nextInt();
            if(principal>=1000&&principal<=1_000_000)
                break;
            else
                System.out.println("enter a value between $1000 and $1M");

        }
        while(true){
            System.out.print("Annual Intrest rate: ");
            annualIntrest=scanner.nextFloat();
            if(annualIntrest<=30&&annualIntrest>0) {
                monthlyIntrest=annualIntrest/percentage/months_in_year;
                break;
            }
            else
                System.out.println("Enter a value between 0 and 30");
        }

        while (true){
            System.out.print("Years: ");
            years=scanner.nextByte();
            if(years>=1&&years<=30) {
                numberOfPayments = years * months_in_year;
                break;
            }
            System.out.println("enter a value between 1 and 30");
        }

        double mortage= principal
                *(monthlyIntrest * Math.pow(1+monthlyIntrest,numberOfPayments))
                /(Math.pow(1+monthlyIntrest,numberOfPayments)-1);
        String final_value= NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: "+final_value);

//        Scanner scanner=new Scanner(System.in);
//        System.out.print("principal: ");
//        long principal=scanner.nextLong();
//        System.out.print("Annual Intrest rate:");
//        double intrest=scanner.nextDouble();
//        System.out.print("period: ");
//        int period= scanner.nextInt();
//        double mortage= principal * (   (  intrest * ( Math.pow( ( 1+intrest ) ,period ) ) ) / ( (Math.pow( ( 1+intrest ) , period1) ) - 1 ) );
//        System.out.println("Mortage: "+mortage);

    }
}