import java.util.*;

public class javaEOF {

    public static void main(String[] args) {
        Scanner line_reader=new Scanner(System.in);
        int x=1;
        while (line_reader.hasNextLine()){
            String lines = line_reader.nextLine();
            System.out.println(x +" "+ lines);
            x++;
        }
    line_reader.close();
    }
}