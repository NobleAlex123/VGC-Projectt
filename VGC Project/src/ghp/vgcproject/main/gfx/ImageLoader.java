package ghp.vgcproject.main.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	public BufferedImage load(String path){
		try {
			return ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// path ist der Path auf dem das Image sich befindet auf dem p
		// Probiert den try {} code, wenn ein Fehler besteht, zeigt er diesen auf der Console an und returnt nichts.
		return null;
		
	}
	
}
