import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Numbers {
	
	public static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPoint;
	
	
	
	public static JButton getBtn7() {
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn7.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(10, 134, 63, 52);
		Calculator.frame.getContentPane().add(btn7);
		return btn7;
	}
	public static JButton getBtn8() {
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn8.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(83, 134, 63, 52);
		Calculator.frame.getContentPane().add(btn8);
		return btn8;
	}

	public static JButton getBtn9() {
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn9.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(156, 134, 63, 52);
		Calculator.frame.getContentPane().add(btn9);
		return btn9;
	}

	public static JButton getBtn4() {
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn4.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 196, 63, 52);
		Calculator.frame.getContentPane().add(btn4);

		return btn4;
	}

	public static JButton getBtn5() {
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn5.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(83, 196, 63, 52);
		Calculator.frame.getContentPane().add(btn5);
		return btn5;
	}

	public static JButton getBtn6() {
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn6.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(156, 196, 63, 52);
		Calculator.frame.getContentPane().add(btn6);
		return btn6;
	}

	public static JButton getBtn1() {
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn1.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 258, 63, 52);
		Calculator.frame.getContentPane().add(btn1);
		return btn1;
	}

	public static JButton getBtn2() {
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn2.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(83, 258, 63, 52);
		Calculator.frame.getContentPane().add(btn2);
		return btn2;
	}

	public static JButton getBtn3() {
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn3.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(156, 258, 63, 52);
		Calculator.frame.getContentPane().add(btn3);

		return btn3;
	}
	public static JButton getBtn0() {
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btn0.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 317, 63, 52);
		Calculator.frame.getContentPane().add(btn0);
		return btn0;
	}
	public static JButton getBtnPoint() {
		btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Calculator.textField.getText() + btnPoint.getText();
				Calculator.textField.setText(EnterNumber);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPoint.setBounds(83, 317, 63, 52);
		Calculator.frame.getContentPane().add(btnPoint);
		return btnPoint;
	}
}
