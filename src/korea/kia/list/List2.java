package korea.kia.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.kia.Kia;
import korea.kia.list.car.K3;
import korea.kia.list.car.Soul;

public class List2 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("K3");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b2 = new JButton("SOUL");
	JButton b3 = new JButton("OK");
	
	public List2(){
		setTitle("準中型リスト");
		setSize(300, 200);
		
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
			new K3();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Soul();
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
			new Kia();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
