import java.awt.*;
import javax.swing.*;

public class JListDemo {

	JList list;
	String listColorNames[] = { "White", "Blue" };
	Color listColorValues[] = { Color.WHITE, Color.BLUE };

	public JListDemo() {

		super( "List Source Demo" );

		Container con = getContentPane();
		con.setLayout( new FlowLayout() );

		list = new JList( listColorNames );
		list.selectedIndex( 0 );
		list.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

		con.add( new JScrollPane( list ) );

		list.addListSelectionListener( new ListSelectionListener() {

			public void valueChanged( ListSelectionEvent e ) {

				setBackground( listColorValues[list.getSelectedIndex()] );

			}

		} );

		setSize( 200, 200 );
		setVisible( true );
	}

	public static void main( String args[] ) {

		JListDemo test = new JListDemo();

		test.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

}