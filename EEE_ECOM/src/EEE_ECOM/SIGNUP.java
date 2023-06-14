package EEE_ECOM;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
public class SIGNUP {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNUP window = new SIGNUP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SIGNUP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.getContentPane().setBackground(new Color(102, 0, 153));
		frame.setBounds(100, 100, 689, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGNUP");
		lblNewLabel.setFont(new Font("Gabriola", Font.BOLD, 45));
		lblNewLabel.setBounds(234, 11, 318, 99);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Gabriola", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(24, 100, 111, 76);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setFont(new Font("Gabriola", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(10, 161, 111, 76);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("PROGAMMING\r\nLANGUAGE");
		lblNewLabel_4.setFont(new Font("Gabriola", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(24, 297, 221, 60);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("BRANCH");
		lblNewLabel_5.setFont(new Font("Gabriola", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(20, 233, 127, 76);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(215, 118, 141, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		r1.setBounds(215, 178, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		r2.setBounds(390, 178, 109, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "EEE", "ECE", "CSE", "MECH", "CIVIL", "IT", "IOT", "AIML"}));
		c1.setBounds(215, 251, 84, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("C");
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		cb1.setBounds(274, 309, 97, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("PYTHON");
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		cb2.setBounds(390, 308, 141, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("JAVA");
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb3.setBounds(541, 308, 97, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if (r2.isSelected())
				{
				
					g="male";
			    }
			else
		     	{
				    g="invalid";
		     	}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
				{
					p="c";
				}
				else if(cb2.isSelected())
				{
					p="python";
				
				}
				else
				{
					p="java";
				}
				
		    JOptionPane.showMessageDialog(btnNewButton, "Hello"+n+"\n gender:"+g+"\n Branch:"+b+"\n programming:   "+p);
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(235, 380, 169, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
