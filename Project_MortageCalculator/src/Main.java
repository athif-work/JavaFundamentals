import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months_in_year=12;
        final byte percentage=100;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Principal: ");
        int principal=scanner.nextInt();
        System.out.print("Annual Intrest rate: ");
        float annualIntrest=scanner.nextFloat();
        float monthlyIntrest=annualIntrest/percentage/months_in_year;
        System.out.print("Years: ");
        byte years=scanner.nextByte();
        int numberOfPayments=years*months_in_year;
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