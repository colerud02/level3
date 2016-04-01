package level3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class hangman implements KeyListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	JLabel jl3 = new JLabel();
	String currentWord;
	int life = 6;
	Stack<String> Puzzles = new Stack<String>();
	ArrayList<JLabel> letters = new ArrayList<JLabel>();

	public static void main(String[] args) {
		hangman h = new hangman();
	}

	public hangman() {
		createUI();
		createpuzzles();
		currentWord = Puzzles.pop();
		playPuzzle(currentWord);
	}

	private void createUI() {
		jf.setVisible(true);
		jf.add(jp);
		jp.add(jl);
		jf.addKeyListener(this);

	}

	private void createpuzzles() {

		Puzzles.push("child");
		Puzzles.push("astronaut");
		Puzzles.push("burger");
		Puzzles.push(longestwordever.longword);
		Puzzles.push("lemon");
		Puzzles.push("halflifethree");
		Puzzles.push("csgo");
		jl.setText(currentWord);

	}

	private void playPuzzle(String word) {
		// currentWord = Puzzles.pop();

		for (int i = 0; i < word.length(); i++) {
			JLabel jl1 = new JLabel();
			letters.add(jl1);
			jl1.setText("_");
			
			jf.pack();
		}
	
		
		letters.add(jl3);
		for (JLabel j : letters) {
			jp.add(j);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		for (int i = 0; i < currentWord.length(); i++) {

			if (currentWord.toCharArray()[i] == e.getKeyChar()) {
				letters.get(i).setText(" " + e.getKeyChar());
				jf.pack();
			}
			else{
				life-=1;
				
				jl3.setText(" "+life);
				jf.pack();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
