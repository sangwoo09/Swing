package japan.toyota.list.list3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import japan.toyota.Toyota;
import japan.toyota.list.list3.car.Alphard;
import japan.toyota.list.list3.car.Crown;
import japan.toyota.list.list3.car.Highlander;

public class List3 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("CROWN");
	JLabel l2 = new JLabel("RV ");
	JButton b2 = new JButton("ALPHARD");
	JLabel l3 = new JLabel("SUV ");
	JButton b3 = new JButton("HIGHLANDER");
	
	JButton b4 = new JButton("OK");
	
	public List3(){
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
		JPanel p2 = new JPanel();
		JPanel pa = new JPanel(new GridLayout(3, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Crown();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Alphard();
			setVisible(false);
		});
		
		p2.add(l3);
		p2.add(b3);
		b3.addActionListener(e -> {
			new Highlander();
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
			new Toyota();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
