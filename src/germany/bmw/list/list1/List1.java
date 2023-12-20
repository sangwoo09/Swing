package germany.bmw.list.list1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.bmw.Bmw;
import germany.bmw.list.list1.car.B118d;
import germany.bmw.list.list1.car.B120i;
import germany.bmw.list.list1.car.B218d;
import germany.bmw.list.list1.car.B220i;
import germany.bmw.list.list1.car.M135i;
import germany.bmw.list.list1.car.M2;
import germany.bmw.list.list1.car.X1;
import germany.bmw.list.list1.car.X2;

public class List1 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("118d");
	JButton b2 = new JButton("120i");
	JLabel l2 = new JLabel("RV ");
	JButton b3 = new JButton("218d");
	JButton b4= new JButton("220i");
	JLabel l3 = new JLabel("SUV ");
	JButton b5 = new JButton("X1");
	JButton b6= new JButton("X2");
	JLabel l4 = new JLabel("スポーツ ");
	JButton b7 = new JButton("M135i");
	JButton b8= new JButton("M2");
	
	JButton b9 = new JButton("OK");
	
	public List1(){
		setTitle("準中型リスト");
		setSize(300, 220);
		
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
			new B118d();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new B120i();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b3);
		b3.addActionListener(e -> {
			new B218d();
			setVisible(false);
		});
		
		p1.add(b4);
		b4.addActionListener(e -> {
			new B220i();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b5);
		b5.addActionListener(e -> {
			new X1();
			setVisible(false);
		});
		
		p2.add(b6);
		b6.addActionListener(e -> {
			new X2();
			setVisible(false);
		});
		
		p3.add(l4);
		p3.add(b7);
		b7.addActionListener(e -> {
			new M135i();
			setVisible(false);
		});
		
		p3.add(b8);
		b8.addActionListener(e -> {
			new M2();
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
		
		p.add(b9);
		b9.addActionListener(e -> {
			new Bmw();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
