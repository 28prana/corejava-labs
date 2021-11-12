package lab6;
import java.util.*;
public class Q1 {

	@SuppressWarnings("unchecked")
	public static List sortByValue(HashMap<String, Integer> map) {

		List list = new LinkedList(map.entrySet());

		Collections.sort(list, new Comparator() {
			public int compare(Object ref1, Object ref2) {
				return ((Comparable) ((Map.Entry) (ref1)).getValue()).compareTo(((Map.Entry) (ref2)).getValue());
			}
		});
		return list;

	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("P", 40);
		map.put("O", 50);
		map.put("R", 60);

		List<?> list = sortByValue(map);
		System.out.println(list);

	}

}

//SHRUTI KORADE