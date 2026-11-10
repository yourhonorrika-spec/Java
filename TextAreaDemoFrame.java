package Ch14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//pg.615 Fig:14.47


public class TextAreaDemoFrame extends JFrame {
	private JTextArea a1;
	private JTextArea a2;
	private JButton b;
	public TextAreaDemoFrame() {
		super("TextArea Demo");
		Box box = Box.createHorizontalBox();
		String demo= "This is a demo\nillustrate copyright\nfrom one textarea\nanother textarea\nexternal event";
		a1 = new JTextArea(demo,10,15);
		box.add( new JScrollPane(a1));
		
		b= new JButton("Copy>>>");
		box.add(b);
		b.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						a2.setText(a1.getSelectedText());
					}
				}
					);
		a2 =new JTextArea(10,15);
		a2.setEditable(false);
		box.add( new JScrollPane(a2));
		add(box);
		
		}
	


	public static void main(String[] args) {
		TextAreaDemoFrame t = new TextAreaDemoFrame();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setSize(300, 200);
		t.setVisible(true);
	}

}
