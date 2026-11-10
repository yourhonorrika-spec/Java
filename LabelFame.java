package Ch14;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//pg 557 Fig 14.6


public class LabelFame extends JFrame{
	private JLabel l1;	
	private JLabel l2;
	private JLabel l3;

	public LabelFame() {
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		l1  = new JLabel("Label with text");
		l1.setToolTipText("This is Label1");
		add(l1);
		
		Icon p = new ImageIcon(getClass().getResource("2_2 little kitten couple icon pfp.png"));
		l2 =new JLabel("Label with text and icon",p,SwingConstants.LEFT);
		l2.setToolTipText("This is label2");
		add(l2);
		
		l3 = new JLabel();
		l3.setIcon(p);
		l3.setText("Label with icon and text at bottom");
		l3.setVerticalTextPosition(SwingConstants.BOTTOM);
		l3.setHorizontalTextPosition(SwingConstants.CENTER);
		add(l3);
		
	
		}

	public static void main(String[] args) {
		LabelFame l = new LabelFame();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(300, 200);
		l.setVisible(true);

	}

}
