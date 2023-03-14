package defaultsorting;

import java.util.TreeSet;
public class SortHotel {
	public static void main(String[] args) {
		TreeSet<Hotel> t=new TreeSet<Hotel>();
		Hotel h1=new Hotel("SanthiSagar",4.5);
		Hotel h2=new Hotel("Kapi Katte",3);
		Hotel h3=new Hotel("Krishna",4.8);
		Hotel h4=new Hotel("Tom Hotel",4.4);
		Hotel h5=new Hotel("MetaX Hotel",5);
		t.add(h5);
		t.add(h2);
		t.add(h4);
		t.add(h1);
		t.add(h3);
		t.add(h4);
		for(Hotel h:t) {
			System.out.println(h);
		}
	}
}
