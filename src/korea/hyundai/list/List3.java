package korea.hyundai.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.hyundai.Hyundai;
import korea.hyundai.list.car.I40;
import korea.hyundai.list.car.Ioniq6;
import korea.hyundai.list.car.Santafe;
import korea.hyundai.list.car.Sonata;

public class List3 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("i40");
	JButton b2 = new JButton("SONATA");
	JButton b3= new JButton("IONIQ6");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b4 = new JButton("SANTAFE");
	
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
			new I40();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Sonata();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new Ioniq6();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b4);
		b4.addActionListener(e -> {
			new Santafe();
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
			new Hyundai();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
