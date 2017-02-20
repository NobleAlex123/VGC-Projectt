package ghp.vgcproject.main.gfx;

import java.awt.image.BufferedImage;

public class Sprites {

	private BufferedImage sheet;
	
	public Sprites(BufferedImage sheet){
		this.sheet = sheet;
	
	}
	
		
	public BufferedImage crop(int col, int row, int w, int h){
		return sheet.getSubimage(col * 16 , row * 16 , w, h);
	}
}
