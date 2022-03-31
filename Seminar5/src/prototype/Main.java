package prototype;

public class Main {
	public static void main(String[] args) {
		Autobuz a1 = new Autobuz("ftastf", "Andrei");
		Tramvai t1 = new Tramvai("gftaetat", "Gigel");
		
		try {
			MijlocTransport a2 = a1.copiaza();
			MijlocTransport t2 = t1.copiaza();
			
			System.out.println("Original - Autobuz: "+a1);
			System.out.println("Original - Tramvai: "+t1);
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
