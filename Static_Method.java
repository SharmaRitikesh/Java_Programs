
import java.util.*;

public class Static_Method {
    static boolean flag = true;
    static int B;
    static int H;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
        input.close();
    }
    
}
