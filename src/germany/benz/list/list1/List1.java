package germany.benz.list.list1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.benz.Benz;
import germany.benz.list.list1.car.A220;
import germany.benz.list.list1.car.A45;
import germany.benz.list.list1.car.B200d;
import germany.benz.list.list1.car.B220;
import germany.benz.list.list1.car.Cla250;
import germany.benz.list.list1.car.Cla45;
import germany.benz.list.list1.car.Gla220;
import germany.benz.list.list1.car.Gla45;
import germany.benz.list.list1.car.Glb200d;
import germany.benz.list.list1.car.Glb250;
import germany.benz.list.list1.car.Glb35;

public class List1 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("A220");
	JButton b2 = new JButton("CLA250");
	JLabel l2 = new JLabel("RV ");
	JButton b3 = new JButton("B200d");
	JButton b4= new JButton("B220");
	JLabel l3 = new JLabel("SUV ");
	JButton b5= new JButton("GLA220");
	JButton b6 = new JButton("GLB200d");
	JButton b7= new JButton("GLB250");
	JLabel l4 = new JLabel("AMG ");
	JButton b8 = new JButton("A45");
	JButton b9= new JButton("GLA45");
	JButton b10= new JButton("GLB35");
	JButton b11 = new JButton("CLA45");
	
	JButton b12 = new JButton("OK");
	
	public List1(){
		setTitle("準中型リスト");
		setSize(340, 220);
		
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
			new A220();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Cla250();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b3);
		b3.addActionListener(e -> {
			new B200d();
			setVisible(false);
		});
		
		p1.add(b4);
		b4.addActionListener(e -> {
			new B220();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b5);
		b5.addActionListener(e -> {
			new Gla220();
			setVisible(false);
		});
		
		p2.add(b6);
		b6.addActionListener(e -> {
			new Glb200d();
			setVisible(false);
		});
		
		p2.add(b7);
		b7.addActionListener(e -> {
			new Glb250();
			setVisible(false);
		});
		
		p3.add(l4);
		p3.add(b8);
		b8.addActionListener(e -> {
			new A45();
			setVisible(false);
		});
		
		p3.add(b9);
		b9.addActionListener(e -> {
			new Gla45();
			setVisible(false);
		});
		
		p3.add(b10);
		b10.addActionListener(e -> {
			new Glb35();
			setVisible(false);
		});
		
		p3.add(b11);
		b11.addActionListener(e -> {
			new Cla45();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		pa.add(p2);
		pa.add(p3);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b12);
		b12.addActionListener(e -> {
			new Benz();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
