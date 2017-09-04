package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.rmi.NoSuchObjectException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.teamgoran.model.Booking;
import com.teamgoran.model.User;
import com.toedter.calendar.JDateChooser;

import view.BookingView;
import view.LoginView;
import view.TimeView;

public class BookingController {

	Booking booking;
	TimeView timeView;
	TimeViewController timeViewController;

	public BookingController(BookingView bookingView, User user) {

		bookingView.getNextbutton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					/**
					 * get fromfield och toField från bookingFrame (STAD)
					 **/
					String fromField = bookingView.getFromTextField();
					String toField = bookingView.getToTextField();
					JDateChooser dateField = bookingView.getDateChooser1();
					JDateChooser date2Field = bookingView.getDateChooser2();

					/**
					 * Call the booking class and set the from/to field and the
					 * user
					 */
					booking = new Booking(fromField, toField, dateField, date2Field, user);

					/**
					 * show the timeView and hide the bookingView
					 */
					TimeView timeView = new TimeView(booking, user);
					timeView.setVisible(true);
					timeViewController = new TimeViewController(timeView, booking, user);
					bookingView.setVisible(false);

				} catch (Exception e1) {

					e1.printStackTrace();
				}

			}
		});

		/**
		 * Checking if your traveling with enkelresa or tur and retur resa and
		 * hiding one calender if your travel with enkelresa
		 */
		bookingView.getenkelResaButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (bookingView.getenkelResaButton().isSelected()) {
					bookingView.getDateChooser2().hide();
					//timeView.getTimeMoneyButton6().hide();
					//timeView.getTimeMoneyButton7().hide();
					//timeView.getTimeMoneyButton8().hide();
					//timeView.getTimeMoneyButton9().hide();
					//timeView.getTimeMoneyButton10().hide();
				}
			}
		});

		bookingView.getTurReturButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (bookingView.getTurReturButton().isSelected()) {
					bookingView.getDateChooser2().show();
				}

			}
		});

	}
}
