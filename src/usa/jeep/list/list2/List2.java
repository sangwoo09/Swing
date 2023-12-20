package usa.jeep.list.list2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import usa.jeep.Jeep;
import usa.jeep.list.list2.car.Wrangler;

public class List2 extends JFrame{
	JLabel l1 = new JLabel("SUV ");
	JButton b1 = new JButton("WRANGLER");
	
	JButton b2 = new JButton("OK");
	
	public List2(){
		setTitle("中型リスト");
		setSize(250, 180);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel pa = new JPanel(new GridLayout(2, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Wrangler();
			setVisible(false);
		});
		
		pa.add(p);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Jeep();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
