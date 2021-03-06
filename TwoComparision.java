import java.util.*;

class Main {
  public static void main(String[] args) {

    ArrayList<Student> studentlist = new ArrayList<>();

    Student s1 = new Student(90,"Rohan");
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
    
  
    // First compare with name then marks 
    Collections.sort(studentlist,Comparator.comparing(Student::getName).thenComparing(Student::getMarks));

  //Reverse Order    
    Collections.sort(studentlist,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());


  //Two Time reverse first name and Marks
      Collections.sort(studentlist,Comparator.comparing(Student::getName).reversed().thenComparing(Student::getMarks).reversed());


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

  public int getMarks() {
    return this.marks;
}
public String getName() {
return this.name;
}



  @Override
  public String toString(){
    return "Student [marks = "+ marks + ", name = " + name +"]"; 
  }
}


