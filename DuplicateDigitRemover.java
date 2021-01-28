import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        char[] userInput = (obj.next()).toCharArray();
        String output="";
        for(int i=0, j=1;i<userInput.length;i++,j++)
        {
            if (j!=userInput.length)
            {
                if(userInput[i]==userInput[j])
                {
                    i+=1;
                    j+=1;
                    continue;
                }
                
            }
            else if(userInput[i-1]==userInput[i])
            {
                continue;
            }
        }
        System.out.println(output);
    }
}
