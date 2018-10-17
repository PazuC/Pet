package petDataBase;

public class Cat implements Animals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Meeow");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println( "Cat is Moving");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Meow.... Meow.....Meow");
	}

	@Override
	public void shower() {
		// TODO Auto-generated method stub
		System.out.println("Meeeeeeeow NOOOOOOO!!");
	}

}
