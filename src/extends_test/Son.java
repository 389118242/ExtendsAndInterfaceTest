package extends_test;

public class Son extends Father {
	public String className="Son";
	@Override
	public void myPrint() {
		System.out.println("(S)this is "+className);
	}
}
