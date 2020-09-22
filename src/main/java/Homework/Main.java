package Homework;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static ArrayList<Pets> petList = new ArrayList<Pets>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Hi");
        int numberOfPets = countPets();
        ArrayList<Pets> userPets = listOfPets(numberOfPets);
        for (Pets x : userPets) {
            System.out.println(x.getName() + " says " + x.speak() + ".");
        }
    }
    //Method for how many pets they have.
    public static int countPets(){
        System.out.println("How many pets do you own?");
        return scanner.nextInt();
    }
    //    //Method for the type of pet.
//    public static String getPetName(){
//        System.out.println("How many pets do you own?");
//        return scanner.nextLine();
//    }
    //Method for each pets name.
    public static String getPetTypeInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static String getPetNameInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    //Method that returns the list of pets
    public static ArrayList<Pets> listOfPets(int numberOfPets){
        for(int index = 0; index < numberOfPets; index++){
            String petType = getPetTypeInput("What type of pet do you have?");
            String petName = getPetNameInput("What is your " + petType + "'s name?");
            if(petType.equalsIgnoreCase("Dog")){
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            else if(petType.equalsIgnoreCase("Cat")){
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            else {
                Fish fish = new Fish(petName);
                petList.add(fish);
            }
        }
        return petList;
    }

}