package base;
import java.util.ArrayList;

public class PaisService {
	PaisDAO paisDao = new PaisDAO();
	Pais pais = new Pais();
	ArrayList<Pais> vet = new ArrayList<Pais>();

	public int criar(Pais pais) {
		return paisDao.criar(pais);
	}

	public void atualizar() {
		paisDao.atualizar();
	}

	public void excluir() {
		paisDao.excluir();
	}

	public Pais carregar(int id) {
		return paisDao.carregar(id);
	}
	
	public Pais maiorPop(){
		return paisDao.maiorPop();		
	}
	
	public Pais menorArea() {
		return paisDao.menorArea();
	}
	
	public ArrayList<Pais> vetPais() {
		return paisDao.vetPais();
	}
	
	
	
}