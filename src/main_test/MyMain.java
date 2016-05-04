package main_test;

import extends_test.Father;
import extends_test.Son;
import interface_test.Dog;
import interface_test.Pet;

public class MyMain {
	public static void main(String[] args) {
		System.out.println("Entends");
		Father f=new Son();
		Son s=new Son();
		f.myPrint();	
		System.out.println("Father f=new Son();f.className="+f.className);
		System.out.println("Son s=new Son();d.className="+s.className);
		System.out.println("---------------------------");
		System.out.println("Interface");
		Pet p=new Dog();
		Dog d=new Dog();
		p.sleep();
		System.out.println("Pet p=new Dog();p.name="+p.name+"   ((Dog)p).name="+((Dog)p).name);
		System.out.println("Dog d=new Dog();d.name="+d.name);
	}
}
