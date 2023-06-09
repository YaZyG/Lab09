import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImpulseDurationCalculator extends JFrame {
    private JTextField durationField;
    private JTextField countField;
    private JLabel resultLabel;

    public ImpulseDurationCalculator() {
        setTitle("Калькулятор тривалості імпульсу");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Створення елементів калькулятора
        JLabel durationLabel = new JLabel("Тривалість імпульсу (сек):");
        durationField = new JTextField(10);
        JLabel countLabel = new JLabel("Кількість імпульсів:");
        countField = new JTextField(10);
        JButton calculateButton = new JButton("Розрахувати");
        calculateButton.addActionListener(new CalculateButtonListener());
        resultLabel = new JLabel();

        // Розташування елементів на панелі
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(durationLabel);
        panel.add(durationField);
        panel.add(countLabel);
        panel.add(countField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null); // Центрування вікна

        setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double duration = Double.parseDouble(durationField.getText());
                int count = Integer.parseInt(countField.getText());

                double totalDuration = duration * count;
                resultLabel.setText("Загальна тривалість імпульсів: " + totalDuration + " секунд");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Некоректні дані. Введіть числові значення.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImpulseDurationCalculator());
    }
}
