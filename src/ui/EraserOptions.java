package ui;

import javax.swing.*;
import java.awt.*;

public class EraserOptions extends JPanel {

    private JComboBox<String> eraserTypeComboBox;

    public EraserOptions() {
        setLayout(new GridLayout(1, 1));

        // Initialize component
        eraserTypeComboBox = new JComboBox<>(new String[]{"Spray Eraser", "Shape Eraser", "Digital Eraser"}); // Example eraser types

        // Add component to panel
        add(new JLabel("Eraser Type:"));
        add(eraserTypeComboBox);
    }
}