package com.kiran;

class Add<T> {

	@SuppressWarnings("unchecked")
	public T add(int a, int b, Class<T> t) {
		int c = a + b;
		Integer sc = new Integer(c);
		return (T) sc.toString();
	}
}

public class Demo {
	public static void main(String[] args) {
		Add a = new Add();
		Object add = a.add(5, 6, Integer.class);
		System.out.println(add);
//		System.out.println("kiran");
	}

}
