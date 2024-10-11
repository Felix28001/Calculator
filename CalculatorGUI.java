import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame {
    private final JTextField tf_mainPanel = new JTextField();
    private final JButton button_equals = new JButton();
    private final JButton button_removeLast = new JButton();
    private final JButton button_clear = new JButton();
    private final JButton button_clearEntry = new JButton();
    private final JButton button_0 = new JButton();
    private final JButton button_1 = new JButton();
    private final JButton button_2 = new JButton();
    private final JButton button_3 = new JButton();
    private final JButton button_4 = new JButton();
    private final JButton button_5 = new JButton();
    private final JButton button_6 = new JButton();
    private final JButton button_7 = new JButton();
    private final JButton button_8 = new JButton();
    private final JButton button_9 = new JButton();
    private final JButton button_devide = new JButton();
    private final JButton button_multiply = new JButton();
    private final JButton button_minus = new JButton();
    private final JButton button_decimal = new JButton();
    private final JButton button_plus = new JButton();
    private final JButton button_calculationOrder = new JButton();

    public CalculatorGUI() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 335;
        int frameHeight = 502;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Taschenrechner");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(0x2D2D2D));

        tf_mainPanel.setBounds(0, 72, 320, 88);
        tf_mainPanel.setEditable(false);
        tf_mainPanel.setBackground(new Color(0x2D2D2D));
        tf_mainPanel.setHorizontalAlignment(SwingConstants.RIGHT);
        tf_mainPanel.setFont(new Font("Dialog", Font.PLAIN, 36));
        tf_mainPanel.setForeground(Color.WHITE);
        cp.add(tf_mainPanel);
        button_equals.setBounds(240, 184, 80, 56);
        button_equals.setText("=");
        button_equals.setMargin(new Insets(2, 2, 2, 2));
        button_equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_equals_ActionPerformed(evt);
            }
        });
        button_equals.setBackground(new Color(0xFF8000));
        button_equals.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_equals);
        button_removeLast.setBounds(160, 184, 80, 56);
        button_removeLast.setText("<-");
        button_removeLast.setMargin(new Insets(2, 2, 2, 2));
        button_removeLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_removeLast_ActionPerformed(evt);
            }
        });
        button_removeLast.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_removeLast);
        button_clear.setBounds(80, 184, 80, 56);
        button_clear.setText("C");
        button_clear.setMargin(new Insets(2, 2, 2, 2));
        button_clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {button_clear_ActionPerformed(evt);
            }
        });
        button_clear.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_clear);
        button_clearEntry.setFont(new Font("Dialog", Font.BOLD, 28));
        button_clearEntry.setBounds(0, 184, 80, 56);
        button_clearEntry.setText("CE");
        button_clearEntry.setMargin(new Insets(2, 2, 2, 2));
        button_clearEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_clearEntry_ActionPerformed(evt);
            }
        });
        cp.add(button_clearEntry);
        button_8.setBounds(80, 240, 80, 56);
        button_9.setBounds(160, 240, 80, 56);
        button_devide.setBounds(240, 240, 80, 56);
        button_7.setBounds(0, 240, 80, 56);
        button_8.setText("8");
        button_8.setMargin(new Insets(2, 2, 2, 2));
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_8_ActionPerformed(evt);
            }
        });
        button_8.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_8);
        button_9.setText("9");
        button_9.setMargin(new Insets(2, 2, 2, 2));
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_9_ActionPerformed(evt);
            }
        });
        button_9.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_9);
        button_devide.setText("%");
        button_devide.setMargin(new Insets(2, 2, 2, 2));
        button_devide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_divide_ActionPerformed(evt);
            }
        });
        button_devide.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_devide);
        button_7.setText("7");
        button_7.setMargin(new Insets(2, 2, 2, 2));
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_7_ActionPerformed(evt);
            }
        });
        button_7.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_7);
        button_5.setBounds(80, 296, 80, 56);
        button_6.setBounds(160, 296, 80, 56);
        button_multiply.setBounds(240, 296, 80, 56);
        button_4.setBounds(0, 296, 80, 56);
        button_5.setText("5");
        button_5.setMargin(new Insets(2, 2, 2, 2));
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_5_ActionPerformed(evt);
            }
        });
        button_5.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_5);
        button_6.setText("6");
        button_6.setMargin(new Insets(2, 2, 2, 2));
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_6_ActionPerformed(evt);
            }
        });
        button_6.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_6);
        button_multiply.setText("X");
        button_multiply.setMargin(new Insets(2, 2, 2, 2));
        button_multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_multiply_ActionPerformed(evt);
            }
        });
        button_multiply.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_multiply);
        button_4.setText("4");
        button_4.setMargin(new Insets(2, 2, 2, 2));
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_4_ActionPerformed(evt);
            }
        });
        button_4.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_4);
        button_2.setBounds(80, 352, 80, 56);
        button_3.setBounds(160, 352, 80, 56);
        button_minus.setBounds(240, 352, 80, 56);
        button_1.setBounds(0, 352, 80, 56);
        button_2.setText("2");
        button_2.setMargin(new Insets(2, 2, 2, 2));
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_2_ActionPerformed(evt);
            }
        });
        button_2.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_2);
        button_3.setText("3");
        button_3.setMargin(new Insets(2, 2, 2, 2));
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_3_ActionPerformed(evt);
            }
        });
        button_3.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_3);
        button_minus.setText("-");
        button_minus.setMargin(new Insets(2, 2, 2, 2));
        button_minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_minus_ActionPerformed(evt);
            }
        });
        button_minus.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_minus);
        button_1.setText("1");
        button_1.setMargin(new Insets(2, 2, 2, 2));
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_1_ActionPerformed(evt);
            }
        });
        button_1.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_1);
        button_0.setBounds(80, 408, 80, 56);
        button_decimal.setBounds(160, 408, 80, 56);
        button_plus.setBounds(240, 408, 80, 56);
        button_calculationOrder.setBounds(0, 408, 80, 56);
        button_0.setText("0");
        button_0.setMargin(new Insets(2, 2, 2, 2));
        button_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_0_ActionPerformed(evt);
            }
        });
        button_0.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_0);
        button_decimal.setText(",");
        button_decimal.setMargin(new Insets(2, 2, 2, 2));
        button_decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_decimal_ActionPerformed(evt);
            }
        });
        button_decimal.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_decimal);
        button_plus.setText("+");
        button_plus.setMargin(new Insets(2, 2, 2, 2));
        button_plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_plus_ActionPerformed(evt);
            }
        });
        button_plus.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(button_plus);
        button_calculationOrder.setFont(new Font("Dialog", Font.BOLD, 28));
        button_calculationOrder.setText("+");
        button_calculationOrder.setMargin(new Insets(2, 2, 2, 2));
        button_calculationOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_calculationOrder_ActionPerformed(evt);
            }
        });
        cp.add(button_calculationOrder);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }

    Calculator calculator = new Calculator(tf_mainPanel);
    boolean calculationOrder = false;

    public void button_equals_ActionPerformed(ActionEvent evt) {
        tf_mainPanel.setText(calculator.calculate());
        System.out.println(String.join("",calculator.structureCalculationPoint()));
    }

    public void button_removeLast_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("", 1);
        calculator.showCalculation();
    }

    public void button_clear_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("", 2);
        tf_mainPanel.setText(String.join("", calculator.calculations));
    }

    public void button_clearEntry_ActionPerformed(ActionEvent evt) {
    }

    public void button_calculationOrder_ActionPerformed(ActionEvent evt) {
        calculationOrder = !calculationOrder;
        if (calculationOrder) {
            button_calculationOrder.setText("*");
        }
        else {
            button_calculationOrder.setText("+");
        }
    }

    //
    // numbers
    //
    public void button_0_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("0");
        calculator.showCalculation();
    }

    public void button_1_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("1");
        calculator.showCalculation();
    }

    public void button_2_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("2");
        calculator.showCalculation();
    }

    public void button_3_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("3");
        calculator.showCalculation();
    }

    public void button_4_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("4");
        calculator.showCalculation();
    }

    public void button_5_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("5");
        calculator.showCalculation();
    }

    public void button_6_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("6");
        calculator.showCalculation();
    }

    public void button_7_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("7");
        calculator.showCalculation();
    }

    public void button_8_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("8");
        calculator.showCalculation();
    }

    public void button_9_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("9");
        calculator.showCalculation();
    }

    //
    // operators
    //
    public void button_divide_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("/");
        calculator.showCalculation();
    }

    public void button_multiply_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("*");
        calculator.showCalculation();
    }

    public void button_minus_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("-");
        calculator.showCalculation();
    }

    public void button_plus_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation("+");
        calculator.showCalculation();
    }

    public void button_decimal_ActionPerformed(ActionEvent evt) {
        calculator.modulateCalculation(".");
        calculator.showCalculation();
    }
}
