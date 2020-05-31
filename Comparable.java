import java.util.*;

class Main {
  public static void main(String[] args) {

    ArrayList<Student> studentlist = new ArrayList<>();

    Student s1 = new Student(40,"ROhan");
    Student s2 = new Student(30,"Namu");
    Student s5 = new Student(40,"Abhishek");
    Student s3 = new Student(70,"Siddharth");
    Student s4 = new Student(80,"Varun");

    studentlist.add(s1);
    studentlist.add(s2);
    studentlist.add(s3);
    studentlist.add(s4);studentlist.add(s5);

    studentlist.forEach(System.out::println);
    System.out.println("After Sorting ------------------");
    Collections.sort(studentlist);
    studentlist.forEach(System.out::println);

  }
}

class Student implements Comparable<Student>
{
 private int marks;
 private String name;

  Student(int m,String n)
  {
    this.marks = m;
    this.name=n;
  }

  @Override
  public String toString(){
    return "Student [marks = "+ marks + ", name = " + name +"]"; 
  }
  @Override
  public int compareTo(Student o)
  {
      // Ascending Order
    /*  if(this.marks < o.marks)
        return -1;
      else if(this.marks > o.marks)
        return 1;

        return 0;
    */

      // if marks are same then sort according to name

      if(this.marks < o.marks)
        return -1;
      else if(this.marks > o.marks)
        return 1;
      return this.name.compareTo(o.name);
  }

}
