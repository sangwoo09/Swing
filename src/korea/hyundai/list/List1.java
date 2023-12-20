package korea.hyundai.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.hyundai.Hyundai;
import korea.hyundai.list.car.Accent;
import korea.hyundai.list.car.Kona;
import korea.hyundai.list.car.Venue;

public class List1 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("ACCENT");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b2 = new JButton("VENUE");
	JButton b3= new JButton("KONA");
	
	JButton b4 = new JButton("OK");
	
	public List1(){
		setTitle("小型リスト");
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
			new Accent();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Venue();
			setVisible(false);
		});
		
		p1.add(b3);
		b3.addActionListener(e -> {
			new Kona();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b4);
		b4.addActionListener(e -> {
			new Hyundai();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
