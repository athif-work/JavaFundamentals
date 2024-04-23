
public class Main {
    public static void main(String[] args) {
        //implicit casting(automatic casting)
        short x=1;
        int y=x+1;
        System.out.println(y);
        /*here java creates a variable of type integer in memory and stores the value of x
        in that variable and uses it to evaluate y*.
        smaller data type gets converted to bigger data type in implicit  casting
         */
        //byte-short-int-long-float-double
        String a="1";
        int b=Integer.parseInt(a)+2;
        System.out.println(b);
        String c="1.1";
        double d=Double.parseDouble(c)+1;
        System.out.println(d);

    }
}