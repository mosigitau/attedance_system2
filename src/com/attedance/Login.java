package com.attedance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;



import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

//this the home page run this file to start the application
//don't change the functionality of this file 
public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameTextField;
	private JPasswordField passwordField;
	
	//image variable from source folder
	private Image img_logo = new ImageIcon(Login.class.getResource("/res/admin.png")).getImage().getScaledInstance(90,90, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(188, 101, 188, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(nameTextField.getText().equals("username")) {
					nameTextField.setText("");
				}else {
					nameTextField.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(nameTextField.getText().equals("")) {
					nameTextField.setText("username");
				}
			}
		});
		nameTextField.setBorder(new LineBorder(new Color(0, 0, 255)));
		nameTextField.setBounds(10, 11, 168, 20);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(103, 101, 79, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 16));
		lblPassword.setBounds(91, 204, 91, 34);
		contentPane.add(lblPassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(188, 191, 188, 47);
		contentPane.add(panel_1);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText().equals("password")) {
					passwordField.setEchoChar('●');
					passwordField.setText("");
				}else {
					passwordField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals("")) {
					passwordField.setText("password");
					
					passwordField.setEchoChar((char)0);
				}
			}
		});
		passwordField.setBorder(new LineBorder(new Color(0, 0, 255)));
		passwordField.setEchoChar((char)0);
		passwordField.setText("password");

		passwordField.setBounds(10, 11, 168, 25);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//navigate to dashboard
				if(validateData()) {
					if(nameTextField.getText().equals(AppData.APP_USERNAME.myData) && passwordField.getText().equals(AppData.App_password.myData)) {
                         HomePage d = new HomePage();// the function will help to navigate to the next page
                         d.main();
					}else {
						JOptionPane.showMessageDialog(null," Wrong password or name!","title",JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null,"Something went Wrong!","title",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 126, 187));
		btnNewButton.setForeground(new Color(26, 0, 26));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(220, 289, 89, 34);
		contentPane.add(btnNewButton);
		
		JLabel icon = new JLabel();
		icon.setBounds(218, 11, 91, 79);
		contentPane.add(icon);
		icon.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
	}
	
	//function to validate user input
	Boolean validateData() {
		if(nameTextField.getText().equals("") || passwordField.getText().equals("")) {
			return false;
		}else if((nameTextField.getText().equals("") || passwordField.getText().equals("")) != true) {
			return true;
		}else {
			return false;
		}
	}
}
