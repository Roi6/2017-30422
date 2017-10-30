import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		String username = name.nextLine();
		Musician user0 = new Musician(username);
		System.out.println(user0.getUsername(username));
		user0.setInstrument(GUITAR);
		
	
	}

}
