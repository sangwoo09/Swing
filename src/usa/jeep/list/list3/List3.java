package usa.jeep.list.list3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import usa.jeep.Jeep;
import usa.jeep.list.list3.car.Cherokee;

public class List3 extends JFrame{
	JLabel l1 = new JLabel("SUV ");
	JButton b1 = new JButton("CHEROKEE");
	
	JButton b2 = new JButton("OK");
	
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
		JPanel pa = new JPanel(new GridLayout(2, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Cherokee();
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
