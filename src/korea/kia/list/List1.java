package korea.kia.list;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.kia.Kia;
import korea.kia.list.car.Niro;
import korea.kia.list.car.Seltos;

public class List1 extends JFrame{

	JLabel l1 = new JLabel("RV/SUV ");
	JButton b1 = new JButton("NIRO");
	JButton b2 = new JButton("SELTOS");
	
	JButton b3 = new JButton("OK");
	
	public List1(){
		setTitle("小型リスト");
		setSize(300, 200);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel(new FlowLayout());
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new Niro();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Seltos();
			setVisible(false);
		});
		
		add(p);
		
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
