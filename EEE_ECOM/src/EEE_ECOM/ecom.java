package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
	int i=0;
	int b=0;
	
	private JTextField txtRs;
	private JTextField txtRs_1;
	private JTextField txtRs_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 683, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MYNTRA");
		lblNewLabel.setFont(new Font("Gabriola", Font.PLAIN, 45));
		lblNewLabel.setBounds(217, 11, 232, 132);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\p1.PNG"));
		lblNewLabel_1.setBounds(10, 126, 144, 132);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\p2.PNG"));
		lblNewLabel_2.setBounds(184, 126, 119, 142);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtRs = new JTextField();
		txtRs.setForeground(Color.PINK);
		txtRs.setText("  RS_200");
		txtRs.setBounds(43, 286, 86, 20);
		frame.getContentPane().add(txtRs);
		txtRs.setColumns(10);
		
		txtRs_1 = new JTextField();
		txtRs_1.setForeground(Color.PINK);
		txtRs_1.setText("RS_300");
		txtRs_1.setBounds(194, 286, 86, 20);
		frame.getContentPane().add(txtRs_1);
		txtRs_1.setColumns(10);
		
		txtRs_2 = new JTextField();
		txtRs_2.setForeground(Color.PINK);
		txtRs_2.setText("RS_150");
		txtRs_2.setBounds(377, 286, 86, 20);
		frame.getContentPane().add(txtRs_2);
		txtRs_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.MAGENTA);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "colour", "shade", "quantity"}));
		comboBox.setBounds(53, 317, 76, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.MAGENTA);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "colour", "shade", "quantity"}));
		comboBox_1.setBounds(184, 317, 64, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.MAGENTA);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "colour", "shade", "quantity"}));
		comboBox_2.setBounds(387, 317, 76, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\p4.PNG"));
		lblNewLabel_3.setBounds(367, 109, 108, 167);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lb = new JLabel("CART:0");
		lb.setFont(new Font("Gabriola", Font.PLAIN, 25));
		lb.setBounds(484, 24, 144, 45);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("BILL:0");
		lb2.setFont(new Font("Gabriola", Font.PLAIN, 20));
		lb2.setBounds(485, 71, 85, 58);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
				b=b+200;
				lb2.setText("BILL:"+b);
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnNewButton.setBounds(26, 350, 128, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				b=b+300;
				lb2.setText("BILL:"+b);
			
			}
			
		});
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnNewButton_1.setBounds(184, 356, 123, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
				b=b+150;
				lb2.setText("BILL:"+b);
			}
		});
		btnNewButton_2.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnNewButton_2.setBounds(381, 350, 108, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
