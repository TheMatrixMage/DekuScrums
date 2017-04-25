import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class RequalifyAVote extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JButton btnSubmit;
	
	/**
	 * Create the frame.
	 */
	public RequalifyAVote() {
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 18));
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateElection.class.getResource("/images/Deku_Link_Artwork.png")));
		setTitle("Requalify Vote");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 50, 250, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Requalify Vote", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 220, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblID = new JLabel("Voter's ID to Requalify:");
		lblID.setBounds(12, 23, 168, 16);
		panel.add(lblID);
		
		textFieldID = new JTextField();
		textFieldID.setColumns(10);
		textFieldID.setBounds(12, 52, 168, 22);
		panel.add(textFieldID);
		
		
		btnSubmit= new JButton("Submit");
		btnSubmit.setBounds(80, 204, 97, 25);
		contentPane.add(btnSubmit);

	}
	public JButton getSubmitButton()
	{
		return btnSubmit;
	}
	
	public String getElectionName()
	{
		return textFieldID.getText();
	}
	
}

