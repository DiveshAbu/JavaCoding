
public class FindMissingNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		System.out.println("missing number is " + (GetMissingNumber(a)));

	}

	public static int GetMissingNumber(int[] a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];// 12
		}
		int totalsum = 0;
		for (int j = 1; j <= 5; j++) {

			totalsum = totalsum + j;// 15

		}
		return totalsum - sum;

	}

}
