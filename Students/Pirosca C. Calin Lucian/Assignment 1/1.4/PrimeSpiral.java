//Drawing a '1' on a paper, one can see that we need +2 to reach 3, +4 to reach 5, +6 to reach 7 and +8 to reach 9.
//That is a 3x3 matrix. Continuing from the new numbers on those diagonals, one can see that we need +10 to reach 13, +12 to reach 17, 
//+14 to reach 21 and +16 to reach 25. We now have the diagonals for a 5x5 matrix. In order to find that ratio one shall not be building the
//whole matrix but only the diagonals. Answer : for side length 26241 the ratio is 9.9998.
public class PrimeSpiral {

	public static void main(String args[]) {
		int primeCount = 0, count = 1, diagNumber[] = { 1, 1, 1, 1 };
		double ratio = 100;
		for (int index = 1; ratio > 10;) {
			diagNumber[0] += 2 * index; // 1 + 2 = 3, 3 + 10 = 13, 13 + 18 = 31 
			index++;
			if (isPrime(diagNumber[0]))
				primeCount++;
			diagNumber[1] += 2 * index; // 1 + 4 = 5, 5 + 12 = 17 and so on 
			index++;
			if (isPrime(diagNumber[1]))
				primeCount++;
			diagNumber[2] += 2 * index; // 1 + 6 = 7, 7 + 14 = 21 and so on
			index++;
			if (isPrime(diagNumber[2]))
				primeCount++;
			diagNumber[3] += 2 * index; // 1 + 8 = 9, 9 + 16 = 25 and so on
			index++;
			if (isPrime(diagNumber[3]))
				primeCount++;
			count += 4;
			ratio = ((double) primeCount / count) * 100;
		}
		System.out.println("Side length is : " + (count / 2 + 1));
	}

	public static boolean isPrime(int number) {
		int ok = 1;
		for (int index = 2; index <= Math.sqrt(number) && ok == 1; index++) {
			if (number % index == 0) {
				ok = 0;
			}
		}
		if (ok == 1)
			return true;
		else
			return false;
	}

}
