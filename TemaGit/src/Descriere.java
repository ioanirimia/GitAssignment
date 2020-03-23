
public class Descriere implements Transport{

	private int numarStatii;
	private String Cartier;
	
	
	public Descriere(int numarStatii, String cartier) {
		super();
		this.numarStatii = numarStatii;
		Cartier = cartier;
	}


	@Override
	public void metrou() {
		System.out.println("Mijloc de transport ales: Metrou");
		
	}


	@Override
	public void autobuz() {
		System.out.println("Mijloc de transport ales: Autobuz");
		
	}
}