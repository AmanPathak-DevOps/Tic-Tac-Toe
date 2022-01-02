package tic.tac.toe;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class TicTacToe implements ActionListener{
	Random r=new Random();
	JFrame jframe=new JFrame();
	JPanel title_panel=new JPanel();
	JPanel panel_button=new JPanel();
	JLabel textfield=new JLabel();
	JButton[] Button=new JButton[9];
	boolean player1_turn; // turn of player 1
	TicTacToe() {
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(200,0,800,700);
                jframe.setResizable(false);
		jframe.getContentPane().setBackground(Color.GRAY);
		jframe.setLayout(new BorderLayout());
		jframe.setVisible(true);
		textfield.setBackground(Color.DARK_GRAY);
		textfield.setForeground(Color.blue);
		textfield.setFont(new Font("Ink Free",Font.BOLD,95));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("TIC-TAC-TOE");
		textfield.setOpaque(true);
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(200,100,600,100);
		
		panel_button.setLayout(new GridLayout(3,3));
		panel_button.setBackground(new Color(150,150,150));
		for(int i=0;i<9;i++) {
			Button[i]=new JButton();
			panel_button.add(Button[i]);
			Button[i].setFont(new Font("Mv Boli",Font.BOLD,120));
			Button[i].setFocusable(false);
			Button[i].addActionListener(this);	
		}
		title_panel.add(textfield);
		jframe.add(title_panel,BorderLayout.NORTH);
		jframe.add(panel_button);
		
		firstTurn();
		
	}
	public void firstTurn() {
		try {
			for(int i=0;i<9;i++) {
				Button[i].setEnabled(false);
			}
			Thread.sleep(2000);
			for(int i=0;i<9;i++) {
				Button[i].setEnabled(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(r.nextInt(2)==0) {
			if(count!=8) {
			player1_turn=true;
			textfield.setText("X Turn");
			} else {
				check();
			}
		} else {
			if(count!=8) {
			player1_turn=false;
			textfield.setText("0 Turn");
			} else {
				check();
			}
		}
	}
	public void check() {
		if(
				Button[0].getText()=="0" &&
				Button[1].getText()=="0" &&
				Button[2].getText()=="0")  {
			Owins(0,1,2);
		} else 
			if(
					Button[3].getText()=="0" &&
					Button[4].getText()=="0" &&
					Button[5].getText()=="0") {
				Owins(3,4,5);
			} else
				if(
						Button[6].getText()=="0" &&
						Button[7].getText()=="0" &&
						Button[8].getText()=="0") {
					Owins(6,7,8);
				} else
					if(
							Button[0].getText()=="0" &&
							Button[3].getText()=="0" &&
							Button[6].getText()=="0") {
						Owins(0,3,6);
					} else
						if( 
								Button[1].getText()=="0" &&
								Button[4].getText()=="0" &&
								Button[7].getText()=="0") {
							Owins(1,4,7);
						} else
							if(
									Button[2].getText()=="0" &&
									Button[5].getText()=="0" &&
									Button[8].getText()=="0") {
								Owins(2,5,8);
							} else 
								if(
										Button[0].getText()=="0" &&
										Button[4].getText()=="0" &&
										Button[8].getText()=="0") {
									Owins(0,4,8);
								} else 
									if(
											Button[2].getText()=="0" &&
											Button[4].getText()=="0" &&
											Button[6].getText()=="0") {
										Owins(2,4,6);
									} else 
										if(
												Button[0].getText()=="X" &&
												Button[1].getText()=="X" &&
												Button[2].getText()=="X") {
											Xwins(0,1,2);
										} else 
											if(
													Button[3].getText()=="X" &&
													Button[4].getText()=="X" &&
													Button[5].getText()=="X") {
												Xwins(3,4,5);
											} else
												if(
														Button[6].getText()=="X" &&
														Button[7].getText()=="X" &&
														Button[8].getText()=="X") {
													Xwins(6,7,8);
												} else
													if(
															Button[0].getText()=="X" &&
															Button[3].getText()=="X" &&
															Button[6].getText()=="X") {
														Xwins(0,3,6);
													} else 
														if(
																Button[1].getText()=="X" &&
																Button[4].getText()=="X" &&
																Button[7].getText()=="X") {
															Xwins(1,4,7);
														} else
															if(
																	Button[2].getText()=="X" &&
																	Button[5].getText()=="X" &&
																	Button[8].getText()=="X") {
																Xwins(2,5,8);
															} else
																if(
																		Button[0].getText()=="X" &&
																		Button[4].getText()=="X" &&
																		Button[8].getText()=="X") {
																	Xwins(0,4,8);
																} else 
																	if(
																			Button[2].getText()=="X" &&
																			Button[4].getText()=="X" &&
																			Button[6].getText()=="X") {
																		Xwins(2,4,6);
																	}  else {
																		if(((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[3].getText()=="X" || Button[3].getText()=="0")) &&
																				((Button[1].getText()=="X"|| Button[1].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[3].getText()=="X" || Button[3].getText()=="0")) &&
																				((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[3].getText()=="X" || Button[3].getText()=="0")) &&
																				((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[4].getText()=="X" || Button[4].getText()=="0")) &&
																				((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[5].getText()=="X" || Button[1].getText()=="0")) &&
																				((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[6].getText()=="X" || Button[6].getText()=="0")) &&
																				((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0")) &&
																				((Button[0].getText()=="X" || Button[0].getText()=="0") && (Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[8].getText()=="X" || Button[8].getText()=="0")) &&
																				((Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[4].getText()=="X" || Button[4].getText()=="0")) &&
																				((Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[5].getText()=="X" || Button[5].getText()=="0")) &&
																				((Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[6].getText()=="X" || Button[6].getText()=="0")) &&
																				((Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0")) &&
																				((Button[1].getText()=="X" || Button[1].getText()=="0") && (Button[2].getText()=="X" || Button[2].getText()=="0") && (Button[8].getText()=="X" || Button[8].getText()=="0")) &&
																				((Button[3].getText()=="X" || Button[3].getText()=="0") && (Button[4].getText()=="X" || Button[4].getText()=="0") && (Button[6].getText()=="X" || Button[6].getText()=="0")) &&
																				((Button[3].getText()=="X" || Button[3].getText()=="0") && (Button[4].getText()=="X" || Button[4].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0")) &&
																				((Button[3].getText()=="X" || Button[3].getText()=="0") && (Button[4].getText()=="X" || Button[4].getText()=="0") && (Button[8].getText()=="X" || Button[8].getText()=="0")) &&
																				((Button[4].getText()=="X" || Button[4].getText()=="0") && (Button[5].getText()=="X" || Button[5].getText()=="0") && (Button[6].getText()=="X" || Button[6].getText()=="0")) &&
																				((Button[4].getText()=="X" || Button[4].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0") && (Button[8].getText()=="X" || Button[8].getText()=="0")) &&
																				((Button[5].getText()=="X" || Button[5].getText()=="0") && (Button[6].getText()=="X" || Button[6].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0")) &&
																				((Button[5].getText()=="X" || Button[5].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0") && (Button[7].getText()=="X" || Button[7].getText()=="0"))
																				) {
																				method();	
																		} 
																	
																	}
	}
	public void method() {
		textfield.setText("Match Tied");
	}
	public void Xwins(int a,int b,int c) {
			if(count<8) {
				Button[a].setBackground(Color.GREEN);
				Button[b].setBackground(Color.GREEN);
				Button[c].setBackground(Color.GREEN);
				for(int i=0;i<9;i++) {
					Button[i].setEnabled(false);
				}
				textfield.setText("X Wins");
			} else 
				if(count==8) {
					if((a==0 && b==1 && c==2) || (a==3 && b==4 && c==5) || (a==6 && b==7 && c==8) || (a==0 && b==3 && c==6) || (a==1 && b==4 && c==7) || (a==2 && b==5 && c==8) || (a==0 && b==4 && c==8) || (a==2 && b==4 && c==6)) {
						Button[a].setBackground(Color.GREEN);
						Button[b].setBackground(Color.GREEN);
						Button[c].setBackground(Color.GREEN);
						for(int i=0;i<9;i++) {
							Button[i].setEnabled(false);
						}
						textfield.setText("X Wins");
					} else
					{
						textfield.setText("Match Tied");
					}
				}
	}
	public void Owins(int a,int b,int c) {
		if(count<8) {
			Button[a].setBackground(Color.GREEN);
			Button[b].setBackground(Color.GREEN);
			Button[c].setBackground(Color.GREEN);
			for(int i=0;i<9;i++) {
				Button[i].setEnabled(false);
			}
			textfield.setText("0 Wins");
		} else 
			if(count==8) {
				if((a==0 && b==1 && c==2) || (a==3 && b==4 && c==5) || (a==6 && b==7 && c==8) || (a==0 && b==3 && c==6) || (a==1 && b==4 && c==7) || (a==2 && b==5 && c==8) || (a==0 && b==4 && c==8) || (a==2 && b==4 && c==6)) {
					Button[a].setBackground(Color.GREEN);
					Button[b].setBackground(Color.GREEN);
					Button[c].setBackground(Color.GREEN);
					for(int i=0;i<9;i++) {
						Button[i].setEnabled(false);
					}
					textfield.setText("0 Wins");
				} else
				{
					textfield.setText("Match Tied");
					
				}
			}
	}
	int count=-1;
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<9;i++) {
			if(e.getSource()==Button[i]) {
				if(player1_turn) {
					if(Button[i].getText()=="") {
						Button[i].setForeground(new Color(255,0,0));
						Button[i].setText("X");
						Button[i].setEnabled(false);
						count++;
						if(count<8) {
						player1_turn=false;						
						textfield.setText("0 Turn");
						check();
						} else 
						if(count==8) {
//							textfield.setText("Now Watch The Result");
							check();
//							textfield.setText("Match Tied");
						}
					} 
					} else {
						if(Button[i].getText()=="") {
							Button[i].setForeground(new Color(0,0,255));
							Button[i].setText("0");
							Button[i].setEnabled(false);
							count++;
							if(count<8) {
							player1_turn=true;
							textfield.setText("X Turn");
							check();
							} else 
							if(count==8) {
//								textfield.setText("Now Watch The Result");
								check();
//								textfield.setText("Match Tied");
							}
						}
				}
			}
		}
	}
}
