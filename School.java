class Student{
int roll_no;
String name;
float marks;
char grade;
}
class School{
public static void main(String[]args)
{
Student student1=new Student();
student1.name="Sreelekha";
student1.roll_no=123;
student1.marks=999;
student1.grade='A';
//accessing the value
System.out.println("Roll no:"+student1.roll_no);
System.out.println("Name:"+student1.name);
System.out.println("Marks:"+student1.marks);
System.out.println("Grade:"+student1.grade);
Student student2=new Student();
student2.name="Jenny";
student2.roll_no=124;
student2.marks=998;
student2.grade='B';
//accessing the value
System.out.println("Roll no:"+student2.roll_no);
System.out.println("Name:"+student2.name);
System.out.println("Marks:"+student2.marks);
System.out.println("Grade:"+student2.grade);
Student student3=new Student();
student3.name="Sree";
student3.roll_no=125;
student3.marks=997;
student3.grade='C';
//accessing the value
System.out.println("Roll no:"+student3.roll_no);
System.out.println("Name:"+student3.name);
System.out.println("Marks:"+student3.marks);
System.out.println("Grade:"+student3.grade);
}
}


