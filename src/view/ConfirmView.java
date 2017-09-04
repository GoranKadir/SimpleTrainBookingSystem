package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.teamgoran.model.Booking;
import com.teamgoran.model.User;

import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;

public class ConfirmView extends JFrame {

	private JPanel contentPane;
	private JLabel yourPay;
	private JLabel dateGoField;
	private JLabel dateBackField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	
	/**
	 * Takes a double and a User as constructor
	 * the double is the final sum the user have to pay
	 * And the user is what for user thats logged in
	 * 
	 */
	public ConfirmView(double finalSum, Booking booking, User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		yourPay = new JLabel(user.getUserName() + " you paying " + finalSum + " kr, efter din rabatt");
		yourPay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yourPay.setBounds(36, 143, 370, 68);
		contentPane.add(yourPay);
		
		JLabel lblNewLabel = new JLabel("Thanks you for buying with Goran Express");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(36, 11, 403, 40);
		contentPane.add(lblNewLabel);
		
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateGoField = new JLabel("");
		dateGoField.setText(dFormat.format(booking.getDate().getDate()));
		dateGoField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dateGoField.setBounds(36, 89, 115, 28);
		contentPane.add(dateGoField);
		
		dateBackField = new JLabel();
		dateBackField.setText(dFormat.format(booking.getDate2().getDate()));
		dateBackField.setBounds(255, 89, 115, 28);
		contentPane.add(dateBackField);
		
		lblNewLabel_1 = new JLabel("\u00C5ker detta datum");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 62, 141, 28);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\u00C5ker hem detta datum");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(250, 62, 156, 28);
		contentPane.add(lblNewLabel_2);
	}
}
