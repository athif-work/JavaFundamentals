import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        byte x=1;
        byte y=x;
        x=3;
        System.out.println(y);

        Point point1=new Point(1,1);
        Point point2=point1;
        point1.x=2;
        System.out.println(point2);
    }
}