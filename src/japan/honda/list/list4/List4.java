package japan.honda.list.list4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import japan.honda.Honda;
import japan.honda.list.list4.car.Odyssey;

public class List4 extends JFrame{
	JLabel l1 = new JLabel("RV ");
	JButton b1 = new JButton("ODYSSEY");
	
	JButton b2 = new JButton("OK");
	
	public List4(){
		setTitle("大型リスト");
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
			new Odyssey();
			setVisible(false);
		});
	
		pa.add(p);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Honda();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
