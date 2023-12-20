package usa.tesla.list.list2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import usa.tesla.Tesla;
import usa.tesla.list.list2.car.Models;
import usa.tesla.list.list2.car.Modelx;

public class List2 extends JFrame{
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1= new JButton("MODEL S");
	JLabel l2 = new JLabel("SUV ");
	JButton b2= new JButton("MODEL X");
	
	JButton b3 = new JButton("OK");
	
	public List2(){
		setTitle("準大型リスト");
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
			new Models();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Modelx();
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
			new Tesla();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
