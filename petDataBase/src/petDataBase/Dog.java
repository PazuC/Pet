package petDataBase;

public class Dog implements Animals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Woof woof");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println( "Dog is Moving");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Woof.... woof");
	}

	@Override
	public void shower() {
		// TODO Auto-generated method stub
		System.out.println("WOOOOOOOOOF");
	}

}
