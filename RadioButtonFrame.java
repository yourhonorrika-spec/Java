package Ch14;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//pg577 Fig:14.19

public class RadioButtonFrame extends JFrame{
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bIb;
	private Font p;
	private Font b;
	private Font i;
	private Font bI;
	private JTextField text;
	private ButtonGroup bg;
	
	
	
	public RadioButtonFrame() {
		super("RadioButton");
		setLayout(new FlowLayout());
		
		text =new JTextField("Watch the font style change",18);
		add(text);
		pb= new JRadioButton("Plain");
		bb= new JRadioButton("Bold");
		ib= new JRadioButton("Italic");
		bIb= new JRadioButton("Bold/Italic");
		add(pb);
		add(bb);
		add(ib);
		add(bIb);
		bg= new ButtonGroup();
		bg.add(pb);
		bg.add(bb);
		bg.add(ib);
		bg.add(bIb);
		p=new Font("Serif",Font.PLAIN,14);
		b=new Font("Serif",Font.BOLD,14);
		i=new Font("Serif",Font.ITALIC,14);
		bI=new Font("Serif",Font.BOLD +Font.ITALIC,14);
		
		pb.addItemListener(new RadioButtonHandler(p));
		
	}
	private class RadioButtonHandler implements ItemListener{
		Font f;
		
		public RadioButtonHandler(Font p) {
		f=p;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {

			text.setFont(f);
		}
		
	}
	public static void main(String[] args) {
		RadioButtonFrame r = new RadioButtonFrame();
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(280,200);
		r.setVisible(true);
		
		
}

}