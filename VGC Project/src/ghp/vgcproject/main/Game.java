package ghp.vgcproject.main;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import ghp.vgcproject.main.gfx.Hauptfenster;
import ghp.vgcproject.main.gfx.ImageLoader;
import ghp.vgcproject.main.gfx.Sprites;


public class Game extends Canvas implements Runnable {
	public Game() {
	}

	public static final int WIDTH = 360, HEIGHT = 240, SCALE = 2;
	public static boolean running = false;
	public Thread gameThread; 	
		// Erlaubt "Multitasking"
	private BufferedImage spriteSheet; 
	
	
	public void init(){
		ImageLoader loader = new ImageLoader();
		spriteSheet = loader.load("/test.jpg");
		
		Sprites ss = new Sprites(spriteSheet);
		//Speichert Bild in eine Variable
	}
	
	public synchronized void start(){
		
		if(running)return;
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
			//Setzt running auf true, wenn running schon gestartet ist wird der Code unterbrochen, startet Thread
	}
	
	public synchronized void stop(){
		
		if(!running)return;
		running = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			// Unterbricht Code wenn running = false, schließt den Thread
	}
	
	
	
	
	
	public void run(){
		init();
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60D;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1){
				tick();
				delta--;
				// Lässt Programm auf Echt-Zeit laufen
				// Also läuft Programm auf allen PC's gleich schnell
			
			}
			
			render();
		}
		stop();
	}
	
		
		public void tick(){
			
		}
		
		public void render(){
			BufferStrategy bs = this.getBufferStrategy();
			if(bs == null){
				createBufferStrategy(3);
				return;
			}
			Graphics g = bs.getDrawGraphics();
			// RENDER HERE
			
			// END RENDER
			g.dispose();
			bs.show();
		}
	
	
	
	
	public static void main(String[] args) {
	
		Game game = new Game();
		Hauptfenster hauptfenster = new Hauptfenster();
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
			// Setzt die Größe des Fensters fest
		
		
		JFrame frame = new JFrame("VCG Project");
		frame.setSize(WIDTH * SCALE, HEIGHT * SCALE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().add(game);
		frame.setVisible(true);
			// Fenster mit Namen "VGC Project" wird erstellt
			// Kann man nun auch sehen  
		game.start();
		
	}

}
