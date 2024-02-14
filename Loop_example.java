import java.util.*;
class Loop_examaple{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int sum = 0;
            int total = 0;
            int base = 2;
            int res = 0;
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                res = (int) (Math.pow(base,0));
                sum = a + res*b;
                System.out.print(sum);
                for(int j = 1; j<n; j++){
                    total = sum + ((int) (Math.pow(base,j))*(b));
                    
                    System.out.print(" " + total);
                    sum = total;
                    
                }
                sum = 0;
                total = 0;    
                System.out.println(); 
                    
                
            }
            in.close();
        }
}
