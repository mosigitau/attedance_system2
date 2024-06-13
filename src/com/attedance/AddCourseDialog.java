package com.attedance;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

//this entails a dialog that pop up when add class label is clicked in Home page
public class AddCourseDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField coursetextField;

	/**
	 * Launch the application.
	 */
	public  void main() {
		try {
			AddCourseDialog dialog = new AddCourseDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddCourseDialog() {
		setResizable(false);
		setBackground(new Color(192, 192, 192));
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(157, 38, 212, 41);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				coursetextField = new JTextField();
				coursetextField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						coursetextField.selectAll();
					}
				});
				coursetextField.setBorder(new LineBorder(new Color(0, 0, 255)));
				coursetextField.setBounds(10, 11, 192, 20);
				panel.add(coursetextField);
				coursetextField.setColumns(10);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("Course Name:");
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
			lblNewLabel.setBounds(36, 38, 111, 31);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Add Course in Database");
			lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
			lblNewLabel_1.setBounds(157, 11, 163, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						//this is the Ok Button 
						if(coursetextField.getText().equals("")) {  
							//this message will popUp when the user input is empty
							JOptionPane.showMessageDialog(null," Enter all input!","title",JOptionPane.WARNING_MESSAGE);
						}else {
							//save
							//this is where you will include files to save course in database
						}
					}
				});
				okButton.setBackground(new Color(128, 128, 128));
				okButton.setFocusable(false);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						AddCourseDialog.this.dispose();
					}
				});
				cancelButton.setBackground(new Color(154, 154, 154));
				cancelButton.setFocusable(false);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
