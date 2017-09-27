package Practica1;

import java.io.*;
import java.util.*;
public class P2 {
	public static void main (String[] args){
		Scanner leer=new Scanner(System.in);
		LeerFicheros fichero=new LeerFicheros();
		
		Ordenar ordenar=new Ordenar();
		int l=0,inv=0;
		
		String ruta=leer.next();//InversionsTest_0.dat
		int vector [] = fichero.leerfichero(ruta);
		System.out.println("Ya ha cargado el fichero");
		
		for (int i=0;i<vector.length;i++){
			System.out.print(vector[i]+" ");
			l++;
		}
		 System.out.println(" ");
		inv=ordenar.ordenar(vector,0,l-1);
//		for (int i=0;i<vector.length;i++)
////			System.out.print(vector[i]+" ");
////		System.out.println("Inversiones: "+inv);
	}
	
	
	
}