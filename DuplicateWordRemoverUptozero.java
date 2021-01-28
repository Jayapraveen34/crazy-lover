import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine())
        {
        String[] userInput;
           userInput=input.nextLine().split(" ");
             String output="";
        for(int times=0;times<userInput.length/2;times++)
            {  
                if(times>0)
                    userInput=output.split(" ");
                output="";
             for(int i=0, j=1;i<userInput.length;i++,j++)
                {
        
                    if (j!=userInput.length)
                    {
        
                        if(userInput[i].equals(userInput[j]))
                        {
                            i+=1;
                            j+=1;
                            continue;
                        }
                        
                    }
                    else if(userInput[i-1].equals(userInput[i]))
                    {
                        continue;
                    }
                    output+=(" "+userInput[i]);
                }
            }
            System.out.println(output.trim());
        }
    }
}
