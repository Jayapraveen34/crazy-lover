import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine())
        {
        String[] userInput;
           userInput=input.nextLine().split(" ");
        String output="";
        int count=0;
        for(String c:userInput)
        {
            for(String d:userInput)
            {
                if(c.equals(d))
                    count++;
            }
            if(count==1)
                output+=(" "+c);
            count=0;
        }
        System.out.println(output.trim());
        }
    }
}
