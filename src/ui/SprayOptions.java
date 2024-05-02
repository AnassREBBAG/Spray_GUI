package ui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class SprayOptions extends JPanel {

    private JComboBox<String> colorComboBox;
    private JComboBox<Integer> sizeComboBox;

    public SprayOptions() {
        setLayout(new GridLayout(2, 1));

        // Initialize components
        colorComboBox = new JComboBox<>(new String[]{"Red", "Green", "Blue"}); // Example colors
        sizeComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5}); // Example sizes

        // Add components to panel
        add(new JLabel("Color:"));
        add(colorComboBox);
        add(new JLabel("Size:"));
        add(sizeComboBox);
    }
}
