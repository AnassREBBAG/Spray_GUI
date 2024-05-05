package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	
	public DrawingPanel() {
		setPreferredSize( new Dimension(600,400));
		setBackground(Color.WHITE);
		
		
		
		addMouseListener( new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				super.mouseClicked(e);
				int x = e.getX();
				int y = e.getY();
				
				Graphics g = getGraphics();
				
				System.out.println("selectionner la couleur : 1-Rouge 2-bleu 3-vert ");
				
				
				
				g.setColor(Color.BLACK);
				g.fillOval(x, y, 5, 5);
				
				g.fillOval(x+10, y+10, 5,5);
				g.fillOval(x+15, y-10, 5,5);
				g.fillOval(x+10, y+15, 5,5);
				g.fillOval(x+14, y-14, 5,5);
				g.fillOval(x-6, y+10, 5,5);
				g.fillOval(x-10, y-10, 5,5);
				g.fillOval(x-4, y-10, 5,5);
				//a regrouper dans une method, generer les coordonnees aleatoirement, 
				//et ajouter le reglage la couleur et la densite 
				
				
				
			}
		});
	}
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Add painting logic here later
    }

}
