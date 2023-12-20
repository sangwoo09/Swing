package korea.kia.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.kia.Kia;
import korea.kia.list.car.Ev6;
import korea.kia.list.car.K5;
import korea.kia.list.car.Sportage;
import korea.kia.list.car.Stinger;

public class List3 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("K5");
	JButton b2 = new JButton("STINGER");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b3= new JButton("EV6");
	JButton b4 = new JButton("SPORTAGE");
	
	JButton b5 = new JButton("OK");
	
	public List3(){
		setTitle("中型リスト");
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
			new K5();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Stinger();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b3);
		b3.addActionListener(e -> {
			new Ev6();
			setVisible(false);
		});
		
		p1.add(b4);
		b4.addActionListener(e -> {
			new Sportage();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		
		add(pa, BorderLayout.NORTH);
		
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b5);
		b5.addActionListener(e -> {
			new Kia();
			setVisible(false);
		});
		add(p, "South");
		
	}
	
	public static void main(String[] args) {
		new List3();
	}

}
