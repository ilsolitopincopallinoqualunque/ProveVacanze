package it.casa.mirko;


public  class EsternaClass {
	private int x;
	public int y;
	public static int s=15;
	private int z;
	
	public static class InternaStatica{
		public  int z;
		public int f;
		public static int m=13;
				
	}

	public class Interna{
		public  int z;
		public int f;
		
		public Interna(){
			this.z=17;
			f=21;
			y=23;
			x=2;
			EsternaClass.this.z=13;
		}
		
	}
	public EsternaClass() {
		s=17;
		x=5;
		y=25;
		EsternaClass.this.z=8;
		
	}



	public static void main(String[] args) {
		EsternaClass esterna= new EsternaClass();
		EsternaClass.Interna interna= new EsternaClass().new Interna();
//		EsternaClass.InternaStatica classeInternaStatica= EsternaClass.InternaStatica.class;
	}

}
