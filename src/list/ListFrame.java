package list;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import germany.audi.Audi;
import germany.benz.Benz;
import germany.bmw.Bmw;
import germany.volkswagen.Volkswagen;
import japan.honda.Honda;
import japan.toyota.Toyota;
import korea.hyundai.Hyundai;
import korea.kia.Kia;
import usa.chevrolet.Chevrolet;
import usa.ford.Ford;
import usa.jeep.Jeep;
import usa.tesla.Tesla;

public class ListFrame extends JFrame{
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel("KOREA");
	
	JPanel p2 = new JPanel();
	JButton b1 = new JButton("HYUNDAI");
	JButton b2 = new JButton("KIA");
	
	JPanel p3 = new JPanel();
	JLabel l3 = new JLabel("JAPAN");
	
	JPanel p4 = new JPanel();
	JButton b3 = new JButton("TOYOTA");
	JButton b4 = new JButton("HONDA");
	
	JPanel p5 = new JPanel();
	JLabel l5 = new JLabel("USA");
	
	JPanel p6 = new JPanel();
	JButton b6 = new JButton("CHEVROLET");
	JButton b7 = new JButton("Ford");
	JButton b8 = new JButton("JEEP");
	JButton b9 = new JButton("TESLA");
	
	JPanel p7 = new JPanel();
	JLabel l7 = new JLabel("Germany");
	
	JPanel p8 = new JPanel();
	JButton b10 = new JButton("BMW");
	JButton b11 = new JButton("Mercedes-Benz");
	JButton b12 = new JButton("AUDI");
	JButton b13 = new JButton("Volkswagen");
	
	public ListFrame(){
		setTitle("自動車ブランドーリスト");
		setSize(400, 300);
		setLayout(new GridLayout(8, 0));
		
	    Korea();
	    Japan();
	    USA();
	    Germany();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void Korea(){
		JPanel p = new JPanel(new GridLayout(2, 0));
		
		p1.add(l1);
		add(p1);
		
		p2.add(b1);
		b1.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "HYUNDAIでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "HYUNDAIにようこそ^-^");
				setVisible(false);
				new Hyundai();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p2.add(b2);
		b2.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "KIAでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "KIAにようこそ^-^");
				setVisible(false);
				new Kia();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		add(p2);
		
	}
	
	private void Japan(){
		JPanel p = new JPanel(new GridLayout(2, 0));
		
		p3.add(l3);
		add(p3);
		
		p4.add(b3);
		b3.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "TOYOTAでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "TOYOTAにようこそ^-^");
				setVisible(false);
				new Toyota();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p4.add(b4);
		b4.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "HONDAでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "HONDAにようこそ^-^");
				setVisible(false);
				new Honda();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		add(p4);
		
	}
	
	private void USA(){
		JPanel p = new JPanel(new GridLayout(2, 0));
		
		p5.add(l5);
		add(p5);
		
		p6.add(b6);
		b6.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "CHEVROLETでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "CHEVROLETにようこそ^-^");
				setVisible(false);
				new Chevrolet();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p6.add(b7);
		b7.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "Fordでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "Fordにようこそ^-^");
				setVisible(false);
				new Ford();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p6.add(b8);
		b8.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "JEEPでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "JEEPにようこそ^-^");
				setVisible(false);
				new Jeep();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p6.add(b9);
		b9.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "TESLAでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "TESLAにようこそ^-^");
				setVisible(false);
				new Tesla();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		add(p6);
		
	}
	
	private void Germany(){
		JPanel p = new JPanel(new GridLayout(2, 0));
		
		p7.add(l7);
		add(p7);
		
		p8.add(b10);
		b10.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "BMWでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "BMWにようこそ^-^");
				setVisible(false);
				new Bmw();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p8.add(b11);
		b11.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "Mercedes-Benzでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "Mercedes-Benzにようこそ^-^");
				setVisible(false);
				new Benz();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p8.add(b12);
		b12.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "AUDIでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "AUDIにようこそ^-^");
				setVisible(false);
				new Audi();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		p8.add(b13);
		b13.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "Volkswagenでよろしいでしょうか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "Volkswagenにようこそ^-^");
				setVisible(false);
				new Volkswagen();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		add(p8);
		
	}
}
