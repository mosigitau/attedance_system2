package com.attedance;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//this is  a diolog that popUp when Add Student label is called in HomePage
public class AddStudentDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField AdmissionTextField;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public void main() {
		try {
			AddStudentDialog dialog = new AddStudentDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddStudentDialog() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(176, 21, 204, 26);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				AdmissionTextField = new JTextField();
				AdmissionTextField.setBorder(new LineBorder(new Color(0, 0, 255)));
				AdmissionTextField.setBounds(0, 0, 204, 20);
				panel.add(AdmissionTextField);
				AdmissionTextField.setColumns(10);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("Admission:");
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
			lblNewLabel.setBounds(39, 21, 94, 20);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblName = new JLabel("Name:");
			lblName.setFont(new Font("Arial", Font.BOLD, 12));
			lblName.setBounds(39, 73, 94, 20);
			contentPanel.add(lblName);
		}
		{
			JLabel lblCourse = new JLabel("Course:");
			lblCourse.setFont(new Font("Arial", Font.BOLD, 12));
			lblCourse.setBounds(39, 124, 94, 20);
			contentPanel.add(lblCourse);
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBounds(176, 73, 204, 26);
			contentPanel.add(panel);
			{
				nameTextField = new JTextField();
				nameTextField.setColumns(10);
				nameTextField.setBorder(new LineBorder(new Color(0, 0, 255)));
				nameTextField.setBounds(0, 0, 204, 20);
				panel.add(nameTextField);
			}
		}
		{
			//this is an array that displays data from Data.java file 
			String[] courses = {Data.courses[0].name, Data.courses[1].name, Data.courses[2].name, Data.courses[3].name};
			JComboBox courseComboBox = new JComboBox(courses);
			courseComboBox.setBounds(176, 123, 204, 22);
			contentPanel.add(courseComboBox);
		}
		{
			//this is an array that displays data from Data.java file 
			String[] units = {Data.units[0].unitName, Data.units[1].unitName, Data.units[2].unitName, Data.units[3].unitName};
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
						//save
						if(nameTextField.getText().equals("") || AdmissionTextField.getText().equals("")) {
							JOptionPane.showMessageDialog(null," Enter all input!","title",JOptionPane.WARNING_MESSAGE);
						}else {
							//save
							//here to include fuction/ method to save input
						}
					}
				});
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
						AddStudentDialog.this.dispose();
					}
				});
				cancelButton.setFocusable(false);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
