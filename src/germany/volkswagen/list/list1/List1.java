package germany.volkswagen.list.list1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.volkswagen.Volkswagen;
import germany.volkswagen.list.list1.car.Golf;
import germany.volkswagen.list.list1.car.Golfgti;
import germany.volkswagen.list.list1.car.Id4;
import germany.volkswagen.list.list1.car.Jetta;
import germany.volkswagen.list.list1.car.Tiguantdi;
import germany.volkswagen.list.list1.car.Tiguantsi;

public class List1 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("GOLF");
	JButton b2 = new JButton("JETTA");
	JLabel l2 = new JLabel("SUV ");
	JButton b3= new JButton("TIGUAN TDI");
	JButton b4 = new JButton("TIGUAN TSI");
	JButton b5 = new JButton("ID.4");
	JLabel l3 = new JLabel("スポーツ ");
	JButton b6= new JButton("GOLF GTI");
	
	JButton b7 = new JButton("OK");
	
	public List1(){
		setTitle("準中型リスト");
		setSize(320, 180);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel pa = new JPanel(new GridLayout(3, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Golf();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Jetta();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b3);
		b3.addActionListener(e -> {
			new Tiguantdi();
			setVisible(false);
		});
		
		p1.add(b4);
		b4.addActionListener(e -> {
			new Tiguantsi();
			setVisible(false);
		});
		
		p1.add(b5);
		b5.addActionListener(e -> {
			new Id4();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b6);
		b6.addActionListener(e -> {
			new Golfgti();
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
			new Volkswagen();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
