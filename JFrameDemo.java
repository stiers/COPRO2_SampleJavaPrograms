import javax.swing.*;

public class JFrameDemo {

	public static void main( String args[] ) {

		JFrame aFrame = new JFrame( "This is a frame" );

		aFrame.setSize( 200, 250 );
		aFrame.setVisible( true );

		aFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

}