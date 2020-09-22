package Serializable;

import java.io.Serializable;
//Student class implements Serializable interface. Now its objects can be converted into stream.
//The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream.
// Only objects that support the java.io.Serializable interface can be written to streams.
public class Student implements Serializable{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
