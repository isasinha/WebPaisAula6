package base;
import java.util.ArrayList;

public class TestePais {

	public static void main(String[] args) {
				
		PaisService paisService = new PaisService();
		Pais pais = new Pais();
		ArrayList<Pais> vet = new ArrayList<Pais>();
						
		pais = paisService.maiorPop();
		System.out.println("O pais com maior populacao eh: " + pais);
		
		pais = paisService.menorArea();
		System.out.println("O pais com menor area eh: " + pais);
		
		vet = paisService.vetPais();
		
		for(Pais p:vet) {
			System.out.println(p);
		}
		
	}
}
