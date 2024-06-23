import java.util.Scanner;
public class Lab_9{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter seconds");
		  int n= sc.nextInt();
		   int h = n/3600;
		   int m = (n%3600)/60;
		   int s = (n%3600)%60;
		   System.out.println(+h+"hour"+m+"minutes"+s+"seconds");
	}
}