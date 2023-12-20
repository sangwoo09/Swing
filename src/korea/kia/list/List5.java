package korea.kia.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.kia.Kia;

public class List5 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("K9");
	JLabel l2 = new JLabel("RV/SUV ");
	JButton b2 = new JButton("EV9");
	JButton b3 = new JButton("MOHAVE");
	
	JButton b4 = new JButton("OK");
	
	public List5(){
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
		p1.add(l2);
		p1.add(b2);
		p1.add(b3);
		pa.add(p);
		pa.add(p1);
		add(pa, BorderLayout.NORTH);
		
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b4);
		b4.addActionListener(e -> {
			new Kia();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
