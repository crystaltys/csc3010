package webcrawler_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Point;
import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class visualization extends JFrame {

	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				//The try and catch to run the Java Frame
				try {
					visualization frame = new visualization();
					
					//To make the Frame Visible
					frame.setVisible(true);
				} 
				
				catch (Exception e) {
					//Print error if frame not initalized
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public visualization() {
		
		//Start of the main screen
		getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		getContentPane().setBackground(Color.WHITE);
		
		//Top bar name
		setTitle("CSC3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set the bounds of screen
		setBounds(100, 100, 719, 727);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		//Label to contain text for link 1
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(10, 109, 683, 29);
		getContentPane().add(lblNewLabel);
		
		//Label to contain heading for link 1
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(10, 139, 270, 24);
		getContentPane().add(lblNewLabel_11);
		
		//Label to contain text for link 1
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setBounds(10, 179, 683, 29);
		getContentPane().add(lblNewLabel_1);
		
		//Label to contain heading for link 2
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(10, 200, 270, 24);
		getContentPane().add(lblNewLabel_12);
		
		//Label to contain text for link 2
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setBounds(10, 230, 683, 29);
		getContentPane().add(lblNewLabel_2);
		
		//Label to contain heading for link 3
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(10, 260, 270, 24);
		getContentPane().add(lblNewLabel_13);
		
		//Label to contain text for link 3
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_3.setBounds(10, 290, 683, 29);
		getContentPane().add(lblNewLabel_3);
		
		//Label to contain heading for link 4
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(10, 320, 270, 24);
		getContentPane().add(lblNewLabel_14);
		
		//Label to contain text for link 4
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_4.setBounds(10, 350, 683, 29);
		getContentPane().add(lblNewLabel_4);
		
		//Label to contain heading for link 5
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(10, 380, 270, 24);
		getContentPane().add(lblNewLabel_15);
		
		//Label to contain text for link 5
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(SystemColor.textHighlight);
		lblNewLabel_5.setBounds(10, 410, 683, 29);
		getContentPane().add(lblNewLabel_5);
		
		//Label to contain heading for link 6
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_16.setBounds(10, 430, 270, 24);
		getContentPane().add(lblNewLabel_16);
		
		//Label to contain text for link 6
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(SystemColor.textHighlight);
		lblNewLabel_6.setBounds(10, 470, 683, 29);
		getContentPane().add(lblNewLabel_6);
		
		//Label to contain heading for link 7
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_17.setBounds(10, 500, 270, 24);
		getContentPane().add(lblNewLabel_17);
		
		//Label to contain text for link 7
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setForeground(SystemColor.textHighlight);
		lblNewLabel_7.setBounds(10, 530, 683, 29);
		getContentPane().add(lblNewLabel_7);
		
		//Label to contain heading for link 8
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_18.setBounds(10, 560, 270, 24);
		getContentPane().add(lblNewLabel_18);
		
		//Label to contain text for link 8
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setForeground(SystemColor.textHighlight);
		lblNewLabel_8.setBounds(10, 590, 683, 29);
		getContentPane().add(lblNewLabel_8);
		
		//Label to contain heading for link 9
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_19.setBounds(10, 620, 270, 24);
		getContentPane().add(lblNewLabel_19);
		
		//Label to contain text for link 9
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setForeground(SystemColor.textHighlight);
		lblNewLabel_9.setBounds(10, 650, 683, 29);
		getContentPane().add(lblNewLabel_9);
		
		//Search Field for searching
		txtSearch = new JTextField();
		txtSearch.setBackground(SystemColor.textHighlightText);
		txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSearch.setText("Search");
		txtSearch.setBounds(10, 22, 404, 43);
		getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<webcrawler> workers = new ArrayList<>();
				
				workers.add(new webcrawler("https://en.wikipedia.org/wiki/"+txtSearch.getText(), 2));
				ArrayList<String> finallis = new ArrayList<String>();
			   
				for (webcrawler w : workers) {
					
					try {
						w.getThread().join();
						ArrayList<String> visitedns = new ArrayList<String>();
						
						//getting all the crawler links
						//visitedns =w.result();
						for (int i = 0 ; i < visitedns.size();i++) {
							//storing links in array list
							finallis.add(visitedns.get(i));
						}
					}
					catch(InterruptedException ele) {
						ele.printStackTrace();
					}
				}
				//Setting each link to string
				String firstlink = finallis.get(0);
				String secondlink = finallis.get(1);
				String thirdlink = finallis.get(2);
				String fourlink = finallis.get(3);
				String fivelink = finallis.get(4);
				String sixlink = finallis.get(5);
				String sevenlink = finallis.get(6);
				String eightlink = finallis.get(7);
				String ninelink = finallis.get(8);
				String tenlink = finallis.get(9);
			
				
				lblNewLabel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
					        	//On click of link open in desktop
								Desktop.getDesktop().browse(new URI(firstlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					    
					    
					}
				});
				
				//Set the Link to label
				lblNewLabel.setText(firstlink);
				
				
				lblNewLabel_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(secondlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					    
					    
					}
				});
				
				//Set the Link to label
				lblNewLabel_1.setText(secondlink);
				
				lblNewLabel_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					        try {
								Desktop.getDesktop().browse(new URI(thirdlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}  
					}
				});
				//Set the Link to label
				lblNewLabel_2.setText(thirdlink);
				
				lblNewLabel_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(fourlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
				});
				//Set the Link to label
				
				lblNewLabel_3.setText(fourlink);
				
				lblNewLabel_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(fivelink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
				});
				
				//Set the Link to label
				lblNewLabel_4.setText(fivelink);
				
				lblNewLabel_5.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(sixlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
				});
				
				//Set the Link to label
				lblNewLabel_5.setText(sixlink);
				
				lblNewLabel_6.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(sevenlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}					    
					}
				});
				
				//Set the Link to label
				lblNewLabel_6.setText(sevenlink);
				 
				lblNewLabel_7.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(eightlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
				});
				
				//Set the Link to label
				lblNewLabel_7.setText(eightlink);
				
				lblNewLabel_8.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(ninelink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
				});
				
				//Set the Link to label
				lblNewLabel_8.setText(ninelink);
				
				lblNewLabel_9.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					        try {
								Desktop.getDesktop().browse(new URI(tenlink));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (URISyntaxException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
				});
				
				lblNewLabel_9.setText(tenlink);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		//here change the image path
		//In this line just change the image according to your system path
		//Like the one below
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\fiona\\Desktop\\CommentedCode\\information_retrieval\\Web Crawler\\src\\Crawler\\search.png"));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(434, 22, 41, 41);
		getContentPane().add(btnNewButton);
		
	}

}
