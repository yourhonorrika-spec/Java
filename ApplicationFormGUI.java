package Ch14;


	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.BorderFactory;
	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	public class ApplicationFormGUI extends JFrame {

	    // Component declarations
	    private JLabel titleLabel;
	    private JLabel nameLabel, phoneLabel, stateLabel, dobLabel, emailLabel, statusLabel, passLabel, confirmPassLabel, infoLabel;
	    
	    private JTextField nameField, phoneField, emailField;
	    private JComboBox<String> stateComboBox;
	    private JComboBox<String> dobDayBox, dobMonthBox, dobYearBox;
	    private JCheckBox singleCheckBox, marriedCheckBox;
	    private ButtonGroup statusGroup;
	    private JPasswordField passwordField, confirmPasswordField;
	    private JTextArea infoArea;
	    private JScrollPane infoScrollPane;
	    private JButton submitButton;

	    // Sub-panels
	    private JPanel titlePanel;
	    private JPanel formPanel;
	    private JPanel formContainer;
	    private JPanel submitPanel;
	    private JPanel mainPanel;
	    private JPanel dobPanel;
	    private JPanel statusPanel;

	    public ApplicationFormGUI() {
	        super("Personal Details Form");

	        // 1. TOP PANEL: Title (NORTH)
	        titlePanel = new JPanel();
	        titleLabel = new JLabel("Personal Information Form");
	        titlePanel.add(titleLabel);

	        // 2. CENTER PANEL: Input Form (GridLayout 9x2)
	        formPanel = new JPanel(new GridLayout(9, 2, 8, 8));
	        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

	        // Name
	        nameLabel = new JLabel("Name:");
	        nameField = new JTextField(15);
	        formPanel.add(nameLabel);
	        formPanel.add(nameField);

	        // Phone Number
	        phoneLabel = new JLabel("Phone Number:");
	        phoneField = new JTextField(15);
	        formPanel.add(phoneLabel);
	        formPanel.add(phoneField);

	        // Address State
	        stateLabel = new JLabel("Address State:");
	        String[] states = {
	            "Yangon Division", "Mandalay Division", "Ayeyarwady Region",
	            "Bago Region", "Magway Region", "Sagaing Region", "Tanintharyi Region"
	        };
	        stateComboBox = new JComboBox<>(states);
	        formPanel.add(stateLabel);
	        formPanel.add(stateComboBox);

	        // Date of Birth
	        dobLabel = new JLabel("Date of Birth:");
	        String[] days = new String[31];
	        for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);
	        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	        String[] years = new String[50];
	        for (int i = 0; i < 50; i++) years[i] = String.valueOf(2026 - i);

	        dobDayBox = new JComboBox<>(days);
	        dobMonthBox = new JComboBox<>(months);
	        dobYearBox = new JComboBox<>(years);

	        dobPanel = new JPanel(new GridLayout(1, 3, 3, 0));
	        dobPanel.add(dobDayBox);
	        dobPanel.add(dobMonthBox);
	        dobPanel.add(dobYearBox);
	        formPanel.add(dobLabel);
	        formPanel.add(dobPanel);

	        // E-mail
	        emailLabel = new JLabel("E-mail:");
	        emailField = new JTextField(15);
	        formPanel.add(emailLabel);
	        formPanel.add(emailField);

	        // Marital Status
	        statusLabel = new JLabel("Marital Status:");
	        singleCheckBox = new JCheckBox("Single");
	        marriedCheckBox = new JCheckBox("Married");
	        
	        statusGroup = new ButtonGroup();
	        statusGroup.add(singleCheckBox);
	        statusGroup.add(marriedCheckBox);

	        statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
	        statusPanel.add(singleCheckBox);
	        statusPanel.add(marriedCheckBox);
	        formPanel.add(statusLabel);
	        formPanel.add(statusPanel);

	        // Password
	        passLabel = new JLabel("Password:");
	        passwordField = new JPasswordField(15);
	        formPanel.add(passLabel);
	        formPanel.add(passwordField);

	        // Confirm Password
	        confirmPassLabel = new JLabel("Confirm Password:");
	        confirmPasswordField = new JPasswordField(15);
	        formPanel.add(confirmPassLabel);
	        formPanel.add(confirmPasswordField);

	        // Your Information
	        infoLabel = new JLabel("Your Information:");
	        infoArea = new JTextArea(2, 15);
	        infoArea.setLineWrap(true);
	        infoArea.setWrapStyleWord(true);
	        infoScrollPane = new JScrollPane(infoArea);
	        formPanel.add(infoLabel);
	        formPanel.add(infoScrollPane);

	        // Wrap formPanel at NORTH of formContainer to prevent row stretching
	        formContainer = new JPanel(new BorderLayout());
	        formContainer.add(formPanel, BorderLayout.NORTH);

	        // 3. BOTTOM PANEL: Submit Button (SOUTH)
	        submitPanel = new JPanel();
	        submitButton = new JButton("Submit");
	        submitPanel.add(submitButton);

	       

	        // Combine everything onto mainPanel (BorderLayout)
	        mainPanel = new JPanel(new BorderLayout());
	        mainPanel.add(titlePanel, BorderLayout.NORTH);
	        mainPanel.add(formContainer, BorderLayout.CENTER);
	        mainPanel.add(submitPanel, BorderLayout.SOUTH);

	        add(mainPanel);
	    }
	}

