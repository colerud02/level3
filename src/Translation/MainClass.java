package Translation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainClass implements ActionListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jt = new JTextField(13);
	JTextField jt1 = new JTextField(13);
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	JLabel jl = new JLabel();
	JLabel jl1 = new JLabel();
	HashMap<String,String> Words = new HashMap<String,String>();
public static void main(String[] args) {
MainClass mc = new MainClass();
}
public MainClass() {
	jb.addActionListener(this);
	jb1.addActionListener(this);
	jf.add(jp);
	jp.add(jt);
	jp.add(jl);
	jp.add(jt1);
	jp.add(jl1);
	jp.add(jb);
	jp.add(jb1);
	jb.setText("Add");
	jb1.setText("Search");
	jl.setText("Original");
	jl1.setText("Translated");
	jf.setVisible(true);
	jf.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() .equals(jb)) {
		Words.put(jt.getText(), jt1.getText());
		
		}
	if (e.getSource() .equals(jb1)) {
		String temp = JOptionPane.showInputDialog("Search word");
		String temps = Words.get(temp);
		JOptionPane.showMessageDialog(null, "Translation: "+temps);
	}
	
}
}
