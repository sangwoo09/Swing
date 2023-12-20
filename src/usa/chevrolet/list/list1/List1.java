package usa.chevrolet.list.list1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import usa.chevrolet.Chevrolet;
import usa.chevrolet.list.list1.car.Voltcrossover;
import usa.chevrolet.list.list1.car.Voltev;

public class List1 extends JFrame{
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("VOLT EV");
	JLabel l2 = new JLabel("SUV ");
	JButton b2 = new JButton("VOLT CROSSOVER");
	
	JButton b3 = new JButton("OK");
	
	public List1(){
		setTitle("小型リスト");
		setSize(250, 180);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel pa = new JPanel(new GridLayout(2, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Voltev();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Voltcrossover();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b3);
		b3.addActionListener(e -> {
			new Chevrolet();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
