import java.io.*;
public class Main {
    public static void main(String[] args) {


        //writing to a file


    try{
        BufferedWriter bw=new BufferedWriter(
                new FileWriter("/Users/athifahamedpv/Desktop/JAVA/output.txt"));
        bw.write("Athif ");
        bw.write("Ahamed ");
        bw.write("P V");
        bw.close();
    }
    catch (Exception e){
        return;
    }



    //reading from a file



    try {
        BufferedReader br = new BufferedReader(
                new FileReader( "/Users/athifahamedpv/Desktop/JAVA/output.txt" ) );
        String s;
        while( ( s=br.readLine() )!=null )
        {
            System.out.println(s);
        }
    }
    catch (Exception e){
        return;
    }



//copying to another file



        try {
            BufferedWriter b=new BufferedWriter(
                    new FileWriter("/Users/athifahamedpv/Desktop/JAVA/output_copy.txt") );
            BufferedReader br = new BufferedReader(
                    new FileReader( "/Users/athifahamedpv/Desktop/JAVA/output.txt" ) );
            String s;
            while( ( s=br.readLine() )!=null )
            {
                b.write(s+"\n");
            }
            br.close();
            b.close();
        }
        catch (Exception e){
            return;
        }
    }
}