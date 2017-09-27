package Practica1;

public class Ordenar {
	
	public int ordenar(int v[], int li, int ls){
		int inv=0;
		
		if (li<ls){
			int med=(li+ls)/2;
			inv+=ordenar(v,li,med);
			inv+=ordenar(v,med+1,ls);
			inv+=MezclaOrdenada(v,li,med,ls);
		}

		return inv;
	}
	public int MezclaOrdenada(int v[], int li, int med, int ls){
		int n=0;

		int recW = li; 
		int recIV = li; 
		int recDV = med + 1; 
		int k,w[]=new int[v.length];

		while ((recIV <= med) && (recDV <= ls)) {
			if (v[recIV] < v[recDV]) {
				w[recW] = v[recIV];
				recIV++;

			} else {
				w[recW] = v[recDV];
				recDV++;
				n+=med-recIV+1;
			}

			recW++;
		}

		
		for (k = recIV; k <= med; k++) { 
			w[recW] = v[k];
			recW++;
		}
		
		for (k = recDV; k <= ls; k++) {
			w[recW] = v[k];
			recW++;
		}
		
		for (k = li; k <= ls; k++) {
			v[k] = w[k];
		}
		return n;
	}
	
}
