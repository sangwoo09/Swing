package korea.kia.list;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import korea.kia.Kia;

public class List4 extends JFrame{

	JLabel l1 = new JLabel("乗用車 ");
	JButton b1 = new JButton("K8");

	JButton b2 = new JButton("OK");
	
	public List4(){
		setTitle("準大型リスト");
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
		add(p);
		
	}
	
	private void setSouth(){
		JPanel p = new JPanel();
		
		p.add(b2);
		b2.addActionListener(e -> {
			new Kia();
			setVisible(false);
		});
		add(p, "South");
		
	}
}
