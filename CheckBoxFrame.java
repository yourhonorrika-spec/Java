package Ch14;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
	private JTextField textField;
	private JCheckBox bold;
	private JCheckBox italic;
	
	
	public CheckBoxFrame() {
		super("JCheck Box");
		setLayout(new FlowLayout());
		textField= new JTextField( "Watch the font style change", 20);
		textField.setFont(new Font("Serif",Font.PLAIN,14));
		add(textField);
		
		bold = new JCheckBox("Bold" );
		italic = new JCheckBox("Italic");
		add(bold);
		add(italic);
		CheckBoxHandler handler= new CheckBoxHandler();		
		bold.addItemListener(handler);
		italic.addItemListener(handler);
	}
		private class CheckBoxHandler implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Font font = null;
				if(bold.isSelected()&& italic.isSelected()) {
					font  = new Font("Serif", Font.BOLD+ Font.ITALIC, 14);
					
				}else if(bold.isSelected()){
					font  = new Font("Serif", Font.BOLD, 14);
					
				}else if(italic.isSelected()) {
					font = new Font("Serif",Font.ITALIC,14);
					
				}else
					font = new Font("Serif", Font.PLAIN,14);
				textField.setFont(font);
				
			}
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxFrame c = new CheckBoxFrame();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(250,200);
		c.setVisible(true);

	}

}
