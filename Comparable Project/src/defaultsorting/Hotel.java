package defaultsorting;

public class Hotel implements Comparable<Hotel>{
	String name;
	Double ratings;//Wrapper Class declaration 
	Hotel(String name,double ratings){
		this.name=name;
		this.ratings=ratings;
	}
	@Override
	public String toString() {
		return "Name:"+name+", Ratings:"+ratings;
	}
	@Override
	public int compareTo(Hotel h) {
		return  this.ratings.compareTo(h.ratings);
	}
}
/** this -> object to be inserted h-> already existing object
- to compare String object and double object we are taking the help of 
CompareTo() of String class and CompareTo() of Double class

				1. String Comparison -> name
			Ascending order -> return this.name.compareTo(h.name);
			Descending order -> return h.name.compareTo(this.name);

			2.Double Comparison -> ratings
		Ascending Order -> return this.ratings.compareTo(h.ratinge)
		descending Order -> return h.ratings.compareTO(this.ratings)
*/
