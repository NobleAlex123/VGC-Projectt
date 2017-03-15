package ghp.vgcproject.main.gfx;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Hauptfenster extends JFrame {

	private JPanel contentPane;
	private JToggleButton tglbtn2;
	public JLabel hintergrundLabel = new JLabel("");
	private JLabel lblGarchompVSRotom;
	private JButton btnNewButton;
	private JTextArea txtVGCuPokémonEInleitung; 
	private JTextArea txtWorausBestehtEinPokémon;
	private JLabel lblVGCAngepasstBild;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptfenster frame = new Hauptfenster();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hauptfenster() {//Created ein Fenster 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 1027, 590);
		contentPane = new JPanel();
		contentPane.setToolTipText("Garchomp vs Rotom ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tglbtn2 = new JToggleButton("1");
		tglbtn2.setBounds(279, 516, 48, 36);
		tglbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/pokemonGen5battlebackground.jpg")));
				txtWorausBestehtEinPokémon.setText("Test");
				txtWorausBestehtEinPokémon = new JTextArea("Test"); 
			}
		});
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("0");//Gibt dem Button folgende Funktion 
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/PokéBackground.jpg")));
			}
		});
		
		btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
			}
		});
		btnNewButton.setBounds(335, 516, 48, 36);
		contentPane.add(btnNewButton);
		tglbtnNewToggleButton.setBounds(228, 516, 48, 36);
		contentPane.add(tglbtnNewToggleButton);
		tglbtn2.setIcon(new javax.swing.ImageIcon("PokéBackground.jpg"));
		tglbtn2.setSelectedIcon(new javax.swing.ImageIcon("selected_pokemonGen5battlebackground.jpg"));
		contentPane.add(tglbtn2);
		

		hintergrundLabel.setBounds(0, 33, 628, 497);
		hintergrundLabel.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/Pok\u00E9Background.jpg")));
		contentPane.add(hintergrundLabel);
		
		lblGarchompVSRotom = new JLabel("Mein VGC/Pok\u00E9mon-Guide");
		lblGarchompVSRotom.setBounds(0, 0, 146, 45);
		contentPane.add(lblGarchompVSRotom);
		
		txtVGCuPokémonEInleitung = new JTextArea();
		txtVGCuPokémonEInleitung.setText("Da wir uns in diesem Guide eher mit dem Wettkampf-Aspekt des Spieles besch\u00E4ftigen, lassen wir den Sammel-Aspekt des  Spieles aus. Also was genau macht einen Pok\u00E9mon-Kampf?\r\nDas 0815-Pokemon-KampfFormat, wird als Einzelkampf bezeichnet, in dem sich zwei Pok\u00E9mon gegen\u00FCberstehen. Hierbei ist nat\u00FCrlich zu beachten, dass es sich um 801 verschiedene Wesen handelt. Im Kampf ist es m\u00F6glich, aus 4 verschiedenen Pok\u00E9mon Attacken zu w\u00E4hlen. Desweiterein existiert das Doppelkampf-, Dreierkampf- und Rotationskampfformat. Da dies unser \"VGC-Project (Video Game Championship)\" ist, werden wir uns auf den Doppelkampf-Format fokussieren, da nur dieser bei den Championships gespielt wird.         \r\n");
		txtVGCuPokémonEInleitung.setBounds(634, 33, 380, 291);
		txtVGCuPokémonEInleitung.setLineWrap(true);
		txtVGCuPokémonEInleitung.setWrapStyleWord(true);
		contentPane.add(txtVGCuPokémonEInleitung);
		
		lblVGCAngepasstBild = new JLabel("");
		lblVGCAngepasstBild.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/VGCAngepasst.jpg")));
		lblVGCAngepasstBild.setBounds(638, 324, 376, 195);
		contentPane.add(lblVGCAngepasstBild);
		
		
		
		
	}
}
