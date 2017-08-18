package interfaceDemo;

public class cat implements Animal, interfaceTwo{

	@Override
	public void sound() {
		System.out.println("entered into sound");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("entered into eat");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
