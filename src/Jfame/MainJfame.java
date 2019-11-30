package Jfame;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Operate.OperateString2;
import java.awt.Toolkit;

public class MainJfame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea Result_textArea;
	private boolean flag = false;
	private OperateString2 Result = new OperateString2();
	private String result = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJfame frame = new MainJfame();
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
	public MainJfame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainJfame.class.getResource("/com/sun/javafx/scene/web/skin/OrderedListNumbers_16x16_JFX.png")));
		setTitle("Calculator_brooke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 318);
		contentPane = new JPanel();
		contentPane.setToolTipText("Caculator_brooke");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Button sin_button = new Button("sin");
		sin_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(sin_button.getLabel()+"(");
			}
		});
		sin_button.setBounds(44, 76, 42, 23);
		contentPane.add(sin_button);
		
		Button cos_button = new Button("cos");
		cos_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(cos_button.getLabel()+"(");	
			}
		});
		cos_button.setBounds(92, 76, 42, 23);
		contentPane.add(cos_button);
		
		Button tan_button = new Button("tan");
		tan_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(tan_button.getLabel()+"(");
			}
		});
		tan_button.setBounds(140, 76, 42, 23);
		contentPane.add(tan_button);
		
		Button x_y_button = new Button("x^y");
		x_y_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append("^");
				flag = false;
			}
		});
		x_y_button.setBounds(188, 76, 42, 23);
		contentPane.add(x_y_button);
		
		Button lg_button = new Button("lg");
		lg_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(lg_button)+"(");
			}
		});
		lg_button.setBounds(236, 76, 42, 23);
		contentPane.add(lg_button);
		
		Button ln_button = new Button("ln");
		ln_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(ln_button)+"(");
			}
		});
		ln_button.setBounds(284, 76, 42, 23);
		contentPane.add(ln_button);
		
		Button one_button = new Button("1");
		one_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(one_button));
			}
		});
		one_button.setBounds(44, 117, 54, 23);
		contentPane.add(one_button);
		
		Button two_button = new Button("2");
		two_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(two_button));
			}
		});
		two_button.setBounds(104, 117, 54, 23);
		contentPane.add(two_button);
		
		Button three_button = new Button("3");
		three_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(three_button));
			}
		});
		three_button.setBounds(164, 117, 54, 23);
		contentPane.add(three_button);
		
		Button four_button = new Button("4");
		four_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(four_button));
			}
		});
		four_button.setBounds(44, 154, 54, 23);
		contentPane.add(four_button);
		
		Button five_button = new Button("5");
		five_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(five_button));
			}
		});
		five_button.setBounds(104, 154, 54, 23);
		contentPane.add(five_button);
		
		Button six_button = new Button("6");
		six_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(six_button));
			}
		});
		six_button.setBounds(164, 154, 54, 23);
		contentPane.add(six_button);
		
		Button seven_button = new Button("7");
		seven_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(seven_button));
			}
		});
		seven_button.setBounds(44, 191, 54, 23);
		contentPane.add(seven_button);
		
		Button eight_button = new Button("8");
		eight_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(eight_button));
			}
		});
		eight_button.setBounds(104, 191, 54, 23);
		contentPane.add(eight_button);
		
		Button nine_button = new Button("9");
		nine_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(nine_button));
			}
		});
		nine_button.setBounds(164, 191, 54, 23);
		contentPane.add(nine_button);
		
		Button zero_button = new Button("0");
		zero_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(zero_button));
			}
		});
		zero_button.setBounds(104, 228, 54, 23);
		contentPane.add(zero_button);
		
		Button e_button = new Button("e");
		e_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(e_button));
			}
		});
		e_button.setBounds(44, 228, 54, 23);
		contentPane.add(e_button);
		
		Button point_button = new Button(".");
		point_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				if(Result_textArea.getText() == "")
					Result_textArea.append("0");
				Result_textArea.append(getlabel(point_button));
			}
		});
		point_button.setBounds(164, 228, 54, 23);
		contentPane.add(point_button);
		
		Button leftbra_button = new Button("(");
		leftbra_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(leftbra_button));
			}
		});
		leftbra_button.setBounds(332, 76, 42, 23);
		contentPane.add(leftbra_button);
		
		Button rightbra_button = new Button(")");
		rightbra_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(rightbra_button));
			}
		});
		rightbra_button.setBounds(380, 76, 42, 23);
		contentPane.add(rightbra_button);
		
		Button radical_button = new Button("\u221Ax");
		radical_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) 
					Result_textArea.setText(result+"\u00D7");
				Result_textArea.append("\u221A");
				flag = false;
			}
		});
		radical_button.setBounds(236, 117, 42, 23);
		contentPane.add(radical_button);
		
		Button square_button = new Button("x\u00B2");
		square_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) 
					Result_textArea.setText(result);
				Result_textArea.append("^2");
				flag = false;
			}
		});
		square_button.setBounds(284, 117, 42, 23);
		contentPane.add(square_button);
		
		Button reciprocal_button = new Button("1/x");
		reciprocal_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append("^(-1)");
				flag = false;
			}
		});
		reciprocal_button.setBounds(332, 117, 42, 23);
		contentPane.add(reciprocal_button);
		
		Button factorial_button = new Button("x!");
		factorial_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append("!");
				flag = false;
			}
		});
		factorial_button.setBounds(380, 117, 42, 23);
		contentPane.add(factorial_button);
		
		Button back_button = new Button("\u2190Back");
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Result_textArea.getText();
				if(!str.equals(""))
					Result_textArea.setText(str.substring(0, str.length()-1));
			}
		});
		back_button.setBounds(284, 191, 42, 23);
		contentPane.add(back_button);
		
		Button percent_button = new Button("%");
		percent_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append(getlabel(percent_button));
				flag = false;
			}
		});
		percent_button.setBounds(332, 191, 42, 23);
		contentPane.add(percent_button);
		
		Button plus_button = new Button("+");
		plus_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append(getlabel(plus_button));
				flag = false;
			}
		});
		plus_button.setBounds(236, 154, 42, 23);
		contentPane.add(plus_button);
		
		Button subtract_button = new Button("-");
		subtract_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append(getlabel(subtract_button));
				flag = false;
			}
		});
		subtract_button.setBounds(284, 154, 42, 23);
		contentPane.add(subtract_button);
		
		Button multiply_button = new Button("\u00D7");
		multiply_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append(getlabel(multiply_button));
				flag = false;
			}
		});
		multiply_button.setBounds(332, 154, 42, 23);
		contentPane.add(multiply_button);
		
		Button divide_button = new Button("\u00F7");
		divide_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag)
					Result_textArea.setText(result);
				Result_textArea.append(getlabel(divide_button));
				flag = false;
			}
		});
		divide_button.setBounds(380, 154, 42, 23);
		contentPane.add(divide_button);
		
		Button equal_button = new Button("=");
		equal_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result = Result.calculate(Result_textArea.getText());
				if(!Result_textArea.getText().contains("=") && result != "") {
					Result_textArea.append(getlabel(equal_button)+" "+result);
					flag = true;
				}
			}
		});
		equal_button.setBounds(284, 228, 90, 23);
		contentPane.add(equal_button);
		
		Button pi_button = new Button("\u03C0");
		pi_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					Result_textArea.setText("");
					flag = false;
				}
				Result_textArea.append(getlabel(pi_button));
			}
		});
		pi_button.setBounds(236, 191, 42, 23);
		contentPane.add(pi_button);
		
		Button clear_button = new Button("AC");
		clear_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				Result_textArea.setText("");
				result = "";
			}
		});
		clear_button.setBounds(380, 191, 42, 23);
		contentPane.add(clear_button);
		
		Result_textArea = new JTextArea();
		Result_textArea.setBounds(44, 33, 378, 24);
		contentPane.add(Result_textArea);
		Result_textArea.setEditable(false);
		
	}

	private String getlabel(Button button) {
		return button.getLabel();
	}
}
