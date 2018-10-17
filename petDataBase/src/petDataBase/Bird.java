package petDataBase;

public class Bird implements Animals{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Yummmm");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bird is Flying");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Gee Geee Geeee");
	}

	@Override
	public void shower() {
		// TODO Auto-generated method stub
		System.out.println("I DON'T NEED!!!!");
	}

}
