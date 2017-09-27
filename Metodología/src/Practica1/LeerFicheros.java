package Practica1;

import java.io.File;
import java.util.Scanner;

public class LeerFicheros {
	public int [] leerfichero(String ruta){
		int v[]=null;
		int cont =0;
		try{
			File fp= new File(ruta);
			Scanner datos=new Scanner(fp);
			while(datos.hasNextLine()){
				String linea=datos.nextLine();
				System.out.println(linea);
				cont++;
			}
			datos.close();
			v=new int[cont];
			
			datos=new Scanner(fp);
			for(int i=0;i<cont;i++)
				v[i]=datos.nextInt();
			
			datos.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		return v;
	}
}
