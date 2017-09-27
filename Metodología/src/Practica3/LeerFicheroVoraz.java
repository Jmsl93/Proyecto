package Practica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerFicheroVoraz {
	public Beca[] leerfichero(String ruta)throws FileNotFoundException{
		int cont=0;
		Beca becas[]=null;
		try{
			File fp= new File(ruta);
			Scanner datos=new Scanner(fp);
			while(datos.hasNextLine()){
				datos.nextLine();
				cont++;
			}
			datos.close();
			cont--;
			becas=new Beca[cont];
			
			datos=new Scanner(fp);
			for(int i=0;i<cont;i++){
				int id=datos.nextInt();
				int mesInicio=datos.nextInt();
				int mesFin=datos.nextInt();
				int saldo=datos.nextInt();
				Beca beca= new Beca(id,mesInicio,mesFin,saldo);
				becas[i]=beca;
			}

			datos.close();
		}catch(Exception e){
			e.printStackTrace();

		}
		return becas;
	}
}

