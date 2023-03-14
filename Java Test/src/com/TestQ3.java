package com;
class One{
	
}

class Two extends One{
	
}
public class TestQ3 extends Two{
	public void m1(One o) {
		System.out.println(o);
	}
	public static void main(String[] args) {
		TestQ3 t=new TestQ3();
		t.m1(new One());
		t.m1(new Two());
		t.m1(new TestQ3());
	}
}
