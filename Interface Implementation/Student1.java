public class Student1 extends Human implements Dancer{
	public void read(){
		System.out.println(this+" reading");
	}
	public void write(){
		System.out.println(this+" writing");
	}
	@Override
	public void dance(){
		System.out.println(this+" Student dancing");
	}
}