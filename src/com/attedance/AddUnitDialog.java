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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddUnitDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField unitTextField;

	/**
	 * Launch the application.
	 */
	public  void main() {
		try {
			AddUnitDialog dialog = new AddUnitDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddUnitDialog() {
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
			panel.setBounds(148, 42, 199, 37);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				unitTextField = new JTextField();
				unitTextField.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						unitTextField.selectAll();
					}
				});
				unitTextField.setBorder(new LineBorder(new Color(0, 0, 255)));
				unitTextField.setBounds(10, 11, 179, 20);
				panel.add(unitTextField);
				unitTextField.setColumns(10);
			}
		}
		{
			JLabel lblNewLabel = new JLabel("Unit Name:");
			lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
			lblNewLabel.setBounds(36, 42, 79, 26);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblCourse = new JLabel("Course:");
			lblCourse.setFont(new Font("Arial", Font.BOLD, 13));
			lblCourse.setBounds(36, 122, 79, 26);
			contentPanel.add(lblCourse);
		}
		
		String[] courses = {Data.courses[0].name, Data.courses[1].name, Data.courses[2].name, Data.courses[3].name};
		JComboBox comboBox = new JComboBox(courses);
		comboBox.setBounds(145, 124, 202, 22);
		contentPanel.add(comboBox);
		{
			JLabel lblNewLabel_1 = new JLabel("Add Unit in Course");
			lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
			lblNewLabel_1.setBounds(160, 11, 145, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(unitTextField.getText().equals("")) {
							JOptionPane.showMessageDialog(null," Enter all input!","title",JOptionPane.WARNING_MESSAGE);
						}else {
							//save
						}
						//save
					}
				});
				okButton.setBackground(new Color(255, 255, 255));
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
						AddUnitDialog.this.dispose();
					}
				});
				cancelButton.setFocusable(false);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
