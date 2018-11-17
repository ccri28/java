package it.java.prova4;

public class Operazioni {
	
		private int a = 0;
		private int b = 0;
		
		public Operazioni(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
		
		public int prodotto()
		{
			return a * b;
		}
		
		public int divisione()
		{
			return a / b;
		}
}
