import java.util.Scanner;
class Lab_6_35{
	public static void main(String[] args) {
		
			Student_Imfo stu=new Student_Imfo();
			stu.display();
		
	}

}
class Student_Imfo{
	int eno;
	String name;
	int semester;
	double cpi;
		Scanner sc= new Scanner(System.in);

	Student_Imfo(){
        // this.id=id;
        // this.name=name;
        // this.designation=designation;
        // this.salary=salary;

        System.out.print("enter Enrolment no. :");
		 eno=sc.nextInt();

		System.out.print("enter name :");
		 name=sc.next();

		System.out.print("enter semester :");
		 semester=sc.nextInt();

		System.out.println("enter cpi :");
		 cpi=sc.nextDouble();
	}
	void display(){
        System.out.println("Id="+this.eno);
        System.out.println("name="+this.name);
        System.out.println("semester="+this.semester);
        System.out.println("cpi="+this.cpi);
	}
}