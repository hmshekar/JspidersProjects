package collections;

public class KeyValues {
	String name;
	int id;
	String pw;
	long num;
	KeyValues(String name,int id,String pw){
		this.id=id;
		this.name=name;
		this.pw=pw;
	}
	@Override
	public String toString() {
		return "name:"+name+",id:"+id+",pw:"+pw;
	}
}
