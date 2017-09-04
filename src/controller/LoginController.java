package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NoSuchObjectException;

import javax.swing.JOptionPane;

import com.teamgoran.model.User;
import com.teamgoran.model.data.UserData;

import view.BookingView;
import view.LoginView;

public class LoginController {
	UserData userData;
	BookingController bookingController;

	public LoginController(LoginView loginView) {
		loginView.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userName = loginView.getUserName();
				String pass = loginView.getPassword();

				try {
					User user = UserData.getUser(userName);
					
					if (user.getPassword().equals(pass)) {
						JOptionPane.showMessageDialog(null, "Welcome");
						/**
						 * When your logged in show the BookingView class
						 */
						BookingView bookingView = new BookingView();
						
						/**
						 * Call the bookingView controller, to show to bookingView class and hide the loginView class
						 */
						bookingController = new BookingController(bookingView, user);
						bookingView.setVisible(true);
						loginView.getFrame().setVisible(false);
					} 
					
					else {
						
					}

				} catch (NoSuchObjectException e1) {

					e1.printStackTrace();
				}

			}
		});
	}
}
