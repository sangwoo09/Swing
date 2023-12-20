package usa.ford.list.list4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import usa.ford.Ford;
import usa.ford.list.list4.car.Mustang;

public class List4 extends JFrame{
	JLabel l1 = new JLabel("スポーツ ");
	JButton b1 = new JButton("Mustang");
	
	JButton b2 = new JButton("OK");
	
	public List4(){
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
			new Mustang();
			setVisible(false);
		});
		
		pa.add(p);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Ford();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
