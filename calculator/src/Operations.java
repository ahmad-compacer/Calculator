import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Operations {
	public static JButton btnSum, btnMin, btnEquals, btnMul, btnDiv, btnClear, btnDelete, btnPoint_1;
	static double firstnum, secondnum, result;
	static String operations, answer;

	public static JButton getBtnSum() {
		btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Calculator.textField.getText());
				Calculator.textField.setText("");
				operations = "+";
			}
		});
		btnSum.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSum.setBounds(229, 134, 63, 114);
		Calculator.frame.getContentPane().add(btnSum);
		return btnSum;
	}

	public static JButton getBtnMin() {
		btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstnum = Double.parseDouble(Calculator.textField.getText());
				Calculator.textField.setText("");
				operations = "-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMin.setBounds(229, 65, 63, 52);
		Calculator.frame.getContentPane().add(btnMin);
		return btnMin;
	}

	public static JButton getBtnMul() {
		btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Calculator.textField.getText());
				Calculator.textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(229, 317, 63, 52);
		Calculator.frame.getContentPane().add(btnMul);

		return btnMul;
	}

	public static JButton getBtnDiv() {
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Calculator.textField.getText());
				Calculator.textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(229, 258, 63, 52);
		Calculator.frame.getContentPane().add(btnDiv);

		return btnDiv;
	}

	/*
	 * %
	 */
	public static JButton getBtnPoint_1() {
		btnPoint_1 = new JButton("%");
		btnPoint_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(Calculator.textField.getText());
				Calculator.textField.setText("");
				operations = "%";
			}
		});
		btnPoint_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPoint_1.setBounds(156, 318, 63, 52);
		Calculator.frame.getContentPane().add(btnPoint_1);
		return btnPoint_1;
	}

	public static JButton getBtnDelete() {
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;

				if (Calculator.textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(Calculator.textField.getText());
					strB.deleteCharAt(Calculator.textField.getText().length() - 1);
					backspace = strB.toString();
					Calculator.textField.setText(backspace);

				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(10, 65, 133, 52);
		Calculator.frame.getContentPane().add(btnDelete);
		return btnDelete;
	}

	public static JButton getBtnClear() {
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator.textField.setText(null);

			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(156, 65, 63, 52);
		Calculator.frame.getContentPane().add(btnClear);
		return btnClear;
	}

	public static JButton getBtnEquals() {
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;
				secondnum = Double.parseDouble(Calculator.textField.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					Calculator.textField.setText(answer);
				} else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					Calculator.textField.setText(answer);
				} else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					Calculator.textField.setText(answer);
				} else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					Calculator.textField.setText(answer);
				} else if (operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					Calculator.textField.setText(answer);
				}

			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(10, 379, 282, 52);
		Calculator.frame.getContentPane().add(btnEquals);
		return btnEquals;
		
	}

}
