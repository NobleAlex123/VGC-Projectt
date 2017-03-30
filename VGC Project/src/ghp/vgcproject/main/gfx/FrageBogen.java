package ghp.vgcproject.main.gfx;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrageBogen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrageBogen frame = new FrageBogen();
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
	public FrageBogen() {
		Daten daten = new Daten();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtFrage1 = new JTextArea();
		txtFrage1.setText("\"Das Pok\u00E9mon Knackrack bek\u00E4mpft das Pok\u00E9mon Elevoltek. Du besitzt die Attacken Drachenklaue (Drache), Feuersturm (Feuer), Steinkante (Gestein) und Erdbeben (Boden). Welche dieser Attacken ist bei Elevoltek (Elektro) sehr effektiv?  \"");
		txtFrage1.setBounds(10, 0, 433, 112);
		txtFrage1.setLineWrap(true);
		txtFrage1.setWrapStyleWord(true);
		contentPane.add(txtFrage1);
		
		JButton btnNewButton = new JButton("Drachenklaue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			}
		});
		btnNewButton.setBounds(43, 145, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Feuersturm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnNewButton_1.setBounds(277, 145, 124, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Steinkante");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnNewButton_2.setBounds(43, 222, 124, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Erdbeben");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtFrage1.setText(daten.TextWechselZuPassenderKategorie.get("Frage2"));
			}
		});
		btnNewButton_3.setBounds(277, 222, 124, 23);
		contentPane.add(btnNewButton_3);
	}
}
