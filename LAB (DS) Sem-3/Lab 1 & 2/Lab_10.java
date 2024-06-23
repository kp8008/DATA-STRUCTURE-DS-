import java.util.Scanner;
public class  Lab_10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter days");
		  int n= sc.nextInt();
		  int y = n/365;
		  int w =(n%365)/7;
		  int d = (n%365)%7;
		  System.out.println(+y+"year"+w+"week"+d+"day");
	}
	
} 
