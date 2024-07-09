import java.util.Scanner;

public class Lab_4_21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter value :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("place index:");
		int p=sc.nextInt();

		System.out.println("insert value:");
		int v=sc.nextInt();

        int ar[] = new int[n+1];
		for(int i=0;i<p;i++){
                ar[i]=arr[i];
                
		}
		ar[p]=v;
		for(int i=p+1;i<n+1;i++){
			ar[i]=arr[i-1];
			
		}
		for(int i=0;i<n+1;i++){
			System.out.println(ar[i]);
		}
		

	}
}