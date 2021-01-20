package main;

public class Start {
	

	public static void main(String[] args) {

		Object ob1 = "Carlos"+35+"Eduardo";
		Object ob2 = 35.00;
		Object ob3 = true;

		System.out.println(ob1.toString());
		System.out.println(ob2.equals(ob3));
		System.out.println(ob3.hashCode());

	}

}
