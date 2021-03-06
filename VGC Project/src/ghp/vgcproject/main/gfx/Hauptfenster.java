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
	private JTextArea txtVGCuPok�monEinleitung; 
	private JLabel lblVGCAngepasstBild;
	private JButton tglbtn3;
	private JButton button;
	
	
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
		setBounds(200, 200, 1174, 588);
		contentPane = new JPanel();
		contentPane.setToolTipText("Garchomp vs Rotom ");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("WorausBestehtEinPok�mon2"));
				
			}
		});
		
		button = new JButton("5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/ArbokUTukanon.jpg")));
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("DamageCalc"));
			}
		});
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/DMGFormel.jpg")));
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("DamageCalc2"));
			}
		});
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("RotomBsp"));
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/RotomUMaxax5.jpg")));
			}
		});
		
		JToggleButton toggleButton = new JToggleButton("2");
		toggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/wesentabelle.jpg")));
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("WesenBeschreibung"));
			}
		});
		
		tglbtn2 = new JToggleButton("1");
		tglbtn2.setBounds(68, 516, 48, 36);
		tglbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/TypChart.jpg")));
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("WorausBestehtEinPok�mon"));
				 
				 
			}
		});
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("0");//Gibt dem Button folgende Funktion 
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/Pok�Background.jpg")));
				txtVGCuPok�monEinleitung.setText(daten.TextWechselZuPassenderKategorie.get("zweiterVersuch"));
			}
		});
		

		
		tglbtnNewToggleButton.setBounds(10, 516, 48, 36);
		contentPane.add(tglbtnNewToggleButton);
		tglbtn2.setIcon(new javax.swing.ImageIcon("Pok�Background.jpg"));
		tglbtn2.setSelectedIcon(new javax.swing.ImageIcon("selected_pokemonGen5battlebackground.jpg"));
		contentPane.add(tglbtn2);
		toggleButton.setBounds(126, 516, 48, 36);
		contentPane.add(toggleButton);
		button_1.setBounds(184, 516, 48, 36);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Fragebogen nw = new Fragebogen(); // Created den Fragebogen hier als newScreen angegeben, durch pressen v. 7
				nw.newScreen();
			}
		});
		button_2.setBounds(416, 516, 48, 36);
		contentPane.add(button_2);
		button_3.setBounds(358, 516, 48, 36);
		contentPane.add(button_3);
		button.setBounds(300, 516, 48, 36);
		contentPane.add(button);
		btnNewButton.setBounds(242, 516, 48, 36);
		contentPane.add(btnNewButton);
		

		hintergrundLabel.setBounds(0, 33, 628, 497);
		hintergrundLabel.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/Pok\u00E9Background.jpg")));
		contentPane.add(hintergrundLabel);
		
		lblGarchompVSRotom = new JLabel("Mein VGC/Pok\u00E9mon-Guide");
		lblGarchompVSRotom.setBounds(0, 0, 146, 45);
		contentPane.add(lblGarchompVSRotom);
		
		txtVGCuPok�monEinleitung = new JTextArea();
		txtVGCuPok�monEinleitung.setText("Da wir uns in diesem Guide eher mit dem Wettkampf-Aspekt des Spieles besch\u00E4ftigen, lassen wir den Sammel-Aspekt des  Spieles aus. Also was genau macht einen Pok\u00E9mon-Kampf?\r\nDas 0815-Pokemon-KampfFormat, wird als Einzelkampf bezeichnet, in dem sich zwei Pok\u00E9mon gegen\u00FCberstehen. Hierbei ist nat\u00FCrlich zu beachten, dass es sich um 801 verschiedene Wesen handelt. Im Kampf ist es m\u00F6glich, aus 4 verschiedenen Pok\u00E9mon Attacken zu w\u00E4hlen. Desweiteren existiert das Doppelkampf-, Dreierkampf- und Rotationskampfformat. Da dies unser \"VGC-Project (Video Game Championship)\" ist, werden wir uns auf den Doppelkampf-Format fokussieren, da nur dieser bei den Championships gespielt wird.(Das wollten WIR, dieser Guide wurde jedoch zu einem Pok�mon-Basics-Guide umgeformt :'D, also k�nnt ihr den VGC-Banner getrost ignorieren ;D.       \r\n");
		txtVGCuPok�monEinleitung.setBounds(634, 33, 380, 291);
		txtVGCuPok�monEinleitung.setLineWrap(true);
		txtVGCuPok�monEinleitung.setWrapStyleWord(true);
		contentPane.add(txtVGCuPok�monEinleitung);
		
		lblVGCAngepasstBild = new JLabel("VGC-Poster");
		lblVGCAngepasstBild.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/VGCAngepasst.jpg")));
		lblVGCAngepasstBild.setBounds(638, 335, 510, 192);
		contentPane.add(lblVGCAngepasstBild);
		
		
		
		
	}
}
