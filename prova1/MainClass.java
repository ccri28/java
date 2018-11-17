package it.java.prova1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quanti elementi vuoi inserire nel vettore? ");
		int n = s.nextInt();
		
		int v[] = new int[n];
		
		int elemento;
		System.out.print("\n");
		for(int i=0; i<v.length; i++)
		{
			System.out.print("Inserisci elemento: ");
			elemento = s.nextInt();
			v[i] = elemento;
		}
		
		System.out.print("\nVETTORE INSERITO -> ");
		
		for(int i=0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");
		}
		
	}

}
