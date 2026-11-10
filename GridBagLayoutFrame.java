package Ch25;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

//pg1037 fig:25.23
public class GridBagLayoutFrame extends JFrame{
	private GridBagLayout l;
	private GridBagConstraints c;
	public GridBagLayoutFrame() {
		super("GridBagLayout");
		l= new GridBagLayout();
		setLayout(l);
		c= new GridBagConstraints();
		
		JTextField t=new JTextField("TextField");
		c.weightx=1;
		c.weighty=1;
		c.fill= GridBagConstraints.BOTH;
		c.gridwidth=GridBagConstraints.REMAINDER;
		addComponent(t);
		
		String[] names= {"zero","one","two","three","four"};
		JButton[] b= new JButton[names.length];
		for(int i=0;i<names.length;i++) {
			b[i]= new JButton(names[i]);
		}
		c.gridwidth=1;
		addComponent(b[0]);
		
		c.gridwidth = GridBagConstraints.RELATIVE;
		addComponent(b[1]);
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(b[2]);

		String[]  n= {"Copper","Aluminum","Silver"};
		JComboBox combo= new JComboBox(n);
		c.weighty=0;
		c.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(combo);
		
		c.weighty=1;
		c.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(b[3]);
		
		c.gridwidth = GridBagConstraints.RELATIVE;
		addComponent(b[4]);
		
		String[] list= {"Serif","Monospace"};
		JList l= new JList(list);
		c.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(l);
	}


	
	
	


	



	private void addComponent(Component cp) {
		l.setConstraints(cp, c);
		add(cp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GridBagLayoutFrame g = new GridBagLayoutFrame();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(400, 250);
		g.setVisible(true);
		
	}
}
