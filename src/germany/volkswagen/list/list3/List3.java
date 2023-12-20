package germany.volkswagen.list.list3;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.volkswagen.Volkswagen;
import germany.volkswagen.list.list3.car.Touareg;

public class List3 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("TOUAREG");
	
	JButton b2 = new JButton("OK");
	
	public List3(){
		setTitle("準中型リスト");
		setSize(250, 150);
		
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
			new Touareg();
			setVisible(false);
		});
	
		pa.add(p);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Volkswagen();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
