import java.util.*;

class Main {
  public static void main(String[] args) {

    ArrayList<Student> studentlist = new ArrayList<>();

    Student s1 = new Student(40,"ROhan");
    Student s2 = new Student(30,"Namu");
    Student s5 = new Student(40,"Abhishek");
    Student s3 = new Student(70,"Siddharth");
    Student s4 = new Student(80,"Rohan");

    studentlist.add(s1);
    studentlist.add(s2);
    studentlist.add(s3);
    studentlist.add(s4);studentlist.add(s5);

    studentlist.forEach(System.out::println);
    System.out.println("After Sorting ------------------");
    Collections.sort(studentlist, new Comparator<Student>(){
      @Override
      public int compare(Student o1,Student o2)
      {
        if(o1.name.equals(o2.name))
            return o1.marks - o2.marks;
        else
            return o1.name.compareTo(o2.name);
      }

    } );
    
    studentlist.forEach(System.out::println);

  }
}

class Student 
{
  int marks;
  String name;

  Student(int m,String n)
  {
    this.marks = m;
    this.name=n;
  }

  @Override
  public String toString(){
    return "Student [marks = "+ marks + ", name = " + name +"]"; 
  }
}


