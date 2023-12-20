package japan.toyota.list.list5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import japan.toyota.Toyota;
import japan.toyota.list.list5.car.Gr86;
import japan.toyota.list.list5.car.Grsupra;

public class List5 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("GR 86");
	JButton b2 = new JButton("GR SUPRA");
	
	JButton b3 = new JButton("OK");
	
	public List5(){
		setTitle("スポーツリスト");
		setSize(250, 180);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel pa = new JPanel(new GridLayout(1, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Gr86();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Grsupra();
			setVisible(false);
		});
		
		pa.add(p);
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
