 package Ch25;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



//pg1028 
public class BoxLayoutFrame extends JFrame {

	public BoxLayoutFrame() {
		super("Demonstrating BoxLayout");
		Box h1 = Box.createHorizontalBox();
		Box v1 = Box.createVerticalBox();
		Box h2 = Box.createHorizontalBox();
		Box v2 = Box.createVerticalBox();
		final int S=3;
		
		for(int i=1; i<= S;i++)
		{
			h1.add(new JButton("Button" + i));
		}
		
		for(int i=1; i<= S;i++)
		{
			v1.add(Box.createVerticalStrut(25));
			v1.add(new JButton("Button" + i));
		}
		
		for(int i=1; i<= S;i++)
		{
			v2.add(Box.createHorizontalGlue());
			v2.add(new JButton("Button" + i));
		}
		for(int i=1; i<= S;i++)
		{
			h2.add(Box.createRigidArea(new Dimension(10,8)));
			h2.add(new JButton("Button" + i));
		}
		JPanel p= new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		for(int i=1; i<= S;i++)
		{
			p.add(Box.createGlue());
			p.add(new JButton("Button" +i));
		}
		
		JTabbedPane tabs =new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
		tabs.addTab("Horiontal Box",h1);
		tabs.addTab("Vertical Box with Structs",v1);
		tabs.addTab("Horiontal Box with Glue",h2);
		tabs.addTab("Vertical Box with RigidAreas",v2);
		tabs.addTab("Vertical Box with Glue",p);
		add(tabs);
	}
	public static void main(String[] args) {
		BoxLayoutFrame  b = new BoxLayoutFrame();
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setSize(400,200);
		b.setVisible(true);
		
	}

}
