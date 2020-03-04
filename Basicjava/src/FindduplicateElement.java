import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindduplicateElement {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 5, 6, 7 };

		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : a) {

			if (!map.containsKey(num)) {

				map.put(num, 1);
			} else {

				map.put(num, map.get(num)+1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				
				System.out.println(entry.getKey());
			}

		}
		
	}

}
