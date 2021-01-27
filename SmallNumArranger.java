import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        int[] vals = new int[userInput]; 
        if(obj.hasNextLine())
        {
            String[] elements = (new Scanner(System.in).nextLine()).split(" ");
            
            for(int index=0;index<userInput;index++)    
                vals[index]=Integer.parseInt(elements[index]);
        }
        int value;
        for(int index=0;index<userInput;index++)
        {
        value=-1;
        for(int subIndex=index+1;subIndex<userInput;subIndex++)
            {
            if(vals[index]>vals[subIndex])
                {
                    value=vals[subIndex];
                    break;
                }
            }
        System.out.print(value);
        
        if(index!=userInput-1)
            System.out.print(" ");
        }
    }
}
