
public class CompareTwoArray {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 2, 4, 6, 8, 10 };

		System.out.println(CompareResult(arr1, arr2));

	}

	public static boolean CompareResult(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length) {

			return false;
		}
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i]) {

				return false;
			}
		}
		return true;
	}

}
