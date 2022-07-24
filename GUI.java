import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
  private JFrame frame;
  private int width;
  private int height;
  private JTextField ta;
  private JLabel label;
  private JButton button;
  
  public GUI(int w, int h) {
    frame = new JFrame();
    width = w;
    height = h;
    ta = new JTextField(10);
    label = new JLabel("label");
    button = new JButton("button");
	}
	
	public void setUpGUI() {
		Container cp = frame.getContentPane();
		FlowLayout flow = new FlowLayout();
		cp.setLayout(flow);
		frame.setSize(width, height);
		frame.setTitle("GUI");
		cp.add(ta);
		cp.add(label);
		cp.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void setUpButtonListeners() {
		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object o = ae.getSource();
				if(o == button) {
					String s = ta.getText();
					label.setText(s);
					ta.setText("");
				}
			}
		};
		
		button.addActionListener(buttonListener);
	}
	
}
