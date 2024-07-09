//Write a program to swap two numbers using user-defines method.
import java.util.Scanner;
class Lab_6_33{
public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.print("a =");
  int a= sc.nextInt();
  System.out.print("b =");
  int b= sc.nextInt();
  swap(a,b);
	

  }
  static void swap(int a,int b){
		int temp =a;
		a=b;
		b=temp;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}

}