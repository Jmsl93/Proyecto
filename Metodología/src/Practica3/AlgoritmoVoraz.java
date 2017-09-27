package Practica3;

public class AlgoritmoVoraz {
	
		public int[] solucion(Beca[] becas){
			int sueldoTotal=0;	
			int []meses=new int[12];
			int n=0;
			boolean seguir=true;
			for(int i=0;i<meses.length;i++){
				meses[i]=0;
			}


			while(n<becas.length){

				seguir=comprobar(becas,meses,n);

				if(seguir==true){
					for(int i=becas[n].getMesInicio()-1;i<becas[n].getMesFin();i++){
						meses[i]=becas[n].getID();
						sueldoTotal=sueldoTotal+becas[n].getSueldo();
					}
				}

				n++;

			}
			System.out.println("Sueldo Total; "+sueldoTotal +" Euros");
			return meses;	
		}
		public boolean comprobar(Beca[]becas, int []meses, int k){
			
			for(int i=becas[k].getMesInicio()-1;i<becas[k].getMesFin();i++){
				if( meses[i]!=0){
					return false;
					}
			}
			return true;
		}
	}





