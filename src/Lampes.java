
public class Lampes {
	public int Puissance;
	private boolean estAllum�e;
	public final static int Puissance_defaut = 100 ;

	public void eteindre() {
		this.estAllum�e = false ;
		
	}
	
	public void allumer() {
		this.estAllum�e = true ; 
	}
	
	
	public Lampes(){
		this.Puissance = Puissance_defaut ;
		this.estAllum�e = false ;
	}
	
	public Lampes(int Puissance0){
		this.Puissance = Puissance0 ;
		this.estAllum�e = false ;
	}
	
	
	public int getPuissance () {
		return this.Puissance ;
	}
	
	public void setPuissance (int power) {
		this.Puissance = power ;
	}
	
	public boolean getEtat (){
		return this.estAllum�e ;
	}
	
	

}


