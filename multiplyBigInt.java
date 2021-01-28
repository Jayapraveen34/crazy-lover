/*
T.C
    99999 99998
    9999700002
*/
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine())
        {
         String inp[] = input.nextLine().split(" ");
         BigInteger a = new BigInteger(inp[0]); 
         BigInteger b = new BigInteger(inp[1]); 
         System.out.print(a.multiply(b));
        }
    }
}
