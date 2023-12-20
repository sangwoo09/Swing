package germany.audi.list.list4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.audi.Audi;
import germany.audi.list.list4.car.A6tdi;
import germany.audi.list.list4.car.A6tfsi;
import germany.audi.list.list4.car.A7;
import germany.audi.list.list4.car.Q7tdi;
import germany.audi.list.list4.car.Q7tfsi;
import germany.audi.list.list4.car.RS6;
import germany.audi.list.list4.car.Rs7;
import germany.audi.list.list4.car.S6;
import germany.audi.list.list4.car.S7;

public class List4 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("A6 TDI");
	JButton b2 = new JButton("A6 TFSI");
	JButton b3 = new JButton("A7");
	JLabel l2 = new JLabel("SUV ");
	JButton b4 = new JButton("Q7 TDI");
	JButton b5 = new JButton("Q7 TFSI");
	JLabel l3 = new JLabel("スポーツ ");
	JButton b6 = new JButton("S6");
	JButton b7 = new JButton("RS6");
	JButton b8 = new JButton("S7");
	JButton b9 = new JButton("RS7");
	
	JButton b10 = new JButton("OK");
	
	public List4(){
		setTitle("準大型リスト");
		setSize(330, 200);
		
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
			new A6tdi();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new A6tfsi();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new A7();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b4);
		b4.addActionListener(e -> {
			new Q7tdi();
			setVisible(false);
		});
		
		p1.add(b5);
		b5.addActionListener(e -> {
			new Q7tfsi();
			setVisible(false);
		});
		
		p2.add(l3);	
		p2.add(b6);
		b6.addActionListener(e -> {
			new S6();
			setVisible(false);
		});
		
		p2.add(b7);
		b7.addActionListener(e -> {
			new RS6();
			setVisible(false);
		});
		
		p2.add(b8);
		b8.addActionListener(e -> {
			new S7();
			setVisible(false);
		});
		
		p2.add(b9);
		b9.addActionListener(e -> {
			new Rs7();
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
			new Audi();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
