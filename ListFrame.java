package Ch14;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// pg 584, Fig. 14.23: ListFrame.java


public class ListFrame extends JFrame
{
	private JList list;
	private String[] names = {"Black","Blue","Cyan","Dark Cyan","Gray","Orange","Pink","Red","White","Yellow"};
	private Color[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY ,Color.GRAY,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};
	public ListFrame() {
		super("List Test");
		setLayout(new FlowLayout());
		list = new JList(names);
		list.setVisibleRowCount(5);
		add(new JScrollPane(list));
	
		list.addListSelectionListener(
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent e) {

						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
					
				});
   }
   public static void main(String[] args) {
	   ListFrame l = new ListFrame();
	   l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   l.setVisible(true);
	   l.setSize(300,200);

	}
}