package Factories;

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {Service getService();}
	
class Implimentation1 implements Service {

	private Implimentation1() {}
	public void method1() {System.out.println("Implimentation1 method1");}
	public void method2() {System.out.println("Implimentation1 method2");}
	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {return new Implimentation1();}
	};
}

class Implimentation2 implements Service {

	private Implimentation2() {}
	public void method1() {System.out.println("Implimentation2 method1");}
	public void method2() {System.out.println("Implimentation2 method2");}
	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {return new Implimentation2();}
	};
}

public class Factories {
	
	public static void serviceConsumer (ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer (Implimentation1.factory);
		//Реализации полностью взаимозаменяемы
		serviceConsumer (Implimentation2.factory);
	}

}
