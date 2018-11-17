package it.gioco.spicy;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Gioco extends Canvas implements KeyListener{

	private static final int larghezza = 980;
	private static final int altezza = 680;
	private static final String nome_gioco = "Sp!cy G@m3r";
	
	//inizializziamo le immagini
	BufferedImage paesaggio = null;
	BufferedImage topo = null;
	BufferedImage ombrello = null;
	
	public Gioco() {
		caricaRisorse();
	}
	
	public static void main(String[] args) {
		
		Gioco gioco = new Gioco();
		
		//creo finestra gioco
		JFrame finestra_gioco = new JFrame(nome_gioco);
		
		//una volta creata la finestra del gioco, ci serve specificare anche la dimensione della finestra
		Dimension dimensione_finestra = new Dimension(larghezza, altezza);
		
		//impostiamo la finestra
		finestra_gioco.setPreferredSize(dimensione_finestra);
		//soltanto per sicurezza
		finestra_gioco.setMaximumSize(dimensione_finestra);
		
		finestra_gioco.setResizable(false);
		
		finestra_gioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//alla finestra aggiungiamo un oggetto gioco di tipo Canvas
		finestra_gioco.add(gioco);
		
		finestra_gioco.addKeyListener((KeyListener) gioco);
		
		//per creare e compattare tutto 
		finestra_gioco.pack();
		
		finestra_gioco.setVisible(true);
		
		
	}
	
	private void caricaRisorse()
	{
		//dopo aver inizializziato le immagini, le carichiamo
		CaricatoreImmagini loader = new CaricatoreImmagini();
		
		paesaggio = loader.caricaImmagine("/immagini/paesaggio.png");
		topo = loader.caricaImmagine("/immagini/topo.png");
		ombrello = loader.caricaImmagine("/immagini/ombrello.png");
		
		System.out.println("Risorse caricate!");
	}
	
	private void disegna()
	{
		//prende la finestra e dice che quello è un oggetto canvas su cui si puo' disegnare 
		Graphics g = this.getGraphics();
		
		g.drawImage(paesaggio, 0, 0, larghezza, altezza, this);
		
		//metodo che serve per visualizzare tutto
		g.dispose();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		disegna();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
