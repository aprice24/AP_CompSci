package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	boolean sleep;
	
	public Dog() {
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
	}
	
	public Dog(String n) {
		name = n;
		age = 1;
		breed = new String("dog dog");
	}
	
	public Dog(String n, String b) {
		name = n;
		age = 1;
		breed = b;
	}
	
	public Dog(String n, int a) {
		name = n;
		age = a;
		breed = new String("dog dog");
	}
	
	////
	
	public void setName(String dogName){
		name = dogName;
		return;
	}
	
	public void setAge(int dogAge){
		age = dogAge;
		return;
	}
	
	public void setBreed(String dogBreed){
		breed = dogBreed;
		return;
	}
	
	////
	
	public String getName(){
		return name;
	}
	
	public int setAge(){
		return age;
	}
	
	public String setBreed(){
		return breed;
	}
	
	////
	
	public boolean isSleeping(){
        Random random = new Random();
        sleep = random.nextBoolean();
        if(true){
            System.out.println(name + " barks!");
        }
        if(false){
            System.out.println(name + " barks!");
        }
        else{
        }
        return sleep;
	}
	
	public void bark(){
		System.out.println(name + " barks!");
	}
	
	public void dogToString(){	
		System.out.println("---------");
		System.out.println("Dog Name: " + name);
		System.out.println("Dog Age: " + age);
		System.out.println("Dog Breed: " + breed);
		System.out.println("---------");
		System.out.println("");
	}
}
