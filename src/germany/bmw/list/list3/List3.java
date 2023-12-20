package germany.bmw.list.list3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.bmw.Bmw;
import germany.bmw.list.list3.car.B520i;
import germany.bmw.list.list3.car.B523d;
import germany.bmw.list.list3.car.B620d;
import germany.bmw.list.list3.car.B630i;
import germany.bmw.list.list3.car.M5;
import germany.bmw.list.list3.car.M6;
import germany.bmw.list.list3.car.X5d;
import germany.bmw.list.list3.car.X5i;
import germany.bmw.list.list3.car.X5m;
import germany.bmw.list.list3.car.X6d;
import germany.bmw.list.list3.car.X6i;
import germany.bmw.list.list3.car.X6m;

public class List3 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("520i");
	JButton b2 = new JButton("523d");
	JButton b3 = new JButton("620d");
	JButton b4= new JButton("630i xDrive");
	JLabel l2 = new JLabel("SUV ");
	JButton b5 = new JButton("X5 xDrive30d");
	JButton b6= new JButton("X5 xDrive40i");
	JLabel l3 = new JLabel("         ");
	JButton b7 = new JButton("X6 xDrive30d");
	JButton b8= new JButton("X6 xDrive40i");
	JLabel l4 = new JLabel("スポーツ ");
	JButton b9 = new JButton("M5");
	JButton b10= new JButton("M6");
	JButton b11 = new JButton("X5M");
	JButton b12= new JButton("X6M");
	
	JButton b13 = new JButton("OK");
	
	public List3(){
		setTitle("準大型リスト");
		setSize(360, 220);
		
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
			new B520i();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new B523d();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new B620d();
			setVisible(false);
		});
		
		p.add(b4);
		b4.addActionListener(e -> {
			new B630i();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b5);
		b5.addActionListener(e -> {
			new X5d();
			setVisible(false);
		});
		
		p1.add(b6);
		b6.addActionListener(e -> {
			new X5i();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b7);
		b7.addActionListener(e -> {
			new X6d();
			setVisible(false);
		});
		
		p2.add(b8);
		b8.addActionListener(e -> {
			new X6i();
			setVisible(false);
		});
		
		p3.add(l4);
		p3.add(b9);
		b9.addActionListener(e -> {
			new M5();
			setVisible(false);
		});
		
		p3.add(b10);
		b10.addActionListener(e -> {
			new M6();
			setVisible(false);
		});
		
		p3.add(b11);
		b11.addActionListener(e -> {
			new X5m();
			setVisible(false);
		});
		
		p3.add(b12);
		b12.addActionListener(e -> {
			new X6m();
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
		
		p.add(b13);
		b13.addActionListener(e -> {
			new Bmw();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
