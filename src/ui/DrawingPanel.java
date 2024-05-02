package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	
	public DrawingPanel() {
		setPreferredSize( new Dimension(600,400));
		setBackground(Color.WHITE);
	}
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Add painting logic here if needed
    }

}
