package petDataBase;

public class Fish implements Animals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Booo Boo");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fish is swimming");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Booooo Boooo Booo Booo");
	}

	@Override
	public void shower() {
		// TODO Auto-generated method stub
		System.out.println("Already in water~");
	}

}
