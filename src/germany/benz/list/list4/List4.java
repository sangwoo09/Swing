package germany.benz.list.list4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.benz.Benz;
import germany.benz.list.list4.car.Gls400d;
import germany.benz.list.list4.car.Gls580;
import germany.benz.list.list4.car.Gls63;
import germany.benz.list.list4.car.S350d;
import germany.benz.list.list4.car.S500;
import germany.benz.list.list4.car.S63;

public class List4 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("S350d");
	JButton b2 = new JButton("S500");
	JLabel l2 = new JLabel("SUV ");
	JButton b3 = new JButton("GLS400d");
	JButton b4 = new JButton("GLS580");
	JLabel l3 = new JLabel("AMG ");
	JButton b5 = new JButton("S63");
	JButton b6 = new JButton("GLS63");
	
	JButton b7 = new JButton("OK");
	
	public List4(){
		setTitle("大型リスト");
		setSize(280, 200);
		
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
			new S350d();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new S500();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b3);
		b3.addActionListener(e -> {
			new Gls400d();
			setVisible(false);
		});
		
		p1.add(b4);
		b4.addActionListener(e -> {
			new Gls580();
			setVisible(false);
		});
		
		p2.add(l3);	
		p2.add(b5);
		b5.addActionListener(e -> {
			new S63();
			setVisible(false);
		});
		
		p2.add(b6);
		b6.addActionListener(e -> {
			new Gls63();
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
			new Benz();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
