package jswitch;
class student{
	int rollnumber;
	int marks;
	String Name;
}

public class Jtbv32 {

	public static void main(String[] args) {
		
//		Example of creating multiple object of a class 
		student st1 = new student();
		st1.Name = "Kunal";
		st1.rollnumber = 23;
		st1.marks = 93;
		
		student st2 = new student();
		st2.Name = "Sandeep";
		st2.rollnumber = 24;
		st2.marks = 98;
		
		student st3 = new student();
		st3.Name = "Jitendar";
		st3.rollnumber = 25;
		st3.marks = 95;
		
		System.out.println(st1);// this will not print the value in the object st1 rather it will print the object s1;
		System.out.println(st1.Name+" "+st1.rollnumber+" "+st1.marks);//this is the correct way of getting the value of the instance variable
		System.out.println(st2.Name+" "+st2.rollnumber+" "+st2.marks);//this is the correct way of getting the value of the instance variable
		System.out.println(st3.Name+" "+st3.rollnumber+" "+st3.marks);//this is the correct way of getting the value of the instance variable
		
		System.out.println("----- SEPARATOR TEXT -----");
		
//		We can also create array of an object instead of creating object again and again
		student stu[] = new student[3];
		stu[0] = st1;
		stu[1] = st2;
		stu[2] = st3;
		
		for (int i=0;i<stu.length;i++) {
			System.out.println(stu[i].Name+" "+stu[i].rollnumber+" "+stu[i].marks);
		}

	}

}
