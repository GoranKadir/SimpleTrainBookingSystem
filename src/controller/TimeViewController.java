package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import com.teamgoran.model.Booking;
import com.teamgoran.model.User;
import view.ConfirmView;
import view.TimeView;

public class TimeViewController {
	
	double startSum;

	public double getStartSum() {
		return startSum;
	}

	public void setStartSum(double startSum) {
		this.startSum = startSum;
	}

	public TimeViewController(TimeView timeView, Booking booking, User user) {

		timeView.getConfirmButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				/**
				 * Om en viss tid/pengar är vald Så ska baserat på user ge
				 * rabatt! Det ska finnas en start Summan på varje select
				 * radioButton Sedan anropa discount och skriva ut summan i
				 * ConfirmView
				 */

				/**
				 * This is for the radio buttons in the BookingView class Its a
				 * start sum that every button have. And if you are a
				 * student/adult/kid/pensioner it will give you a discount.
				 */

				try {
					if (timeView.getTimeMoneyButton1().isSelected()) {
						setStartSum(350);
					}

					else if (timeView.getTimeMoneyButton2().isSelected()) {
						setStartSum(400);
					}

					else if (timeView.getTimeMoneyButton3().isSelected()) {
						setStartSum(500);
					}

					else if (timeView.getTimeMoneyButton4().isSelected()) {
						setStartSum(500);

					} else if (timeView.getTimeMoneyButton5().isSelected()) {
						setStartSum(450);
					}

					/**
					 * This is for the return back radio buttoms
					 */

					if (timeView.getTimeMoneyButton6().isSelected()) {
						setStartSum(350);
					}

					else if (timeView.getTimeMoneyButton7().isSelected()) {
						setStartSum(600);
					}

					else if (timeView.getTimeMoneyButton8().isSelected()) {
						setStartSum(900);
					}

					else if (timeView.getTimeMoneyButton9().isSelected()) {
						setStartSum(250);

					} else if (timeView.getTimeMoneyButton10().isSelected()) {
						setStartSum(200);
					}

					double rabatt = user.getDiscount();
					double s = 100 - rabatt;
					double rabattSum = (s * getStartSum()) / 100;

					ConfirmView confirmView = new ConfirmView(rabattSum, booking, user);
					confirmView.setVisible(true);
					timeView.setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

	}

}
