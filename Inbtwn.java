import java.util.Scanner;
public class Inbtwn {

	public static void main(String[] args) {
		System.out.println("Enter the three numbers:");
		Scanner In=new Scanner(System.in);
		int a=In.nextInt();
		int b=In.nextInt();
		int c=In.nextInt();
		if((a>b)&&(b>c)||(c>b)&&(b>a)) {
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
