import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        char[] userInput = (obj.next()).toCharArray();
        String output="";
        int count=0;
        for(char c:userInput)
        {
            for(char d:userInput)
            {
                if(c==d)
                    count++;
            }
            if(count==1)
                output+=(""+c);
            count=0;
        }
        System.out.println(output);
    }
}
