package interface_test;

public class Dog implements Pet{
	public String name="Dog";
	@Override
	public void sleep() {
		System.out.println("name="+name);
	}

}
