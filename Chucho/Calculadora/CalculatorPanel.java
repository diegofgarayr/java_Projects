package calculadorafercho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculatorPanel extends JPanel {
    private JTextField display;
    private final JButton[] numberButtons;
    private final JButton addButton;
    private final JButton subtractButton;
    private final JButton multiplyButton;
    private final JButton divideButton;
    private final JButton equalsButton;
    private double num1, num2, result;
    private String operator;

    public CalculatorPanel() {
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            int number = i;
            numberButtons[i].addActionListener((ActionEvent e) -> {
                display.setText(display.getText() + number);
            });
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalsButton);

        add(buttonPanel, BorderLayout.CENTER);

        addButton.addActionListener(e -> setOperator("+"));
        subtractButton.addActionListener(e -> setOperator("-"));
        multiplyButton.addActionListener(e -> setOperator("*"));
        divideButton.addActionListener(e -> setOperator("/"));

        equalsButton.addActionListener(e -> calculateResult());
    }

    private void setOperator(String op) {
        num1 = Double.parseDouble(display.getText());
        operator = op;
        display.setText("");
    }

    private void calculateResult() {
        num2 = Double.parseDouble(display.getText());
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    display.setText("Error");
                    return;
                }
            }
        }
        display.setText(String.valueOf(result));
    }
}

