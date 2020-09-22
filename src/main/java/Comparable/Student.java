package Comparable;

class Student implements Comparable<Student>{
    int idNum;
    String name;
    int age;
    Student(int idNum,String name,int age){
        this.idNum=idNum;
        this.name=name;
        this.age=age;
    }
//Compares the ages of all the students and orders them youngest to oldest.
    public int compareTo(Student student){
        if(age==student.age)
            return 0;
        else if(age>student.age)
            return 1;
        else
            return -1;
    }
}