import java.util.*;

public class Student
{
    
    public class Array
    {
       
    }        

     public static void main(String args[])
     {
        ArrayList<Student> alist = new ArrayList<Student>();
        
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        
        // adding objects using add() method
        alist.add(a);
        alist.add(b);
        alist.add(c);
        
//        alist.add("David");
//        alist.add("Emma");
//        alist.add("Daniel");
//        alist.add("Eliabeth");
//        alist.add("Tina");
        
//        // displaying elements
//        System.out.print(alist); 
        
        // to print out size of ArrayList
        int str = alist.size();
        System.out.print("\nSize = " + str); 
        
        // Iterating ArrayList
        for(Student st : alist)
        {
          System.out.print("\nIterator = " + st);
        }    
        
     }        

}