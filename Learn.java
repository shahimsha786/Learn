package com.add;

public class Learn {

	public int add2(int x, int y) {
		return x*y;
	}
	public static void main(String[] args) {
		Learn add2=new Learn();
		int z=add2.add2(4, 7);
		System.out.println("addition of two numbers is  "+z);

	}

}
