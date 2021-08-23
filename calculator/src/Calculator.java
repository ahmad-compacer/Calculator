import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	public static JFrame frame;
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {

		getFrame();
		getTextField();
		Numbers.getBtn1();
		Numbers.getBtn2();
		Numbers.getBtn3();
		Numbers.getBtn4();
		Numbers.getBtn5();
		Numbers.getBtn6();
		Numbers.getBtn7();
		Numbers.getBtn8();
		Numbers.getBtn9();
		Numbers.getBtn0();
		Numbers.getBtnPoint();
		Operations.getBtnSum();
		Operations.getBtnMin();
		Operations.getBtnDiv();
		Operations.getBtnMul();
		Operations.getBtnEquals();
		Operations.getBtnDelete();
		Operations.getBtnClear();
		Operations.getBtnPlusMin();
	}
	/*
	 * Fram design and title
	 */
	public JFrame getFrame() {
		frame = new JFrame();
		frame.setTitle("Ahmad Calculator");
		frame.setBounds(100, 100, 321, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		return frame;
	}
	/*
	 * Text Field design
	 */
	public JTextField getTextField() {
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 282, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		return textField;
	}
	
}
