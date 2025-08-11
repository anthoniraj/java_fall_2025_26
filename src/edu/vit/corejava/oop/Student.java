package edu.vit.corejava.oop;

public class Student {
   String name;
   String regNo;

   // toString() gives a string representation of the object
   public String toString() {
      return name + " - " + regNo;
   }

   public static void main(String[] args) {
      Student s1 = new Student(); // creating object
      s1.name = "Arun Kumar";
      s1.regNo = "24BCE0045";
      System.out.println(s1.toString()); // Output: Arun Kumar - 23BCE0045
   }
}

/* 
public class Main() {
   public static void main(String[] args) {
      Student s1 = new Student(); // creating object
      s1.name = "Arun Kumar";
      s1.regNo = "24BCE0045";
      System.out.println(s1.toString()); // Output: Arun Kumar - 24BCE0045
   }
}
// The above code is commented out to avoid confusion, 
//as the main method is already defined in the Student class.
*/


