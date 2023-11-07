
package calculadorafercho;
import javax.swing.*;

public class CalculatorFrame extends JFrame {
    private CalculatorPanel calculatorPanel;

    public CalculatorFrame() {
        calculatorPanel = new CalculatorPanel();
        add(calculatorPanel);
        
        setTitle("Calculadora Básica");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorFrame());
    }
}

