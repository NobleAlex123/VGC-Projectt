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
	private JToggleButton tglbtnToggleButtonTest;

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Hauptfenster.class.getResource("/Images/Pok\u00E9Background.jpg")));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		txtGengarVsKangaskhan = new JTextField();
		txtGengarVsKangaskhan.setText("Gengar vs. Kangaskhan \r\n");
		txtGengarVsKangaskhan.setToolTipText("");
		contentPane.add(txtGengarVsKangaskhan, BorderLayout.SOUTH);
		txtGengarVsKangaskhan.setColumns(10);
		
		tglbtnToggleButtonTest = new JToggleButton("ToggleButtonTest");
		tglbtnToggleButtonTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				lblNewLabel.setIcon(new ImageIcon(Hauptfenster.class.getResource("pokemonGen5battlebackground.jpg")));
			
			}
		});
		tglbtnToggleButtonTest.setIcon(new javax.swing.ImageIcon("PokéBackground.jpg"));
		tglbtnToggleButtonTest.setSelectedIcon(new javax.swing.ImageIcon("selected_pokemonGen5battlebackground.jpg"));
		contentPane.add(tglbtnToggleButtonTest, BorderLayout.NORTH);
	}

}
