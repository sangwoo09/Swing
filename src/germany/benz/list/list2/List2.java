package germany.benz.list.list2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.benz.Benz;
import germany.benz.list.list2.car.C200;
import germany.benz.list.list2.car.C220d;
import germany.benz.list.list2.car.C43;
import germany.benz.list.list2.car.Glc220d;
import germany.benz.list.list2.car.Glc300;
import germany.benz.list.list2.car.Glc43;

public class List2 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("C200");
	JButton b2 = new JButton("C220d");
	JLabel l2 = new JLabel("SUV ");
	JButton b3= new JButton("GLC220d");
	JButton b4 = new JButton("GLC300");
	JLabel l3 = new JLabel("AMG ");
	JButton b5 = new JButton("C43");
	JButton b6= new JButton("GLC43");
	
	JButton b7 = new JButton("OK");
	
	public List2(){
		setTitle("中型リスト");
		setSize(300, 200);
		
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
			new C200();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new C220d();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b3);
		b3.addActionListener(e -> {
			new Glc220d();
			setVisible(false);
		});
		
		p1.add(b4);
		b4.addActionListener(e -> {
			new Glc300();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b5);
		b5.addActionListener(e -> {
			new C43();
			setVisible(false);
		});
		
		p2.add(b6);
		b6.addActionListener(e -> {
			new Glc43();
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
