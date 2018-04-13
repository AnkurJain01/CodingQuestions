import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class TwoCharacters {

	static int twoCharaters(String s) {
		// Complete this function
		boolean isConcurrent = true;
		Map<Character, Integer> charMap = new TreeMap<Character, Integer>();
		while (isConcurrent) {
			boolean continueLoop = true;
			for (int i = 0; i < s.length() - 1; i++) {
				if (charMap.containsKey(s.charAt(i))) {
					charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
				} else {
					charMap.put(s.charAt(i), 1);
				}
				if (s.charAt(i) == s.charAt(i + 1)) {
					s = s.replace(s.substring(i, i + 1), "");
					continueLoop = false;
					charMap = new HashMap<>();
					break;
				}
			}

			if (continueLoop)
				isConcurrent = false;
		}

		if (charMap.size() > 2) {
			Map<Character, Integer> sortedMap = sortByValues(charMap);
			for (Entry<Character, Integer> charEntry : charMap.entrySet()) {
				for (int i = 0; i < s.length() - 1; i++) {
					if (charMap.containsKey(s.charAt(i))) {
						charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
					} else {
						charMap.put(s.charAt(i), 1);
					}
					if (s.charAt(i) == s.charAt(i + 1)) {
						charMap = new HashMap<>();
						break;
					}
				}
			}
		}

		return s.length();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		String s = in.next();
		int result = twoCharaters(s);
		System.out.println(result);
		in.close();
	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k1).compareTo(map.get(k2));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}
}
