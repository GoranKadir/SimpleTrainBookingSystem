package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import javax.swing.JRadioButton;
import com.toedter.components.JSpinField;

import controller.BookingController;

import com.toedter.calendar.JYearChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;

public class BookingView extends JFrame {

	private JPanel contentPane;
	private JTextField fromTextField;
	private JTextField ToTextField;
	private JButton nextbtn;
	private JRadioButton TurReturButton;
	private JDateChooser dateChooser1;
	private JDateChooser dateChooser2;
	private JRadioButton EnkelResaButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public BookingView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 432);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVartVillDu = new JLabel("Hej, vart vill du resa?");
		lblVartVillDu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblVartVillDu.setBounds(157, 11, 184, 20);
		contentPane.add(lblVartVillDu);

		fromTextField = new JTextField();
		fromTextField.setBounds(10, 61, 226, 20);
		contentPane.add(fromTextField);
		fromTextField.setColumns(10);

		ToTextField = new JTextField();
		ToTextField.setBounds(273, 61, 226, 20);
		contentPane.add(ToTextField);
		ToTextField.setColumns(10);

		JLabel lblFrn = new JLabel("Fr\u00E5n");
		lblFrn.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblFrn.setBounds(10, 47, 46, 14);
		contentPane.add(lblFrn);

		JLabel lblTill = new JLabel("Till");
		lblTill.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblTill.setBounds(271, 47, 46, 14);
		contentPane.add(lblTill);

		TurReturButton = new JRadioButton("TUR-& RETUR");
		
		buttonGroup.add(TurReturButton);
		TurReturButton.setBounds(127, 101, 109, 20);
		contentPane.add(TurReturButton);

		EnkelResaButton = new JRadioButton("ENKELRESA");
		buttonGroup.add(EnkelResaButton);
		EnkelResaButton.setBounds(273, 101, 100, 20);
		contentPane.add(EnkelResaButton);

		nextbtn = new JButton("Next");
		nextbtn.setBackground(new Color(50, 205, 50));
		nextbtn.setBounds(357, 328, 89, 23);
		contentPane.add(nextbtn);

		dateChooser1 = new JDateChooser();
		dateChooser1.setBounds(38, 141, 119, 29);
		contentPane.add(dateChooser1);

		dateChooser2 = new JDateChooser();
		dateChooser2.setBounds(312, 141, 134, 29);
		contentPane.add(dateChooser2);
	}

	public JDateChooser getDateChooser1() {
		return dateChooser1;
	}

	public JDateChooser getDateChooser2() {
		return dateChooser2;
	}

	public JRadioButton getTurReturButton() {
		return TurReturButton;
	}
	
	public JRadioButton getenkelResaButton(){
		return EnkelResaButton;
	}

	public JButton getNextbutton() {
		return nextbtn;
	}

	public String getFromTextField() {
		return fromTextField.getText();
	}

	public String getToTextField() {
		return ToTextField.getText();
	}
}
