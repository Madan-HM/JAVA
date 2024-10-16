class Student      
{
    int rollno;
    String name;
    int marks;
}


public class Demostu
{
    public static void main(String[] args)
    {
        Student s1 = new Student();  //created object for class Student with reference variable like s1,s2,s3

        s1.rollno=1;
        s1.name="manu";
        s1.marks=34;

        Student s2 = new Student();

        s2.rollno=2;
        s2.name="anu";
        s2.marks=67;

        Student s3 = new Student();

        s3.rollno=3;
        s3.name="banu";
        s3.marks=48;

        Student students[]=new Student[3]; //int a[]=new int [3]

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student n:students)
        {
            System.out.println(n.rollno + " - " + n.name + " : " + n.marks);
        }


    }
} 