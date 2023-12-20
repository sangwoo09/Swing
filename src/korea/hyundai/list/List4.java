package korea.hyundai.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.hyundai.Hyundai;
import korea.hyundai.list.car.Grandeur;
import korea.hyundai.list.car.Palisade;

public class List4 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("GRANDEUR");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b2 = new JButton("PALISADE");
	
	JButton b3 = new JButton("OK");
	
	public List4(){
		setTitle("大型リスト");
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
			setVisible(false);
			new Grandeur();
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			setVisible(false);
			new Palisade();
		});
		
		pa.add(p);
		pa.add(p1);
		add(pa, BorderLayout.NORTH);
		
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b3);
		b3.addActionListener(e -> {
			new Hyundai();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
