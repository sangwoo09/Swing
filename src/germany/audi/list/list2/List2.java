package germany.audi.list.list2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.audi.Audi;
import germany.audi.list.list2.car.A3;
import germany.audi.list.list2.car.Q3;
import germany.audi.list.list2.car.RS3;

public class List2 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("A3");
	JLabel l2 = new JLabel("SUV ");
	JButton b2= new JButton("Q3");
	JLabel l3 = new JLabel("スポーツ ");
	JButton b3= new JButton("RS3");
	
	JButton b4 = new JButton("OK");
	
	public List2(){
		setTitle("準中型リスト");
		setSize(250, 180);
		
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
			new A3();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Q3();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b3);
		b3.addActionListener(e -> {
			new RS3();
			setVisible(false);
		});
	
		pa.add(p);
		pa.add(p1);
		pa.add(p2);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b4);
		b4.addActionListener(e -> {
			new Audi();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
