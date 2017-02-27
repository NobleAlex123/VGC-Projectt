package ghp.vgcproject.main.gfx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hauptfenster extends JFrame {

	private JPanel contentPane;
	private JTextField txtGengarVsKangaskhan;
	private JToggleButton tglbtnWeiter;
	public JLabel hintergrundLabel = new JLabel("");

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
	public Hauptfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 423);
		contentPane = new JPanel();
		contentPane.setToolTipText("Gengar vs Kangaskhan");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tglbtnWeiter = new JToggleButton("Weiter");
		tglbtnWeiter.setBounds(385, 338, 101, 36);
		tglbtnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				hintergrundLabel.setIcon(new javax.swing.ImageIcon(Hauptfenster.class.getResource("/Images/pokemonGen5battlebackground.jpg")));
			
			}
		});
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Zurueck");
		tglbtnNewToggleButton.setBounds(0, 338, 101, 36);
		contentPane.add(tglbtnNewToggleButton);
		tglbtnWeiter.setIcon(new javax.swing.ImageIcon("PokéBackground.jpg"));
		tglbtnWeiter.setSelectedIcon(new javax.swing.ImageIcon("selected_pokemonGen5battlebackground.jpg"));
		contentPane.add(tglbtnWeiter);
		

		hintergrundLabel.setBounds(0, 42, 486, 332);
		hintergrundLabel.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/Pok\u00E9Background.jpg")));
		contentPane.add(hintergrundLabel);
		
		txtGengarVsKangaskhan = new JTextField();
		txtGengarVsKangaskhan.setBounds(0, 0, 486, 42);
		txtGengarVsKangaskhan.setText("Gengar vs. Kangaskhan \r\n");
		txtGengarVsKangaskhan.setToolTipText("");
		contentPane.add(txtGengarVsKangaskhan);
		txtGengarVsKangaskhan.setColumns(10);
	}
}
