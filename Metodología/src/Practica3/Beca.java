package Practica3;

public class Beca {
	private int ID;
	private int mesInicio;
	private int mesFin;
	private int sueldo;
	
	public Beca(int ID, int mesInicio, int mesFin, int sueldo){
		this.ID=ID;
		this.mesInicio=mesInicio;
		this.mesFin=mesFin;
		this.sueldo=sueldo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public int getMesInicio() {
		return mesInicio;
	}

	public void setMesInicio(int mesInicio) {
		this.mesInicio = mesInicio;
	}

	public int getMesFin() {
		return mesFin;
	}

	public void setMesFin(int mesFin) {
		this.mesFin = mesFin;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getSueldoTotal(){
		 int sueldoTotal=0;
		 int meses=0;
		 for(int mes=mesInicio;mes<=mesFin;mes++){
			 meses++;
		 }
		 
		 return sueldoTotal=sueldo*meses;
	}
	public String toString(){
		return ID+": MesInicio: "+mesInicio+" MesFin: "+mesFin+" SueldoMes: "+sueldo+" Total "+getSueldoTotal();
	}
	public int getDuracion(){
		return mesFin-mesInicio;
	}
	
}