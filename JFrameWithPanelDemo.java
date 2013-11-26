import javax.swing.*;

public class JFrameWithPanelDemo {

	public static void main( String args[] ) {

		JFrameWithPanel aFrame = new JFrameWithPanel();

		aFrame.setSize( 200, 200 );
		aFrame.setVisible( true );

		aFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

}