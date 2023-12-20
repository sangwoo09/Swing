package germany.benz.list.list3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.benz.Benz;
import germany.benz.list.list3.car.Cls300d;
import germany.benz.list.list3.car.Cls450;
import germany.benz.list.list3.car.Cls53;
import germany.benz.list.list3.car.E220d;
import germany.benz.list.list3.car.E250;
import germany.benz.list.list3.car.E53;
import germany.benz.list.list3.car.Gle300d;
import germany.benz.list.list3.car.Gle450;
import germany.benz.list.list3.car.Gle53;

public class List3 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("E220d");
	JButton b2 = new JButton("E250");
	JButton b3 = new JButton("CLS300d");
	JButton b4 = new JButton("CLS450");
	JLabel l2 = new JLabel("SUV ");
	JButton b5 = new JButton("GLE300d");
	JButton b6 = new JButton("GLE450");
	JLabel l3 = new JLabel("AMG ");
	JButton b7 = new JButton("E53");
	JButton b8 = new JButton("GLE53");
	JButton b9 = new JButton("CLS53");
	
	JButton b10 = new JButton("OK");
	
	public List3(){
		setTitle("準大型リスト");
		setSize(390, 200);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel pa = new JPanel(new GridLayout(4, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new E220d();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new E250();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new Cls300d();
			setVisible(false);
		});
		
		p.add(b4);
		b4.addActionListener(e -> {
			new Cls450();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b5);
		b5.addActionListener(e -> {
			new Gle300d();
			setVisible(false);
		});
		
		p1.add(b6);
		b6.addActionListener(e -> {
			new Gle450();
			setVisible(false);
		});
		
		p2.add(l3);	
		p2.add(b7);
		b7.addActionListener(e -> {
			new E53();
			setVisible(false);
		});
		
		p2.add(b8);
		b8.addActionListener(e -> {
			new Gle53();
			setVisible(false);
		});
		
		p2.add(b9);
		b9.addActionListener(e -> {
			new Cls53();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		pa.add(p2);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b10);
		b10.addActionListener(e -> {
			new Benz();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
