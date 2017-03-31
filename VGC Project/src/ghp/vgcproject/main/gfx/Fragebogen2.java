package ghp.vgcproject.main.gfx;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Fragebogen2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fragebogen2 frame = new Fragebogen2();
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
	public Fragebogen2() {
		Daten daten = new Daten();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtFrage2 = new JTextArea();
		txtFrage2.setText("Garados (Wasser/Flug) vs. Sandamer (Boden). Was ist sehr effektiv? Kaskade (Wasser), Donnerzahn (Elektro), Erdbeben (Boden), Knirscher (Unlicht)\r\n");
		txtFrage2.setBounds(10, 0, 433, 112);
		txtFrage2.setLineWrap(true);
		txtFrage2.setWrapStyleWord(true);
		contentPane.add(txtFrage2);
		
		JButton btnNewButton = new JButton("Kaskade");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				txtFrage2.setText(daten.TextWechselZuPassenderKategorie.get("Frage3"));
				Fragebogen3 nw = new Fragebogen3(); // Created den Fragebogen hier als newScreen angegeben, durch pressen v. 7
				nw.newScreen3();
			}
		});
		btnNewButton.setBounds(43, 145, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Donnerzahn");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage2.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			
			}
		});
		btnNewButton_1.setBounds(277, 145, 124, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Erdbeben");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage2.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			
			}
		});
		btnNewButton_2.setBounds(43, 222, 124, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Knirscher");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage2.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			}
		});
		btnNewButton_3.setBounds(277, 222, 124, 23);
		contentPane.add(btnNewButton_3);
	}
}
