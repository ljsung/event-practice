package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_AnonymousClassTest {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("�͸�Ŭ���� ����");
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText("���� ��ư�� ���������ϴ�.");
			}
		});
		
		JButton button2 = new JButton("���ο� ��ư");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText("���� ��ư�� ���������ϴ�.");
			}
		});
		
		panel.add(button);
		panel.add(label);
		panel.add(button2);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
