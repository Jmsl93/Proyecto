package Practica3;

public class Inversion {
	//static int inv=0;
	public Beca[] ordenar(Beca v[], int li, int ls){
		//int inv=0;
		if (li<ls){
			int med=(li+ls)/2;
			ordenar(v,li,med);
			ordenar(v,med+1,ls);
			MezclaOrdenada(v,li,med,ls);
		}

		//System.out.println(inv);
		return v;
	}
	public int MezclaOrdenada(Beca v[], int li, int med, int ls){
		int n=0;
		int k;
		int recW = li; //para recorrer el vector auxiliar w
		int recIV = li; //para recorrer el subvector izquierdo v[li..med]
		int recDV = med + 1; //para recorrer el subvector derecho v[med+1..ls]
		Beca w[]=new Beca[v.length];

		while ((recIV <= med) && (recDV <= ls)) {
			if (v[recIV].getSueldoTotal() > v[recDV].getSueldoTotal()) {
				w[recW] = v[recIV];
				recIV++;

			} else {
				w[recW] = v[recDV];
				recDV++;
				n+=med-recIV+1;
			}

			recW++;
		}

		//completamos w con lo que nos queda del subvector izquierdo
		for (k = recIV; k <= med; k++) { 
			w[recW] = v[k];
			recW++;
		}
		//completamos w con lo que nos queda del subvector derecho
		for (k = recDV; k <= ls; k++) {
			w[recW] = v[k];
			recW++;
		}
		// volcamos todo el contenido de w en v
		for (k = li; k <= ls; k++) {
			v[k] = w[k];
		}
		return n;
	}

}

