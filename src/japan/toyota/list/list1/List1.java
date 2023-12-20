package japan.toyota.list.list1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import japan.toyota.Toyota;
import japan.toyota.list.list1.car.Prius;
import japan.toyota.list.list1.car.Rav4;

public class List1 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("PRIUS");
	JLabel l2 = new JLabel("SUV ");
	JButton b2= new JButton("RAV4");
	
	JButton b3 = new JButton("OK");
	
	public List1(){
		setTitle("準中型リスト");
		setSize(250, 180);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();;
		JPanel pa = new JPanel(new GridLayout(2, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Prius();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Rav4();
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
			new Toyota();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
