import javax.swing.*;
import java.awt.*;

public class JFrameWithPanel extends JFrame {

	JLabel label_run = new JLabel( "Click START to run the program" );
	JLabel label_cancel = new JLabel( "Click CANCEL to cancel the program" );

	JButton button_run = new JButton( "Start" );
	JButton button_cancel = new JButton( "Exit" );

	public JFrameWithPanel() {

		super( "JFrame with Panel and Buttons" );

		JPanel pane = new JPanel();

		pane.add( label_run );
		pane.add( button_run );

		pane.add( label_cancel );
		pane.add( button_cancel );

		setContentPane( pane );

	}

}