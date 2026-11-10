package Ch14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {

	private JButton button;
	private String[] names = {"Black","Blue","Cyan","Dark Gray","Gray"};
	private JList list1;
	private JList list2;
	
	public MultipleSelectionFrame() {
		super("Multiple Selection Lists");
		setLayout(new FlowLayout());
		list1 = new JList(names);
		list1.setVisibleRowCount(5);
		list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		add(new JScrollPane(list1));
		button = new JButton("Copy>>>");
		add(button);

		button.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						list2.setListData(list1.getSelectedValues());
						
					}
					
				});

		list2 = new JList();
		list2.setVisibleRowCount(5);
		list2.setFixedCellWidth(100);
		list2.setFixedCellHeight(15);
		list2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			add(new JScrollPane(list2));

	}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub 
			 MultipleSelectionFrame f = new MultipleSelectionFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(300,200);
			f.setVisible(true);

		}

}
