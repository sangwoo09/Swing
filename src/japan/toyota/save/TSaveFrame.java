package japan.toyota.save;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import japan.toyota.Toyota;

public class TSaveFrame extends JFrame{

	JButton b1 = new JButton("戻る");
	JButton b2 = new JButton("リセット");
	JButton b3 = new JButton("登録");
	
	public TSaveFrame() {
		setTitle("車の情報の登録画面");
		setSize(400, 300);
		
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
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);
		JTextField t7 = new JTextField(10);
		JTextField t8 = new JTextField(10);
		
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
		
		p.add(b1);
		b1.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "登録をキャンセルしますか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "リストに戻ります。");
				new Toyota();
				setVisible(false);
			}
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			TSaveRepo trepo = new TSaveRepo();
			String syamei = t1.getText();
			int price = Integer.parseInt(t2.getText());
			String nenryo = t3.getText();
			String nenpi = t4.getText();
			String syutsu = t5.getText();
			String toruku = t6.getText();
			String haiki = t7.getText();
			String kudou = t8.getText();
			
			boolean result = trepo.save(syamei, price, nenryo, nenpi, syutsu, toruku, haiki, kudou);
			if(result) {
					JOptionPane.showConfirmDialog(null, "登録しますか？", "メッセージ", JOptionPane.YES_NO_OPTION);
					if(result) {
						JOptionPane.showMessageDialog(null, "登録しました。");
						new Toyota();
						setVisible(false);
					}
			}
		});
		add(p);
	}
}
