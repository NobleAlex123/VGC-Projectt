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

public class Fragebogen3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fragebogen3 frame = new Fragebogen3();
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
	public Fragebogen3() {
		Daten daten = new Daten();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtFrage3 = new JTextArea();
		txtFrage3.setText("Pinsir (Käfer+Überbrückung) vs. Zapplarang(Elektro+Schwebe). Würde Pinsir mit der Attacke Erdbeben treffen?\r\n");
		txtFrage3.setBounds(10, 0, 433, 112);
		txtFrage3.setLineWrap(true);
		txtFrage3.setWrapStyleWord(true);
		contentPane.add(txtFrage3);
		
		JButton btnNewButton = new JButton("Ja");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				txtFrage3.setText(daten.TextWechselZuPassenderKategorie.get("Frage4"));
				Fragebogen4 nw = new Fragebogen4(); // Created den Fragebogen hier als newScreen angegeben, durch pressen v. 7
				nw.newScreen4();
			}
		});
		btnNewButton.setBounds(41, 190, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nein");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage3.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			
			}
		});
		btnNewButton_1.setBounds(279, 190, 124, 23);
		contentPane.add(btnNewButton_1);
	}
}
