import java.util.Scanner;

public class Ecuaciones {

	public static void main(String[] args) {
	
		int a;
		int b;
		int c;
		int x;
		int y;
		
		Scanner input = new Scanner(System.in);
        System.out.println("Get numbers:");
		 a=input.nextInt();
		 b=input.nextInt();
		 c=input.nextInt();
		 x=input.nextInt();
		 y=input.nextInt();
		 double result=(3+4*x)/5-10*(y-5)*(a+b+c)/x+9* (4/x)+ (9+x)/y ;
	
		System.out.println(result);

	}

}
