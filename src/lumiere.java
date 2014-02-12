
public class lumiere {

	public static void main(String[] args) {
			Lampes maLampe = new Lampes() ;
			System.out.println("la puissance est de: " + maLampe.getPuissance());
			System.out.println(maLampe.getEtat());
			
			maLampe.eteindre();
			maLampe.getEtat();

	}

}
