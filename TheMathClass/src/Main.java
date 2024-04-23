
public class Main {
    public static void main(String[] args) {
        int result=Math.round(1.1F);
        System.out.println(result);
        result=(int)Math.ceil(1.1);
        System.out.println(result);
        result=(int)Math.floor(1.1F);
        System.out.println(result);
        System.out.println(Math.max(1,2));
        System.out.println(Math.min(1,2));
        double result1=Math.random();//generates a random number between 0 and 1
        System.out.println(result1);
        result1=Math.random()*100;//randome number between 0 and 100
        System.out.println(result1);
        double result2=Math.round(Math.random()*100);
        System.out.println(result2);
        int result3=(int)Math.round(Math.random()*100);
        System.out.println(result3);
        int result4=(int)Math.random()*100;
        System.out.println(result4);
        result4=(int)(Math.random()*100);
        System.out.println(result4);

    }
}