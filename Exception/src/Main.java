
public class Main {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
        }
        try{
            int num=Integer.parseInt("hai");
            System.out.println(num);

        }
        catch (NumberFormatException e){
            System.out.println("String cannot be integer");
        }
        try{
            int a[]=new int[5];
            a[7]=10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds");
        }
        //MultiCatch
         try {
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arary out of bounds");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        System.out.println("Handled");

    }
}
