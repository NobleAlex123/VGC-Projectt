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

public class Fragebogen4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void newScreen4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fragebogen4 frame = new Fragebogen4();
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
	public Fragebogen4() {
		Daten daten = new Daten();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtFrage4 = new JTextArea();
		txtFrage4.setText("Welche Stats werden durch das Wesen 'Hart' um 10% erhöht bzw. gesenkt?\r\n");
		txtFrage4.setBounds(10, 0, 433, 112);
		txtFrage4.setLineWrap(true);
		txtFrage4.setWrapStyleWord(true);
		contentPane.add(txtFrage4);
		
		JButton btnNewButton = new JButton("+Spe.Atk -Sp-Def");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				txtFrage4.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			
			}
		});
		btnNewButton.setBounds(43, 145, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+Atk -Def");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage4.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			
			}
		});
		btnNewButton_1.setBounds(277, 145, 124, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+Atk -Spe.Atk");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage4.setText(daten.TextWechselZuPassenderKategorie.get("Frage5"));
				Fragebogen5 nw = new Fragebogen5(); // Created den Fragebogen hier als newScreen angegeben, durch pressen v. 7
				nw.newScreen5();
			}
		});
		btnNewButton_2.setBounds(43, 222, 124, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+Init -Def");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage4.setText(daten.TextWechselZuPassenderKategorie.get("FrageFail"));
			}
		});
		btnNewButton_3.setBounds(277, 222, 124, 23);
		contentPane.add(btnNewButton_3);
	}
}
