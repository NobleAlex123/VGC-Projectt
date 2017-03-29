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
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Hauptfenster extends JFrame {

	private JPanel contentPane;
	private JToggleButton tglbtn2;
	public JLabel hintergrundLabel = new JLabel("");
	private JLabel lblGarchompVSRotom;
	private JButton btnNewButton;
	private JTextArea txtVGCuPokémonEinleitung; 
	private JLabel lblVGCAngepasstBild;
	private JButton tglbtn3;
	private JButton button;
	private JButton button_2;
	
	
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
		Daten daten = new Daten();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 1027, 590);
		contentPane = new JPanel();
		contentPane.setToolTipText("Garchomp vs Rotom ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				txtVGCuPokémonEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("WorausBestehtEinPokémon2"));
				
			}
		});
		
		tglbtn2 = new JToggleButton("1");
		tglbtn2.setBounds(279, 516, 48, 36);
		tglbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/TypChart.jpg")));
				txtVGCuPokémonEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("WorausBestehtEinPokémon"));
				 
				 
			}
		});
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("0");//Gibt dem Button folgende Funktion 
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/PokéBackground.jpg")));
				txtVGCuPokémonEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("zweiterVersuch"));
			}
		});
		
		button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/ArbokPerfektUndDMGFormel.jpg")));
				txtVGCuPokémonEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("DamageCalc"));
			}
		});
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtVGCuPokémonEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("RotomBsp"));
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/RotomUMaxax.jpg")));
			}
		});
		
		button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/TukanonPerfektUDMGFormel.jpg")));
				txtVGCuPokémonEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("DamageCalc2"));
			}
		});
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/DMGFormel.jpg")));
			}
		});
		button_3.setBounds(580, 516, 48, 36);
		contentPane.add(button_3);
		button_2.setBounds(522, 516, 48, 36);
		contentPane.add(button_2);
		button_1.setBounds(337, 516, 48, 36);
		contentPane.add(button_1);
		button.setBounds(456, 516, 48, 36);
		contentPane.add(button);
		

		
		tglbtnNewToggleButton.setBounds(228, 516, 48, 36);
		contentPane.add(tglbtnNewToggleButton);
		tglbtn2.setIcon(new javax.swing.ImageIcon("PokéBackground.jpg"));
		tglbtn2.setSelectedIcon(new javax.swing.ImageIcon("selected_pokemonGen5battlebackground.jpg"));
		contentPane.add(tglbtn2);
		btnNewButton.setBounds(398, 516, 48, 36);
		contentPane.add(btnNewButton);
		

		hintergrundLabel.setBounds(0, 33, 628, 497);
		hintergrundLabel.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/Pok\u00E9Background.jpg")));
		contentPane.add(hintergrundLabel);
		
		lblGarchompVSRotom = new JLabel("Mein VGC/Pok\u00E9mon-Guide");
		lblGarchompVSRotom.setBounds(0, 0, 146, 45);
		contentPane.add(lblGarchompVSRotom);
		
		txtVGCuPokémonEinleitung = new JTextArea();
		txtVGCuPokémonEinleitung.setText("Da wir uns in diesem Guide eher mit dem Wettkampf-Aspekt des Spieles besch\u00E4ftigen, lassen wir den Sammel-Aspekt des  Spieles aus. Also was genau macht einen Pok\u00E9mon-Kampf?\r\nDas 0815-Pokemon-KampfFormat, wird als Einzelkampf bezeichnet, in dem sich zwei Pok\u00E9mon gegen\u00FCberstehen. Hierbei ist nat\u00FCrlich zu beachten, dass es sich um 801 verschiedene Wesen handelt. Im Kampf ist es m\u00F6glich, aus 4 verschiedenen Pok\u00E9mon Attacken zu w\u00E4hlen. Desweiterein existiert das Doppelkampf-, Dreierkampf- und Rotationskampfformat. Da dies unser \"VGC-Project (Video Game Championship)\" ist, werden wir uns auf den Doppelkampf-Format fokussieren, da nur dieser bei den Championships gespielt wird.(Das wollten WIR, diese Guide wurder jedoch zu einem Pokémon-Basics-Guide umgeformt :'D, also könnt ihr den VGC-Banner getrost ignorieren ;D.       \r\n");
		txtVGCuPokémonEinleitung.setBounds(634, 33, 380, 291);
		txtVGCuPokémonEinleitung.setLineWrap(true);
		txtVGCuPokémonEinleitung.setWrapStyleWord(true);
		contentPane.add(txtVGCuPokémonEinleitung);
		
		lblVGCAngepasstBild = new JLabel("VGC-Poster");
		lblVGCAngepasstBild.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/VGCAngepasst.jpg")));
		lblVGCAngepasstBild.setBounds(638, 324, 376, 195);
		contentPane.add(lblVGCAngepasstBild);
		
		
		
		
	}
}
