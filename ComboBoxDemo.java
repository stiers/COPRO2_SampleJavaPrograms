/**
 * @author Ephramar Telog, CK
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame implements ItemListener {

	String course[] = { "Math", "Science", "English", "Filipino" };

	JLabel label;
	JComboBox subject;
	JTextField subjectSelection;

	public ComboBoxDemo() {

		super( "This is an exam" );

		label = new JLabel( "Choose a subject: " );
		subject = new JComboBox( course );

		subjectSelection = new JTextField( 10 );

		Container pane = getContentPane();
		pane.setBackground( Color.WHITE );

		pane.setLayout( new FlowLayout() );
		pane.add( label );
		pane.add( subject );
		pane.add( subjectSelection );

		subject.addItemListener( this );
		subject.setForeground( Color.YELLOW );
		subject.setBackground( Color.BLUE );

		subjectSelection.setText( course[0] );

	}

	public void itemStateChanged( ItemEvent e ) {
		if( e.getSource() == subject )
			subjectSelection.setText( course[subject.getSelectedIndex()] );
	}

	public static void main(String [] args) {

		ComboBoxDemo exam = new ComboBoxDemo ();
		System.out.println( "Creating instance of Combo Box" );

		exam.setVisible( true );
		System.out.println( "Combo Box set to be visible" );

		exam.setSize( 350, 150 );
		System.out.println( "Combo Box dimention set to 350 x 150 pixels" );

		exam.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}