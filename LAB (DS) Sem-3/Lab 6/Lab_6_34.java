import java.util.Scanner;
class Lab_6_34{
	public static void main(String[] args) {
		
			Employee_Imfo emp=new Employee_Imfo();
			emp.display();
		
	}

}
class Employee_Imfo{
	int id;
	String name;
	String designation;
	double salary;
		Scanner sc= new Scanner(System.in);

	Employee_Imfo(){
        // this.id=id;
        // this.name=name;
        // this.designation=designation;
        // this.salary=salary;

        System.out.println("enter id :");
		 id=sc.nextInt();

		System.out.println("enter name :");
		 name=sc.next();

		System.out.println("enter designation :");
		 designation=sc.next();

		System.out.println("enter salary :");
		 salary=sc.nextInt();
	}
	void display(){
        System.out.println("Id="+this.id);
        System.out.println("name="+this.name);
        System.out.println("designation="+this.designation);
        System.out.println("Salary="+this.salary);
	}
}