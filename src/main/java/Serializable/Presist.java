package Serializable;
/*
Serialization in Java is a mechanism of writing the state of an object into
a byte-stream. It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
For serializing the object, we call the writeObject() method ObjectOutputStream, and
for deserialization we call the readObject() method of ObjectInputStream class.
 */
import java.io.*;
class Persist{
    public static void main(String args[]){
        try{
            //Creating the object
            Student s1 =new Student(211,"ravi");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }
}