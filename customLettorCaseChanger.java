/*
T.C
  hello 
  2 
  2 
  hElLo 
T.C
    ProFiLe
    1
    2
    Profile
  
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int caseType=input.nextInt();
        int index = input.nextInt();
        int tempVar;
        String output="";
        int multipliers=index;
        for(int pos=0;  pos<word.length();  pos++)
        {
            tempVar=(int)word.charAt(pos);
            if((multipliers-1) ==pos)
            {
                if(caseType==1 && tempVar<97)
                    tempVar+=32;
                
                else if((caseType==2)&&(tempVar>96))
                    tempVar-=32;
                    
                multipliers+=index;
            }
            output+=(""+(char)tempVar);
            
        }
        System.out.print(output);
    }
}
