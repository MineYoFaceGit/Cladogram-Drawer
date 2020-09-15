package cladogram;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class CladogramDrawer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		CladogramIcon icon = new CladogramIcon(1000, 1000, "src/phylo.txt");
		JLabel label = new JLabel(icon);
		JScrollPane scroll = new JScrollPane(label);
	    frame.add(scroll);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);
	}
}
