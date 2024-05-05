package ui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SprayOptions extends JPanel {

    private JComboBox<String> colorComboBox;
    private JComboBox<Integer> sizeComboBox;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};

    
    public SprayOptions(DrawingPanel drawingPanel) {
        setLayout(new GridLayout(2, 1));

        // Initialize components
        colorComboBox = new JComboBox<>(new String[]{"Red", "Green", "Blue"}); // Example colors
        sizeComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5}); // Example sizes

        // Add components to panel
        add(new JLabel("Color:"));
        add(colorComboBox);
        add(new JLabel("Size:"));
        add(sizeComboBox);
        
        colorComboBox.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String selectedColor = (String) colorComboBox.getSelectedItem();
        		
        		switch (selectedColor) {
        		
	        		case "Red" :
	        			drawingPanel.setSelectedColor(Color.RED);
	        			break;
	        			
	        		case "Green" :
	        			drawingPanel.setSelectedColor(Color.GREEN);
	        			break;
	        			
	        		case "Blue" :
	        			drawingPanel.setSelectedColor(Color.BLUE);
	        			break;
	        			
	        		default : 
	        			break;
        		
        		}
        	}
        }
        		
        		);
        
    }
}
