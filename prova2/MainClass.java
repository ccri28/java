package it.java.prova2;

public class MainClass {

	public static void main(String[] args) {
		
		int v[] = new int[10];
		
		for(int i=0; i<v.length; i++)
		{
			v[i] = (int) (Math.random() * 100);
		}
		
		System.out.print("VETTORE -> ");
		
		for(int i=0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");
		}
		
	}

}
