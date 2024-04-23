import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Age: ");
        byte age=scanner.nextByte();
        System.out.println("you are "+age);
        System.out.print("Name : ");
        scanner.nextLine();
        String name=scanner.nextLine();/*scanner.next() reads only one token
        i.e character till the first space. Whereas the nextLine() read the entire sentence
        */
        System.out.println(name);
    }
}