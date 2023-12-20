package germany.audi.list.list3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.audi.Audi;
import germany.audi.list.list3.car.A4tdi;
import germany.audi.list.list3.car.A4tfsi;
import germany.audi.list.list3.car.A5tfsi;
import germany.audi.list.list3.car.Q4;
import germany.audi.list.list3.car.Q5tdi;
import germany.audi.list.list3.car.Q5tfsi;
import germany.audi.list.list3.car.Rs4;
import germany.audi.list.list3.car.Rs5;
import germany.audi.list.list3.car.S4;
import germany.audi.list.list3.car.S5;

public class List3 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("A4 TDI");
	JButton b2 = new JButton("A4 TFSI");
	JButton b3 = new JButton("A5 TFSI");
	JLabel l2 = new JLabel("SUV ");
	JButton b4 = new JButton("Q4");
	JButton b5 = new JButton("Q5 TDI");
	JButton b6 = new JButton("Q5 TFSI");
	JLabel l3 = new JLabel("スポーツ ");
	JButton b7 = new JButton("S4");
	JButton b8 = new JButton("RS4");
	JButton b9 = new JButton("S5");
	JButton b10 = new JButton("RS5");
	
	JButton b11 = new JButton("OK");
	
	public List3(){
		setTitle("中型リスト");
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
			new A4tdi();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new A4tfsi();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new A5tfsi();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b4);
		b4.addActionListener(e -> {
			new Q4();
			setVisible(false);
		});
		
		p1.add(b5);
		b5.addActionListener(e -> {
			new Q5tdi();
			setVisible(false);
		});
		
		p1.add(b6);
		b6.addActionListener(e -> {
			new Q5tfsi();
			setVisible(false);
		});
		
		p2.add(l3);	
		p2.add(b7);
		b7.addActionListener(e -> {
			new S4();
			setVisible(false);
		});
		
		p2.add(b8);
		b8.addActionListener(e -> {
			new Rs4();
			setVisible(false);
		});
		
		p2.add(b9);
		b9.addActionListener(e -> {
			new S5();
			setVisible(false);
		});
		
		p2.add(b10);
		b10.addActionListener(e -> {
			new Rs5();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		pa.add(p2);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b11);
		b11.addActionListener(e -> {
			new Audi();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
