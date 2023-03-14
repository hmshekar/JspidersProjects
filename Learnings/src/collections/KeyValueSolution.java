package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class KeyValueSolution {
	public static void main(String[] args) {
		KeyValues k1=new KeyValues("Sekar", 3, "Shekar@12344");
		KeyValues k2=new KeyValues("Sekar", 3, "Shekar@12344");
		KeyValues k3=new KeyValues("Sekar", 3, "Shekar@12344");
		Map<KeyValues,Integer> map=new TreeMap<KeyValues,Integer>();
		map.put(k1, 12);
		map.put(k2, 1);
		map.put(k3, 3);
		Set<KeyValues> keys=map.keySet();
		for(KeyValues n: keys) {
			System.out.println(n);
		}
	}
}
