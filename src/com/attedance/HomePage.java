package com.attedance;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//  ***********Note our Home Page is responsive *****************


public class HomePage {
	private static Image img = new ImageIcon(Login.class.getResource("/res/admin.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH);
	private static Image imgB = new ImageIcon(Login.class.getResource("/res/newBook.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH);
	private static Image imgC = new ImageIcon(Login.class.getResource("/res/verified.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH);

	public  void main() {
		
		
		JFrame frame = new JFrame("Attedance System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel menuBar = new JPanel();
		menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));
		menuBar.setPreferredSize(new Dimension(200, 600));
		
		//add class button
		JLabel add_class = new JLabel("Add Course");
		add_class.setIcon(new ImageIcon(img));
		add_class.setHorizontalAlignment(JLabel.LEADING);
		add_class.setForeground(new Color(64, 0, 64));
		add_class.setFont(new Font("Arial", Font.BOLD, 16));
		add_class.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddCourseDialog ac = new AddCourseDialog();
				ac.main();
			}
		});
		
		
		//add button unit
		JLabel add_unit = new JLabel("Add Unit");
		add_unit.setIcon(new ImageIcon(imgB));
		add_unit.setHorizontalAlignment(JLabel.LEADING);
		add_unit.setForeground(new Color(64, 0, 64));
		add_unit.setFont(new Font("Arial", Font.BOLD, 16));
		add_unit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddUnitDialog au = new AddUnitDialog();
				au.main();
			}
		});
		
		//add unit button
		JLabel add_Student = new JLabel("Add Student");
		add_Student.setIcon(new ImageIcon(imgC));
		add_Student.setHorizontalAlignment(JLabel.LEADING);
		add_Student.setForeground(new Color(64, 0, 64));
		add_Student.setFont(new Font("Arial", Font.BOLD, 16));
		add_Student.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddStudentDialog as = new AddStudentDialog();
				as.main();
			}
		});
		
		//mark attendance
		JLabel mark_attendance = new JLabel("Mark Attedance");
		mark_attendance.setIcon(new ImageIcon(imgB));
		mark_attendance.setForeground(new Color(64, 0, 64));
		mark_attendance.setFont(new Font("Arial", Font.BOLD, 16));
		mark_attendance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//
				MarkAttendanceDialog ma = new MarkAttendanceDialog();
				ma.main();
			}
			});
		//add unit button
				JLabel report = new JLabel("Report");
				report.setIcon(new ImageIcon(imgC));
				report.setHorizontalAlignment(JLabel.LEADING);
				report.setForeground(new Color(64, 0, 64));
				report.setFont(new Font("Arial", Font.BOLD, 16));
				report.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					}
				});
				
				
		menuBar.add(add_class);
		menuBar.add(add_unit);
		menuBar.add(add_Student);
		menuBar.add(mark_attendance);
		menuBar.add(report);
		
		for(Component component : menuBar.getComponents()) {
			((JComponent)component).setAlignmentX(Component.CENTER_ALIGNMENT);
			((JComponent)component).setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
		}
		
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("Admission");
		tableModel.addColumn("Name");
		tableModel.addColumn("Course");
		
		for(int i = 0; i < 10; i++) {
			tableModel.addRow(new Object[] {Data.students[i].admission, Data.students[i].name, Data.students[i].course.name});
		}
		
		JTable table = new JTable(tableModel);
		JScrollPane tableScrollPane = new JScrollPane(table);
		
		mainPanel.add(menuBar, BorderLayout.WEST);
		mainPanel.add(tableScrollPane, BorderLayout.CENTER);
		
		frame.add(mainPanel);
		frame.setMinimumSize(new Dimension(400, 300));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame.setVisible(true);
	}

}
