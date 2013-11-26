/**
 * @author Ephramar Telog, CK
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboListExam extends JFrame {

	JList list;
	JComboBox listSubjects;
	JLabel labelSubjects;
	JTextField showSubjects;
	Container container;

	public JComboListExam() {

		super( "This is an exam" );

		container = getContentPane();
		container.setLayout( new FlowLayout( FlowLayout.LEFT ) );

		labelSubjects = new JLabel( "Choose a subject: " );
		listSubjects = new JComboBox();

		// Panel Colors
		listSubjects.setBackground( Color.BLUE );
		listSubjects.setForeground( Color.YELLOW );

		// Add specified subjects on the combo box
		listSubjects.addItem( "Math" );
		listSubjects.addItem( "Science" );
		listSubjects.addItem( "English" );
		listSubjects.addItem( "Filipino" );

		String string = ( String )listSubjects.getSelectedItem();

		getContentPane().add( labelSubjects );
		getContentPane().add( listSubjects );
		getContentPane().add( showSubjects = new JTextField( 10 ) );
		showSubject.setText( string );

	}

	public static void main( String args[] ) {

		JComboListExam exam = new JComboListExam();

		exam.setSize( 400, 200 );
		exam.setVisible( true );
		exam.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

}