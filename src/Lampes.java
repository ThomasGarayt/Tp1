
public class Lampes {
	public int Puissance;
	private boolean estAllumée;
	public final static int Puissance_defaut = 100 ;

	public void eteindre() {
		this.estAllumée = false ;
		
	}
	
	public void allumer() {
		this.estAllumée = true ; 
	}
	
	
	public Lampes(){
		this.Puissance = Puissance_defaut ;
		this.estAllumée = false ;
	}
	
	public Lampes(int Puissance0){
		this.Puissance = Puissance0 ;
		this.estAllumée = false ;
	}
	
	
	public int getPuissance () {
		return this.Puissance ;
	}
	
	public void setPuissance (int power) {
		this.Puissance = power ;
	}
	
	public boolean getEtat (){
		return this.estAllumée ;
	}
	
	

}


