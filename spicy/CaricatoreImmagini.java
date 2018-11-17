package it.gioco.spicy;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CaricatoreImmagini {
	
	BufferedImage image;
	
	// String posizione -> posizione/percorso dell'immagine
	public BufferedImage caricaImmagine(String posizione)
	{
		//getResources recupera la cartella src
		try {
			//getResource recupera la cartella src del progetto, per le immagini
			image = ImageIO.read(getClass().getResource(posizione));
		} catch (IOException e) {
			System.out.println("Immagine alla posizione "+posizione+" caricata correttamente.");
			e.printStackTrace();
		}
		
		return image;
				
	}
}
