package exaplesJavaTutorial;

public class Uso_auto {

	public static void main(String[] args) {
		Auto toyota = new Auto();
		System.out.println(toyota.dimeDatosGenerales());
		toyota.setAc("si");
		toyota.setAsientosCuero("Si");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println(toyota.dimeDatosGenerales());
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println(toyota.dimeDatosGenerales());
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println(toyota.dimeDatosGenerales());
	}
 
}
