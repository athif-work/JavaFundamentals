import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result=currency.format(12345.789);
        System.out.println(result);
        NumberFormat percent=NumberFormat.getPercentInstance();
        result=percent.format(0.1);
        System.out.println(result);
        //method chaining
        String result1=NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result1);
    }
}