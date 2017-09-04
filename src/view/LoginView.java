package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import com.teamgoran.model.User;

import controller.LoginController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginView {

	private JFrame frame;
	private JTextField userField;
	private JPasswordField passwordField;
	private JButton btnLogin;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					LoginController logg = new LoginController(window);
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblLogin.setBounds(175, 168, 60, 20);
		frame.getContentPane().add(lblLogin);

		JLabel lblBuyYourTickets = new JLabel("Buy your tickets here! please login");
		lblBuyYourTickets.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblBuyYourTickets.setBounds(40, 77, 307, 27);
		frame.getContentPane().add(lblBuyYourTickets);

		JLabel lblGoranExpress = new JLabel("Goran EXPRESS");
		lblGoranExpress.setBackground(Color.GREEN);
		lblGoranExpress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblGoranExpress.setBounds(10, 11, 183, 20);
		frame.getContentPane().add(lblGoranExpress);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(40, 268, 79, 20);
		frame.getContentPane().add(lblUsername);

		userField = new JTextField();
		userField.setBounds(175, 268, 111, 20);
		frame.getContentPane().add(userField);
		userField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(40, 353, 79, 20);
		frame.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(175, 355, 111, 20);
		frame.getContentPane().add(passwordField);

		btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(50, 205, 50));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBounds(209, 436, 138, 27);
		frame.getContentPane().add(btnLogin);

	}

	public JButton getLoginButton() {
		return btnLogin;
	}

	public String getUserName() {
		return userField.getText();
	}

	public String getPassword() {
		return passwordField.getText();
	}

	public JFrame getFrame() {
		return frame;
	}
}
