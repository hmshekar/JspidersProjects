package hotel.com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
//		HotelBasedOnRatings h1=new HotelBasedOnRatings();
		Map<Integer,Hotel> map=new LinkedHashMap<Integer,Hotel>();
		Hotel h1=new Hotel("SanthiSagar",4.5);
		Hotel h2=new Hotel("Kapi Katte",3);
		Hotel h3=new Hotel("Krishna",4.8);
		Hotel h4=new Hotel("Tom Hotel",4.4);
		Hotel h5=new Hotel("Meta Hotel",5);
		map.put(1, h1);
		map.put(2, h2);
		map.put(3, h3);
		map.put(4, h4);
		map.put(5, h5);
		Set<Integer> keys=map.keySet();
		List<Hotel> list=new ArrayList<Hotel>();
		for(int key:keys) {
			Hotel x=map.get(key);
			list.add(x);
			if(x.ratings>3) {
				System.out.println("key:"+key+"->"+x);				
			}
		}

	}
}
