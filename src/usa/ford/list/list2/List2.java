package usa.ford.list.list2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import usa.ford.Ford;
import usa.ford.list.list2.car.Explorer;
import usa.ford.list.list2.car.Ranger;

public class List2 extends JFrame{
	JLabel l1 = new JLabel("SUV ");
	JButton b1 = new JButton("EXPLORER");
	JLabel l2 = new JLabel("TRUCK ");
	JButton b2 = new JButton("RANGER");
	
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
			new Explorer();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Ranger();
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
			new Ford();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
