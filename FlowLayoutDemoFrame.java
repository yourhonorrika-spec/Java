package Ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//pg 606 fig: 14.39
public class FlowLayoutDemoFrame extends JFrame{
	private JButton l;
	private JButton c;
	private JButton r;
	private FlowLayout f;
	private Container con;

	public FlowLayoutDemoFrame() {
		super("FlowLayoutDemo");
		f= new FlowLayout();
		setLayout(f);
		con= getContentPane();
		
		l= new JButton("Left");
		add(l);
		l.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						f.setAlignment(FlowLayout.LEFT);
						f.layoutContainer(con);
					}
					
				});
		

	c= new JButton("Center");
	add(c);
	c.addActionListener(
			new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					f.setAlignment(FlowLayout.CENTER);
					f.layoutContainer(con);
				}
				
			});
	r= new JButton("Right");
	add(r);
	r.addActionListener(
			new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					f.setAlignment(FlowLayout.RIGHT);
					f.layoutContainer(con);
				}
				
			});
	
}
	

		
		

	

	public static void main(String[] args) {
		FlowLayoutDemoFrame f = new FlowLayoutDemoFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setVisible(true);

}
}
