package it.java.prova3;

public class MainClass {

	private static final int MAX = 10;

	public static void main(String[] args) {
		
		
		int v[] = new int[MAX];
		int v1[] = new int[MAX];
		
		for(int i=0; i<v.length; i++)
		{
			v[i] = (int) (Math.random() * 100);
		}
		
		System.out.print("VETTORE 1 -> ");
		
		for(int i=0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");
		}
		
		for(int i=0; i<v.length; i++)
		{
			v1[i] = (int) (Math.random() * 100);
		}
		
		System.out.print("\n\nVETTORE 2 -> ");
		
		for(int i=0; i<v1.length; i++)
		{
			System.out.print(v1[i] + " ");
		}
		
		System.out.print("\n\nASSOMIGLIANZE -> ");
		
		for(int i=0; i<MAX; i++)
		{
			if(v[i] == v1[i])
			{
				System.out.print(v[i] + "=" + v1[i]);
			}
		}

	}

}
