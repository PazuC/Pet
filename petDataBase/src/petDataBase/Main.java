package petDataBase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase db = new DataBase();
		/*
		 * db.CreateTable(); String sql = "INSERT INTO PET (ID,NAME,PET) " +
		 * "VALUES (1, 'emy', 'Dog');"; db.executeQuery(sql);
		 * 
		 * sql = "INSERT INTO PET (ID,NAME,PET) " + "VALUES (2, 'Billy', 'Cat');";
		 * db.executeQuery(sql);
		 * 
		 * sql = "INSERT INTO PET (ID,NAME,PET) " + "VALUES (3, 'Carlos', 'Fish');";
		 * db.executeQuery(sql);
		 * 
		 * sql = "INSERT INTO PET (ID,NAME,PET) " + "VALUES (4, 'David', 'Bird');";
		 * db.executeQuery(sql);
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("which person do you want to check?");
		String name = scanner.nextLine();

		String pet = db.CheckPet(name);
		System.out.println(pet);

		Animals animals = null; // why null?
		switch (pet.toLowerCase()) {
		case "dog":
			animals = new Dog();
			break;
		case "cat":
			animals = new Cat();
			break;
		case "fish":
			animals = new Fish();
			break;
		case "bird":
			animals = new Bird();
			break;
		}


		String action;
		do {
			System.out.println("what action do you want to see?");
			
			action = scanner.nextLine();
			
			switch (action.toLowerCase()) {
			case "eat":
				animals.eat();
				break;
			case "move":
				animals.move();
				break;
			case "makesound":
				animals.makesound();
				break;
			case "shower":
				animals.shower();
				break;
			case "esc":
				return;
			default:
				System.out.println("it cant do that " + action+ ",what action do you want to see?");
			}
		} while (action.toLowerCase() != "esc");
		
		System.out.println("The programme is over.");
		db.closeConnection();
		scanner.close();
	}
}
