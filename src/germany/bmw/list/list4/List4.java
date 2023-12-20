package germany.bmw.list.list4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.bmw.Bmw;
import germany.bmw.list.list4.car.B740d;
import germany.bmw.list.list4.car.B740i;
import germany.bmw.list.list4.car.B850i;
import germany.bmw.list.list4.car.M8;
import germany.bmw.list.list4.car.X7d;
import germany.bmw.list.list4.car.X7i;

public class List4 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("740i sDrive");
	JButton b2 = new JButton("740d xDrive");
	JButton b3 = new JButton("850i xDrive");
	JLabel l2 = new JLabel("SUV ");
	JButton b4 = new JButton("X7 xDrive40i");
	JButton b5= new JButton("X7 xDrive40d");
	JLabel l3 = new JLabel("スポーツ ");
	JButton b6 = new JButton("M8");
	
	JButton b7 = new JButton("OK");
	
	public List4(){
		setTitle("準大型リスト");
		setSize(350, 200);
		
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
			new B740i();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new B740d();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new B850i();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b4);
		b4.addActionListener(e -> {
			new X7i();
			setVisible(false);
		});
		
		p1.add(b5);
		b5.addActionListener(e -> {
			new X7d();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b6);
		b6.addActionListener(e -> {
			new M8();
			setVisible(false);
		});


		pa.add(p);
		pa.add(p1);
		pa.add(p2);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b7);
		b7.addActionListener(e -> {
			new Bmw();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
