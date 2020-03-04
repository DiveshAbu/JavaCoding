import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter a number");
		int num = sc.nextInt();
		System.out.println(getPrimeNumber(num));
	}

	public static boolean getPrimeNumber(int num) {

		if (num <= 1) {//for 1 and (-)

			return false;
		}
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;
			}
		}
		return true;
	}
}
