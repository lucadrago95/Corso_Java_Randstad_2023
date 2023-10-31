package oop;

public class Main {

	public static void main(String[] args) {
		
		Smartphone sm1 = new Smartphone();
		
		sm1.setImei("numero imei: 123123123");
		sm1.setMarca("Apple");
		sm1.setModello("iphone 11 pro");
//		sm1.setSchermo("380px");
		
		Smartphone sm2 = new Smartphone();
		
		sm2.setImei("numero imei: 5434534534");
		sm2.setMarca("Samsung");
		sm2.setModello("zFold 4");
//		sm2.setSchermo("540px");
		
		System.out.println(sm1.getImei());
		System.out.println(sm1.getMarca());
		System.out.println(sm1.getModello());
		
		System.out.println(sm2.getImei());
		System.out.println(sm2.getMarca());
		System.out.println(sm2.getModello());
		
		System.out.println(sm1.accensione(sm1.getMarca())+" "+sm1.getModello());
		System.out.println(sm1.accensione(sm2.getMarca())+" "+sm2.getModello());
		
		Display dis1 = new Display();
//		dis1.dimensioniSchermo("380px");
		
		System.out.println();
	
	}

}
