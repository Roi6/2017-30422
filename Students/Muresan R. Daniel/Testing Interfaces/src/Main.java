import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Phone s7 = new Phone(5.1f, 4, 15);
		Champion garen = new Champion(150, 80, 50);

		System.out.printf("The phone had %.1f display size, %d ram capacity and %d camera resolution before upgrade.\n",
				s7.getDisplaySize(), s7.getRamCapacity(), s7.getCameraResolution());
		System.out.printf("The champion had %d attack damage,%d armor and %d stamina before upgrade.\n",
				garen.getAttackDamage(), garen.getArmor(), garen.getStamina());

		s7.upgrade();
		garen.upgrade();

		System.out.printf("The phone had %.1f display size, %d ram capacity and %d camera resolution after upgrade.\n",
				s7.getDisplaySize(), s7.getRamCapacity(), s7.getCameraResolution());
		System.out.printf("The champion had %d attack damage,%d armor and %d stamina after upgrade.\n",
				garen.getAttackDamage(), garen.getArmor(), garen.getStamina());

		Book[] booksArray = new Book[5];
		Book book1 = new Book("A song of ice and fire", "George RR Martin", 532);
		Book book2 = new Book("Ion", "Liviu Rebreanu", 313);
		Book book3 = new Book("Mara", "Ioan Slavici", 215);
		Book book4 = new Book("Harry Potter:The philosopher stone", "J.K Rowling", 630);
		Book book5 = new Book("Amintiri din copilarie", "Ion Creanga", 144);
		booksArray[0] = book1;
		booksArray[1] = book2;
		booksArray[2] = book3;
		booksArray[3] = book4;
		booksArray[4] = book5;
		System.out.println("\nBooks array before sorting:");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s-%s-%d   ", booksArray[i].getTitle(), booksArray[i].getAuthor(),
					booksArray[i].getNrOfPages());
		}

		Arrays.sort(booksArray);

		System.out.println("\nBooks array after sorting on number of pages:");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s-%s-%d   ", booksArray[i].getTitle(), booksArray[i].getAuthor(),
					booksArray[i].getNrOfPages());
		}

	}

}
