package Practica3;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String [] args) throws FileNotFoundException{
		int opcion;
		boolean bandera=true;
		Scanner leer=new Scanner(System.in);
		LeerFicheroVoraz fichero=new LeerFicheroVoraz();

		String ruta=leer.next();//DatosVoraces8.txt
		Beca becas [] = fichero.leerfichero(ruta);
		for (int i=0;i<becas.length;i++){
			System.out.println("Beca "+becas[i].toString());
		}



		while(bandera){
			System.out.println("Introduce una opcion");
			System.out.println("1. Sin ordenar");
			System.out.println("2. Para ordenar por el mayor sueldo total");
			System.out.println("3. Para ordenar por menor duracion de la beca");
			
			opcion=leer.nextInt();
			switch(opcion){
			case 1:
				sinOrdenar(becas);
				bandera=false;
				break;
			case 2:
				mayorSueldo(becas);
				bandera=false;
				break;
			case 3:
				menorDuracion(becas);
				bandera=false;
				break;
			}
		}




	}
	public static void sinOrdenar(Beca[]becas){
		int meses[];
		AlgoritmoVoraz algoritmo=new AlgoritmoVoraz();
		System.out.println("-----SIN ORDENAR------");
		
		for (int i=0;i<becas.length;i++){
			System.out.println("Beca "+becas[i].toString());
		}
		System.out.println("-----SOLUCION SIRN ORDENAR------");

		meses=algoritmo.solucion(becas);
		for(int k=0;k<meses.length;k++){
			System.out.println("mes "+(k+1)+", beca: "+meses[k]);
		}
		System.out.println("-----------");
	}
	public static void mayorSueldo(Beca[]becas){
		Inversion inversion=new Inversion();
		int meses[];
		Beca []becas1;
		AlgoritmoVoraz algoritmo=new AlgoritmoVoraz();
		System.out.println("-----MAYOR SUELDO TOTAL------");
		becas1=inversion.ordenar(becas, 0, becas.length-1);
		for (int i=0;i<becas1.length;i++){
			System.out.println("Beca "+becas1[i].toString());
		}
		System.out.println("-----SOLUCION MAYOR SUELDO TOTAL------");

		meses=algoritmo.solucion(becas1);
		for(int k=0;k<meses.length;k++){
			System.out.println("mes "+(k+1)+", beca: "+meses[k]);
		}
		System.out.println("-----------");
	}
	public static void menorDuracion(Beca[]becas){
		OrdenarDuracion ordenarduracion=new OrdenarDuracion();
		int meses[];
		Beca []becas1;
		AlgoritmoVoraz algoritmo=new AlgoritmoVoraz();
		System.out.println("-----MENOR DURACION----");
		becas1=ordenarduracion.ordenar(becas, 0, becas.length-1);
		
		for (int i=0;i<becas1.length;i++){
			System.out.println("Beca "+becas1[i].toString());
		}
		
		System.out.println("------Solucion menor duracion------");
		meses=algoritmo.solucion(becas1);
		for(int k=0;k<meses.length;k++){
			System.out.println("mes "+(k+1)+", beca: "+meses[k]);
		}
		System.out.println("-----------");
	}
}



