package korea.hyundai.list;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.hyundai.Hyundai;
import korea.hyundai.list.car.Avante;
import korea.hyundai.list.car.I30;
import korea.hyundai.list.car.IONIQ;
import korea.hyundai.list.car.Tucson;
import korea.hyundai.list.car.Veloster;

public class List2 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("AVANTE");
	JButton b2 = new JButton("IONIQ");
	JButton b3= new JButton("i30");
	JButton b4 = new JButton("VELOSTER");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b5 = new JButton("TUCSON");
	
	JButton b6 = new JButton("OK");
	
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
			new Avante();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new IONIQ();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new I30();
			setVisible(false);
		});
		
		p.add(b4);
		b4.addActionListener(e -> {
			new Veloster();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b5);
		b5.addActionListener(e -> {
			new Tucson();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		add(pa, "North");
		
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b6);
		b6.addActionListener(e -> {
			new Hyundai();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
