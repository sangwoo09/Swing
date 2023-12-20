package germany.audi.list.list5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import germany.audi.Audi;
import germany.audi.list.list5.car.A8;
import germany.audi.list.list5.car.Q8tdi;
import germany.audi.list.list5.car.Q8tfsi;
import germany.audi.list.list5.car.R8;
import germany.audi.list.list5.car.S8;

public class List5 extends JFrame{
	String[][] list;
	
	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("A8");
	JLabel l2 = new JLabel("SUV ");
	JButton b2 = new JButton("Q8 TDI");
	JButton b3= new JButton("Q8 TFSI");
	JLabel l3 = new JLabel("スポーツ ");
	JButton b4 = new JButton("S8");
	JButton b5 = new JButton("R8");
	
	JButton b6 = new JButton("OK");
	
	public List5(){
		setTitle("大型リスト");
		setSize(330, 200);
		
		setNorth();
		setSouth();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void setNorth(){
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel pa = new JPanel(new GridLayout(4, 0));
		
		p.add(l1);
		p.add(b1);
		b1.addActionListener(e -> {
			new A8();
			setVisible(false);
		});
		
		p1.add(l2);
		p1.add(b2);
		b2.addActionListener(e -> {
			new Q8tdi();
			setVisible(false);
		});
		
		p1.add(b3);
		b3.addActionListener(e -> {
			new Q8tfsi();
			setVisible(false);
		});
		
		p2.add(l3);	
		p2.add(b4);
		b4.addActionListener(e -> {
			new S8();
			setVisible(false);
		});
		
		p2.add(b5);
		b5.addActionListener(e -> {
			new R8();
			setVisible(false);
		});
		
		pa.add(p);
		pa.add(p1);
		pa.add(p2);
		add(pa, BorderLayout.NORTH);
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b6);
		b6.addActionListener(e -> {
			new Audi();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
