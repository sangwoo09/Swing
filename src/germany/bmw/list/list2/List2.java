package germany.bmw.list.list2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.bmw.Bmw;
import germany.bmw.list.list2.car.B320d;
import germany.bmw.list.list2.car.B320i;
import germany.bmw.list.list2.car.B420d;
import germany.bmw.list.list2.car.B420i;
import germany.bmw.list.list2.car.M3;
import germany.bmw.list.list2.car.M4;
import germany.bmw.list.list2.car.X3d;
import germany.bmw.list.list2.car.X3i;
import germany.bmw.list.list2.car.X3m;
import germany.bmw.list.list2.car.X4d;
import germany.bmw.list.list2.car.X4i;
import germany.bmw.list.list2.car.X4m;

public class List2 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("320i");
	JButton b2 = new JButton("320d");
	JButton b3 = new JButton("420i");
	JButton b4= new JButton("420d");
	JLabel l2 = new JLabel("SUV ");
	JButton b5 = new JButton("X3 xDrive20i");
	JButton b6= new JButton("X3 xDrive20d");
	JLabel l3 = new JLabel("         ");
	JButton b7 = new JButton("X4 xDrive20i");
	JButton b8= new JButton("X4 xDrive20d");
	JLabel l4 = new JLabel("スポーツ ");
	JButton b9 = new JButton("M3");
	JButton b10= new JButton("M4");
	JButton b11 = new JButton("X3M");
	JButton b12= new JButton("X4M");
	
	JButton b13 = new JButton("OK");
	
	public List2(){
		setTitle("中型リスト");
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
			new B320i();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new B320d();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new B420i();
			setVisible(false);
		});
		
		p.add(b4);
		b4.addActionListener(e -> {
			new B420d();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b5);
		b5.addActionListener(e -> {
			new X3i();
			setVisible(false);
		});
		
		p1.add(b6);
		b6.addActionListener(e -> {
			new X3d();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b7);
		b7.addActionListener(e -> {
			new X4i();
			setVisible(false);
		});
		
		p2.add(b8);
		b8.addActionListener(e -> {
			new X4d();
			setVisible(false);
		});
		
		p3.add(l4);
		p3.add(b9);
		b9.addActionListener(e -> {
			new M3();
			setVisible(false);
		});
		
		p3.add(b10);
		b10.addActionListener(e -> {
			new M4();
			setVisible(false);
		});
		
		p3.add(b11);
		b11.addActionListener(e -> {
			new X3m();
			setVisible(false);
		});
		
		p3.add(b12);
		b12.addActionListener(e -> {
			new X4m();
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
	
	public static void main(String[] args) {
		new List2();
	}
}
