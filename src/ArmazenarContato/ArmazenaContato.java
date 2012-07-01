package ArmazenarContato;

import java.util.ArrayList;
import java.util.List;

import contato.Amigos;
import contato.Contato;
import contato.Familia;
import contato.Profissional;

public class ArmazenaContato {
	
	private List<Amigos> amigos;
	private List<Profissional> profissiona ;
	private List<Familia> familia;

	public ArmazenaContato(){
		
		List<Amigos> amigos = new ArrayList<Amigos>();
		List<Profissional> profissiona = new ArrayList<Profissional>() ;
		List<Familia> familia = new ArrayList<Familia>();
		
	}
	
	
	
	public List<Amigos> getAmigos() {
		return amigos;
	}



	public void setAmigos(List<Amigos> amigos) {
		this.amigos = amigos;
	}



	public List<Profissional> getProfissiona() {
		return profissiona;
	}



	public void setProfissiona(List<Profissional> profissiona) {
		this.profissiona = profissiona;
	}



	public List<Familia> getFamilia() {
		return familia;
	}



	public void setFamilia(List<Familia> familia) {
		this.familia = familia;
	}



	public void adicionaAmigo(Amigos amigo ){
		
		this.getAmigos().add(amigo);
	
	}
	
	public void adicionaFamilia(Familia familia ){
		
		this.getFamilia().add(familia);
	
	}

	public void adicionaProfissional(Profissional profissional ){
		
		this.getProfissiona().add(profissional);
	
	}
}
