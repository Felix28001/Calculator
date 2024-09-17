import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Taschenrechner extends JFrame {
    private final JTextField nfAnzeige = new JTextField();
    private final JButton bIstGleich = new JButton();
    private final JButton bC = new JButton();
    private final JButton bCE = new JButton();
    private final JButton bSpace1 = new JButton();
    private final JButton b8 = new JButton();
    private final JButton b9 = new JButton();
    private final JButton bDurch = new JButton();
    private final JButton b7 = new JButton();
    private final JButton b5 = new JButton();
    private final JButton b6 = new JButton();
    private final JButton bMal = new JButton();
    private final JButton b4 = new JButton();
    private final JButton b2 = new JButton();
    private final JButton b3 = new JButton();
    private final JButton bMinus = new JButton();
    private final JButton b1 = new JButton();
    private final JButton b0 = new JButton();
    private final JButton bKomma = new JButton();
    private final JButton bPlus = new JButton();
    private final JButton bSpace3 = new JButton();

    public Taschenrechner() {
        // Frame init
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
        // Anfang Komponenten
        cp.setBackground(new Color(0x2D2D2D));

        nfAnzeige.setBounds(0, 72, 320, 88);
        nfAnzeige.setEditable(false);
        nfAnzeige.setBackground(new Color(0x2D2D2D));
        nfAnzeige.setHorizontalAlignment(SwingConstants.RIGHT);
        nfAnzeige.setFont(new Font("Dialog", Font.PLAIN, 36));
        nfAnzeige.setForeground(Color.WHITE);
        cp.add(nfAnzeige);
        bIstGleich.setBounds(240, 184, 80, 56);
        bIstGleich.setText("=");
        bIstGleich.setMargin(new Insets(2, 2, 2, 2));
        bIstGleich.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bIstGleich_ActionPerformed(evt);
            }
        });
        bIstGleich.setBackground(new Color(0xFF8000));
        bIstGleich.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bIstGleich);
        bC.setBounds(160, 184, 80, 56);
        bC.setText("C");
        bC.setMargin(new Insets(2, 2, 2, 2));
        bC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bC_ActionPerformed(evt);
            }
        });
        bC.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bC);
        bCE.setBounds(80, 184, 80, 56);
        bCE.setText("CE");
        bCE.setMargin(new Insets(2, 2, 2, 2));
        bCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bCE_ActionPerformed(evt);
            }
        });
        bCE.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bCE);
        bSpace1.setBounds(0, 184, 80, 56);
        bSpace1.setText("Space");
        bSpace1.setMargin(new Insets(2, 2, 2, 2));
        bSpace1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bSpace1_ActionPerformed(evt);
            }
        });
        cp.add(bSpace1);
        b8.setBounds(80, 240, 80, 56);
        b9.setBounds(160, 240, 80, 56);
        bDurch.setBounds(240, 240, 80, 56);
        b7.setBounds(0, 240, 80, 56);
        b8.setText("8");
        b8.setMargin(new Insets(2, 2, 2, 2));
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b8_ActionPerformed(evt);
            }
        });
        b8.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b8);
        b9.setText("9");
        b9.setMargin(new Insets(2, 2, 2, 2));
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b9_ActionPerformed(evt);
            }
        });
        b9.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b9);
        bDurch.setText("%");
        bDurch.setMargin(new Insets(2, 2, 2, 2));
        bDurch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bDurch_ActionPerformed(evt);
            }
        });
        bDurch.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bDurch);
        b7.setText("7");
        b7.setMargin(new Insets(2, 2, 2, 2));
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b7_ActionPerformed(evt);
            }
        });
        b7.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b7);
        b5.setBounds(80, 296, 80, 56);
        b6.setBounds(160, 296, 80, 56);
        bMal.setBounds(240, 296, 80, 56);
        b4.setBounds(0, 296, 80, 56);
        b5.setText("5");
        b5.setMargin(new Insets(2, 2, 2, 2));
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b5_ActionPerformed(evt);
            }
        });
        b5.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b5);
        b6.setText("6");
        b6.setMargin(new Insets(2, 2, 2, 2));
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b6_ActionPerformed(evt);
            }
        });
        b6.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b6);
        bMal.setText("X");
        bMal.setMargin(new Insets(2, 2, 2, 2));
        bMal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bMal_ActionPerformed(evt);
            }
        });
        bMal.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bMal);
        b4.setText("4");
        b4.setMargin(new Insets(2, 2, 2, 2));
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b4_ActionPerformed(evt);
            }
        });
        b4.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b4);
        b2.setBounds(80, 352, 80, 56);
        b3.setBounds(160, 352, 80, 56);
        bMinus.setBounds(240, 352, 80, 56);
        b1.setBounds(0, 352, 80, 56);
        b2.setText("2");
        b2.setMargin(new Insets(2, 2, 2, 2));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2_ActionPerformed(evt);
            }
        });
        b2.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b2);
        b3.setText("3");
        b3.setMargin(new Insets(2, 2, 2, 2));
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b3_ActionPerformed(evt);
            }
        });
        b3.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b3);
        bMinus.setText("-");
        bMinus.setMargin(new Insets(2, 2, 2, 2));
        bMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bMinus_ActionPerformed(evt);
            }
        });
        bMinus.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bMinus);
        b1.setText("1");
        b1.setMargin(new Insets(2, 2, 2, 2));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1_ActionPerformed(evt);
            }
        });
        b1.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b1);
        b0.setBounds(80, 408, 80, 56);
        bKomma.setBounds(160, 408, 80, 56);
        bPlus.setBounds(240, 408, 80, 56);
        bSpace3.setBounds(0, 408, 80, 56);
        b0.setText("0");
        b0.setMargin(new Insets(2, 2, 2, 2));
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b0_ActionPerformed(evt);
            }
        });
        b0.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(b0);
        bKomma.setText(",");
        bKomma.setMargin(new Insets(2, 2, 2, 2));
        bKomma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bKomma_ActionPerformed(evt);
            }
        });
        bKomma.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bKomma);
        bPlus.setText("+");
        bPlus.setMargin(new Insets(2, 2, 2, 2));
        bPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bPlus_ActionPerformed(evt);
            }
        });
        bPlus.setFont(new Font("Dialog", Font.BOLD, 28));
        cp.add(bPlus);
        bSpace3.setText("Space");
        bSpace3.setMargin(new Insets(2, 2, 2, 2));
        bSpace3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bSpace3_ActionPerformed(evt);
            }
        });
        cp.add(bSpace3);

        // Ende Komponenten
        setVisible(true);
    } // end of public Taschenrechner

    public static void main(String[] args) {
        new Taschenrechner();
    } // end of main

    String rechnung = "";
    ArrayList<String> rechnungen = new ArrayList();

    //
    //Logik
    //
    public double calculate(ArrayList<String> operatoren) {
        int lenght = operatoren.size();
        double number3 = 0;
        for (int i = 0; i < lenght - 2; i+=2) {
            double number1 = Double.parseDouble(operatoren.get(i));
            String operator = operatoren.get(i + 1);
            double number2 = Double.parseDouble(operatoren.get(i + 2));
            if (i > 0){
                number1 = number3;
            }
            number3 = applyOperator(number1, number2, operator);

            number1 = number2;
            number2 = number3;
        }

        return number3;
    }
    public double applyOperator(double a, double b, String operator){
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }

    public static ArrayList<String> structureCalculation(ArrayList<String> operatoren) {
        ArrayList<String> structured = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i < operatoren.size(); i++) {

            if (checkIfNumber(operatoren.get(i))) {
                temp = temp + operatoren.get(i);
            } else {
                if (temp != "") {
                    structured.add(temp);
                }
                structured.add(operatoren.get(i));
                temp = "";
            }
            if (i == operatoren.size() - 1) {
                structured.add(temp);
            }
        }
        return structured;
    }

    public static boolean checkIfOperator(String a){
        if (a == "*" || a == "/" || a == "-" || a == "+") {
            return true;
        }
        return false;
    }
    public static boolean checkIfNumber(String a) {
        if (a == ".") {
            return true;
        }
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void modulateCalculation(String operator) {
        rechnungen.add(operator);
        showCalculation();
    }

    public void modulateCalculation(String operator, int clear) {
        rechnungen.add(operator);
        if (clear == 1 && rechnungen.size() > 1) {
            rechnungen.remove(rechnungen.size() - 1);
            rechnungen.remove(rechnungen.size() - 1);
        }
        if (clear == 2) {
            rechnungen.clear();
        }
        showCalculation();
    }

    public void showCalculation() {
        rechnung = String.join("", rechnungen);
        nfAnzeige.setText(rechnung);
    }

    //
    // Bedienung
    //
    public void bIstGleich_ActionPerformed(ActionEvent evt) {
        System.out.println(calculate(rechnungen));
        nfAnzeige.setText(calculate(rechnungen) + "");
    }

    public void bC_ActionPerformed(ActionEvent evt) {
        modulateCalculation("", 1);
    }

    public void bCE_ActionPerformed(ActionEvent evt) {
        modulateCalculation("", 2);
    }

    //
    // Zahlen
    //
    public void b0_ActionPerformed(ActionEvent evt) {
        modulateCalculation("0");
    }

    public void b1_ActionPerformed(ActionEvent evt) {
        modulateCalculation("1");
    }

    public void b2_ActionPerformed(ActionEvent evt) {
        modulateCalculation("2");
    }

    public void b3_ActionPerformed(ActionEvent evt) {
        modulateCalculation("3");
    }

    public void b4_ActionPerformed(ActionEvent evt) {
        modulateCalculation("4");
    }

    public void b5_ActionPerformed(ActionEvent evt) {
        modulateCalculation("5");
    }

    public void b6_ActionPerformed(ActionEvent evt) {
        modulateCalculation("6");
    }

    public void b7_ActionPerformed(ActionEvent evt) {
        modulateCalculation("7");
    }

    public void b8_ActionPerformed(ActionEvent evt) {
        modulateCalculation("8");
    }

    public void b9_ActionPerformed(ActionEvent evt) {
        modulateCalculation("9");
    }

    //
    // Operatoren
    //
    public void bDurch_ActionPerformed(ActionEvent evt) {
        modulateCalculation("/");
    }

    public void bMal_ActionPerformed(ActionEvent evt) {
        modulateCalculation("*");
    }

    public void bMinus_ActionPerformed(ActionEvent evt) {
        modulateCalculation("-");
    }

    public void bPlus_ActionPerformed(ActionEvent evt) {
        modulateCalculation("+");
    }

    public void bKomma_ActionPerformed(ActionEvent evt) {
        modulateCalculation(".");
    }

    //
    // Space
    //
    public void bSpace1_ActionPerformed(ActionEvent evt) {
    }

    public void bSpace3_ActionPerformed(ActionEvent evt) {
    }
}
