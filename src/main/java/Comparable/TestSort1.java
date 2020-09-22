package Comparable;
import java.util.*;
/*
Java Comparable interface is used to order the objects of the user-defined class.
This interface is found in java.lang package and contains only one method named compareTo(Object).
It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single
data member only. For example, it may be name, age or anything else.
 */
public class TestSort1{
    public static void main(String args[]){
        ArrayList<Student> Class=new ArrayList<Student>();
        Class.add(new Student(101,"Dallas",19));
        Class.add(new Student(102,"Bob",22));
        Class.add(new Student(103,"Jack",21));

        Collections.sort(Class);
        for(Student st:Class){
            System.out.println(st.idNum+" "+st.name+" "+st.age);
        }
    }
}