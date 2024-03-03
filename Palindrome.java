import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String A=sc.next();
    String rev="";
    int len=A.length();
    for(int j=len-1;j>=0;j--){
        rev+=A.charAt(j);
    }
    System.out.println("Reversed String: "+rev);
     if(A.equals(rev)){
        System.out.println("Yes, Entered String is a Palindrome");
    }
    else{
        System.out.println("No, Entered String is not a Palindrome");
    }
    sc.close();
}
}