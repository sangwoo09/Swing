package korea.kia;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import korea.kia.list.List1;
import korea.kia.list.List2;
import korea.kia.list.List3;
import korea.kia.list.List4;
import korea.kia.list.List5;
import korea.kia.save.KSaveFrame;
import korea.kia.save.KSaveRepo;
import list.ListFrame;

public class Kia extends JFrame{
	String[][] list;
	JLabel l1 = new JLabel("自動車のデータ");
	JTextField t1 = new JTextField(13);
	JButton b = new JButton("検索");
	
	JButton bb = new JButton("車の情報の登録");
	JButton b1 = new JButton("小型");
	JButton b2 = new JButton("準中型");
	JButton b3 = new JButton("中型");
	JButton b4 = new JButton("準大型");
	JButton b5= new JButton("大型");
	
	JButton b6 = new JButton("戻り");

	DefaultTableModel tm;
	JTable t;
	public Kia() {
		setTitle("KIA");
		setSize(630, 560);
		setLayout(new BorderLayout(10, 10));

		North();
		Center();
		West();
		South();

		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void North() {
		JPanel p = new JPanel();

		p.add(l1);
		p.add(t1);
		p.add(b);
		b.addActionListener(e -> {
			KiaRepo kRepo = new KiaRepo();
			list = kRepo.list();
			tm.setRowCount(0);
			
			for(String[] data : list) {
				//책제목 검색창에 넣은 단어가 있는지를 확인후 없으면 테이블에 추가하지 않는다.
				String searchWord = t1.getText();
				if(data[1].contains(searchWord)) {
					tm.addRow(data);
				}
			}
		});
		add(p, "North");
	}

	private void Center() {
		JPanel p = new JPanel();

		String[] title = {"No", "車名", "燃料", "燃費","排気","駆動"};
	
	    tm = new DefaultTableModel(new String[0][0], title);
	    t = new JTable(tm);
	    JScrollPane s = new JScrollPane(t);
	    
	    p.add(s);
	    add(p, "Center");
	    
	}
	
	private void West() {
		JPanel p = new JPanel(new GridLayout(8, 0));
		
		p.add(bb);
		bb.addActionListener(e -> {
			KSaveRepo saverepo = new KSaveRepo();
			//save = saverepo.save();
			tm.setRowCount(0);
			new KSaveFrame();
			setVisible(false);
		});
		
		p.add(b1);
		b1.addActionListener(e -> {
			new List1();
			setVisible(false);
		});
		
		p.add(b2);
		b2.addActionListener(e -> {
			new List2();
			setVisible(false);
		});
		
		p.add(b3);
		b3.addActionListener(e -> {
			new List3();
			setVisible(false);
		});
		
		p.add(b4);
		b4.addActionListener(e -> {
			new List4();
			setVisible(false);
		});
		
		p.add(b5);
		b5.addActionListener(e -> {
			new List5();
		});
		add(p, "West");

	}
	
	private void South() {
		JPanel p = new JPanel();
		
		p.add(b6);
		b6.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(null, "リストに戻りますか？", "メッセージ", JOptionPane.YES_NO_OPTION);
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "ありがとうございました。");
				setVisible(false);
				new ListFrame();
			}else {
				JOptionPane.showMessageDialog(null, "キャンセルになりました。");
				setVisible(true);
			}
		});
		
		add(p, "South");

	}
}
