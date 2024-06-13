package com.attedance;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MarkAttendanceDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public  void main() {
		try {
			MarkAttendanceDialog dialog = new MarkAttendanceDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MarkAttendanceDialog() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Course:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 32, 72, 20);
		contentPanel.add(lblNewLabel);
		
		JComboBox courseComboBox = new JComboBox();
		courseComboBox.setBackground(new Color(255, 255, 255));
		courseComboBox.setBounds(122, 31, 157, 22);
		contentPanel.add(courseComboBox);
		
		JLabel lblUnit = new JLabel("Unit:");
		lblUnit.setFont(new Font("Arial", Font.BOLD, 12));
		lblUnit.setBounds(40, 139, 72, 20);
		contentPanel.add(lblUnit);
		
		JComboBox courseComboBox_1 = new JComboBox();
		courseComboBox_1.setBackground(new Color(255, 255, 255));
		courseComboBox_1.setBounds(122, 138, 157, 22);
		contentPanel.add(courseComboBox_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(new Color(192, 192, 192));
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						//navigate to markAttedance list
					}
				});
				okButton.setFocusable(false);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(new Color(192, 192, 192));
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						MarkAttendanceDialog.this.dispose();
					}
				});
				cancelButton.setFocusable(false);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
