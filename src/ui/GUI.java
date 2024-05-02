package ui;


import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {	
	private DrawingPanel drawingPanel;
	private SprayOptions sprayOptions ;
	private EraserOptions eraserOptions;
	
	public GUI() {
		setTitle("Spray application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		 
		// Initialize drawing panel
        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
        
        // Initialize spray option panel
        sprayOptions = new SprayOptions();
        add(sprayOptions, BorderLayout.NORTH);
        
     // Initialize eraser options panel
        eraserOptions = new EraserOptions();
        add(eraserOptions, BorderLayout.SOUTH);

        // Pack the frame and make it visible
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
        
        
	}

}
