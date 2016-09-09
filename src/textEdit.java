import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class textEdit implements KeyListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	String text12="";
	String temp;
	boolean set = false;
	
	
	Stack<Character> deleted = new Stack<Character>();
	public textEdit() {
		jf.add(jp);
		jp.add(jl);
		jf.setVisible(true);
		jf.addKeyListener(this);
		jf.setSize(1000, 100);
	}
public static void main(String[] args) {
	textEdit te = new textEdit();
}
@Override
public void keyTyped(KeyEvent e) {	
	if (e.getKeyCode()!=KeyEvent.VK_BACK_SPACE) {
		text12+=e.getKeyChar();
		jl.setText(text12);
	}
	
}
@Override
public void keyPressed(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
		if(!set){
			String t = text12.substring(0, text12.length()-1);
			set = true;
			text12 = t;
		}else{
			String t = text12.substring(0, text12.length()-2);
			text12 = t;
		}
		
		
		char c = text12.charAt(text12.length()-1);
		deleted.push(c);
		jl.setText(text12);
	}
	if (e.getKeyCode()==KeyEvent.VK_UP) {
		String temp="";
		temp +=deleted.pop();
		text12+=temp;
		jl.setText(text12);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
