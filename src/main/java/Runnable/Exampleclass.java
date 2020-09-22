package Runnable;
/*
Java runnable is an interface used to execute code on a concurrent thread. It is an
interface which is implemented by any class if we want that the instances of that class should be executed by a thread.
The runnable interface has an undefined method run() with void as return type,
and it takes in no arguments.
This method takes in no arguments. When the object of a class
implementing Runnable class is used to create a thread, then the run method is invoked in the thread which executes separately.

A thread is a series of executed statements
 */
public class Exampleclass implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        Exampleclass example = new Exampleclass();
        Thread t1= new Thread(example);
        t1.start();
        System.out.println("Hi");
    }
}