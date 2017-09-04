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
import java.awt.Color;
import java.awt.Label;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class TimeView extends JFrame {

	private JPanel contentPane;
	private JLabel tillTextVarning;
	private JLabel fromLabel;
	private JLabel toLabel;
	private JLabel lblDuHarValt;
	private JLabel comboFieldTraveler;
	private JLabel resTidLabel1;
	private JLabel resITidLabel2;
	private JLabel resTidLabel3;
	private JLabel resTidLabel4;
	private JLabel resTidLabel5;
	private JButton confirmButton;
	private JLabel date1Label;
	private JRadioButton moneyTimeButton1, moneyTimeButton2,
	moneyTimeButton3, moneyTimeButton4, moneyTimeButton5,
	moneyTimeButton6, moneyTimeButton7, moneyTimeButton8,
	moneyTimeButton9, moneyTimeButton10;
	
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel date2Label;
	private JLabel lblRestidh;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public TimeView(Booking booking, User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tillTextVarning = new JLabel("Till");
		tillTextVarning.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		tillTextVarning.setBounds(212, 42, 33, 14);
		contentPane.add(tillTextVarning);

		// Sätter in namn på stad, vart användare vill åka från baserat vad
		// anvädaren knappt in i bookingView
		fromLabel = new JLabel(booking.getFrom());
		fromLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fromLabel.setBounds(50, 42, 144, 23);
		contentPane.add(fromLabel);

		// Sätter in namn på stad, vart användare vill åka till baserat vad
		// anvädaren knappt in i bookingView
		toLabel = new JLabel(booking.getTo());
		toLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toLabel.setBounds(304, 42, 144, 23);
		contentPane.add(toLabel);

		lblDuHarValt = new JLabel("Du har valt:");
		lblDuHarValt.setForeground(Color.BLACK);
		lblDuHarValt.setBackground(Color.LIGHT_GRAY);
		lblDuHarValt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDuHarValt.setBounds(141, 11, 104, 14);
		contentPane.add(lblDuHarValt);

		comboFieldTraveler = new JLabel(user.getUserName());
		comboFieldTraveler.setForeground(Color.BLACK);
		comboFieldTraveler.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboFieldTraveler.setBounds(242, 11, 89, 17);
		contentPane.add(comboFieldTraveler);

		resTidLabel1 = new JLabel("Restid 3h");
		resTidLabel1.setForeground(Color.GRAY);
		resTidLabel1.setFont(new Font("Tahoma", Font.ITALIC, 17));
		resTidLabel1.setBounds(174, 99, 104, 14);
		contentPane.add(resTidLabel1);

		resITidLabel2 = new JLabel("Restid 3h");
		resITidLabel2.setForeground(Color.GRAY);
		resITidLabel2.setFont(new Font("Tahoma", Font.ITALIC, 17));
		resITidLabel2.setBounds(174, 155, 104, 14);
		contentPane.add(resITidLabel2);

		resTidLabel3 = new JLabel("Restid 3h");
		resTidLabel3.setForeground(Color.GRAY);
		resTidLabel3.setFont(new Font("Tahoma", Font.ITALIC, 17));
		resTidLabel3.setBounds(174, 214, 104, 14);
		contentPane.add(resTidLabel3);

		resTidLabel4 = new JLabel("Restid 3h");
		resTidLabel4.setForeground(Color.GRAY);
		resTidLabel4.setFont(new Font("Tahoma", Font.ITALIC, 17));
		resTidLabel4.setBounds(174, 273, 104, 14);
		contentPane.add(resTidLabel4);

		resTidLabel5 = new JLabel("Restid 3h");
		resTidLabel5.setForeground(Color.GRAY);
		resTidLabel5.setFont(new Font("Tahoma", Font.ITALIC, 17));
		resTidLabel5.setBounds(174, 330, 104, 14);
		contentPane.add(resTidLabel5);
		
	
		moneyTimeButton1 = new JRadioButton("06:30 - 09:30 (350KR)");
		buttonGroup.add(moneyTimeButton1);
		moneyTimeButton1.setBounds(16, 98, 152, 23);
		contentPane.add(moneyTimeButton1);

		moneyTimeButton2 = new JRadioButton("10:00 - 13:00 (400KR)");
		buttonGroup.add(moneyTimeButton2);
		moneyTimeButton2.setBounds(16, 154, 152, 23);
		contentPane.add(moneyTimeButton2);

		moneyTimeButton3 = new JRadioButton("13:30 - 16:30 (500KR)");
		buttonGroup.add(moneyTimeButton3);
		moneyTimeButton3.setBounds(16, 213, 152, 23);
		contentPane.add(moneyTimeButton3);

		moneyTimeButton4 = new JRadioButton("17:00 - 20:00 (500KR)");
		buttonGroup.add(moneyTimeButton4);
		moneyTimeButton4.setBounds(16, 272, 152, 23);
		contentPane.add(moneyTimeButton4);

		moneyTimeButton5 = new JRadioButton("20:30 - 23:30 (450KR)");
		buttonGroup.add(moneyTimeButton5);
		moneyTimeButton5.setBounds(16, 329, 152, 23);
		contentPane.add(moneyTimeButton5);

		confirmButton = new JButton("Confirm");

		confirmButton.setForeground(new Color(50, 205, 50));
		confirmButton.setBounds(439, 350, 121, 35);
		contentPane.add(confirmButton);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		date2Label = new JLabel("");
		date2Label.setText(df.format(booking.getDate2().getDate()));
		date2Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		date2Label.setBounds(304, 76, 104, 23);
		contentPane.add(date2Label);
		
		date1Label = new JLabel("");
		date1Label.setText(df.format(booking.getDate().getDate()));
		date1Label.setBounds(27, 76, 104, 23);
		contentPane.add(date1Label);
		
		moneyTimeButton6 = new JRadioButton("06.00 - 09:30 (350KR)");
		buttonGroup_1.add(moneyTimeButton6);
		moneyTimeButton6.setBounds(284, 98, 144, 23);
		contentPane.add(moneyTimeButton6);
		
		moneyTimeButton7 = new JRadioButton("10.30 - 13.30 (600KR)");
		buttonGroup_1.add(moneyTimeButton7);
		moneyTimeButton7.setBounds(284, 154, 144, 23);
		contentPane.add(moneyTimeButton7);
		
		moneyTimeButton8 = new JRadioButton("17.00 - 20.00 (900KR)");
		buttonGroup_1.add(moneyTimeButton8);
		moneyTimeButton8.setBounds(284, 213, 144, 23);
		contentPane.add(moneyTimeButton8);
		
		moneyTimeButton9 = new JRadioButton("20.30 - 23.30 (250KR)");
		buttonGroup_1.add(moneyTimeButton9);
		moneyTimeButton9.setBounds(284, 272, 144, 23);
		contentPane.add(moneyTimeButton9);
		
		moneyTimeButton10 = new JRadioButton("00.30 - 03.30 (200KR)");
		buttonGroup_1.add(moneyTimeButton10);
		moneyTimeButton10.setBounds(284, 329, 144, 23);
		contentPane.add(moneyTimeButton10);
		
		lblRestidh = new JLabel("Restid 3h");
		lblRestidh.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblRestidh.setForeground(Color.GRAY);
		lblRestidh.setBounds(441, 97, 83, 19);
		contentPane.add(lblRestidh);
		
		lblNewLabel = new JLabel("Restid 3h");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(439, 153, 83, 19);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Restid 3h");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(439, 214, 83, 17);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Restid 3h");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setBounds(439, 273, 83, 17);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Restid 3h");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setBounds(439, 330, 85, 17);
		contentPane.add(lblNewLabel_3);
		
	}
	
	public JLabel showDateHere(){
		return date1Label;
	}
	
	public JRadioButton getTimeMoneyButton1(){
		return moneyTimeButton1;
	}
	
	public JRadioButton getTimeMoneyButton2(){
		return moneyTimeButton2;
	}
	
	public JRadioButton getTimeMoneyButton3(){
		return moneyTimeButton3;
	}
	
	public JRadioButton getTimeMoneyButton4(){
		return moneyTimeButton4;
	}
	
	public JRadioButton getTimeMoneyButton5(){
		return moneyTimeButton5;
	}
	public JRadioButton getTimeMoneyButton6(){
		return moneyTimeButton6;
	}
	
	public JRadioButton getTimeMoneyButton7(){
		return moneyTimeButton7;
	}
	
	public JRadioButton getTimeMoneyButton8(){
		return moneyTimeButton8;
	}
	
	public JRadioButton getTimeMoneyButton9(){
		return moneyTimeButton9;
	}
	
	public JRadioButton getTimeMoneyButton10(){
		return moneyTimeButton10;
	}
	
	

	public JButton getConfirmButton() {
		return confirmButton;
	}

	public JLabel getComboField() {
		return comboFieldTraveler;
	}

	public JLabel setFromText() {
		return fromLabel;

	}

	public JLabel setToText() {
		return toLabel;
	}
}
