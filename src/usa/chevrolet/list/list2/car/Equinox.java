package usa.chevrolet.list.list2.car;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import usa.chevrolet.list.list2.List2;
import usa.chevrolet.list.list2.car.detailRepo.EquinoxRepo;

public class Equinox extends JFrame{

JButton b1 = new JButton("リストに戻る");
	
	public Equinox(){
		setTitle("EQUINOXの情報");
		setSize(400, 300);
		
		South();
		Center();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void Center() {
		JPanel p = new JPanel(new GridLayout(0, 3));
		
		JLabel l1 = new JLabel("車名");
		JLabel l2 = new JLabel("値段");
		JLabel l3 = new JLabel("燃料");
		JLabel l4 = new JLabel("燃費");
		JLabel l5 = new JLabel("出力");
		JLabel l6 = new JLabel("トルク");
		JLabel l7 = new JLabel("排気");
		JLabel l8 = new JLabel("駆動");
		
		JLabel e1 = new JLabel("");
		JLabel e2 = new JLabel("");
		JLabel e3 = new JLabel("");
		JLabel e4 = new JLabel("");
		JLabel e5 = new JLabel("");
		JLabel e6 = new JLabel("");
		JLabel e7 = new JLabel("");
		JLabel e8 = new JLabel("");
		
		EquinoxRepo eRepo = new EquinoxRepo();
		String[] equinox = eRepo.detail();
		
		JTextField t1 = new JTextField(equinox[1]);
		JTextField t2 = new JTextField(equinox[2] + "円");
		JTextField t3 = new JTextField(equinox[3]);
		JTextField t4 = new JTextField(equinox[4]);
		JTextField t5 = new JTextField(equinox[5]);
		JTextField t6 = new JTextField(equinox[6]);
		JTextField t7 = new JTextField(equinox[7]);
		JTextField t8 = new JTextField(equinox[8]);
		
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t8.setEditable(false);
		
		p.add(l1);
		p.add(e1);
		p.add(t1);
		p.add(l2);
		p.add(e2);
		p.add(t2);
		p.add(l3);
		p.add(e3);
		p.add(t3);
		p.add(l4);
		p.add(e4);
		p.add(t4);
		p.add(l5);
		p.add(e5);
		p.add(t5);
		p.add(l6);
		p.add(e6);
		p.add(t6);
		p.add(l7);
		p.add(e7);
		p.add(t7);
		p.add(l8);
		p.add(e8);
		p.add(t8);
		add(p, "Center");
	}
	
	private void South() {
		JPanel p = new JPanel();
		
		p.add(b1);
		b1.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "リストに戻りますか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "ありがとうございました。");
				new List2();
				setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "ゆっくり見ても大丈夫です。");
				setVisible(true);
			}
		});
		add(p, "South");
	}
}
