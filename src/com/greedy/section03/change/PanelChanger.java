package com.greedy.section03.change;

import javax.swing.JPanel;

public class PanelChanger {
	
	public static void changePanel(MainFrame mf, JPanel oldPanel, JPanel newPanel) {
		mf.remove(oldPanel);
		mf.add(newPanel);
		mf.repaint();
		mf.revalidate();
	}
}
