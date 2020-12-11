import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class TestMenu {


    public TestMenu() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Test");
                frame.add(new MenuPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class MenuPane extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private JButton addBook = new JButton("Add Book");
		private JButton searchBook = new JButton("Search Book");
		private JButton listBooks = new JButton("List Books");
		private JButton exitBookshelf = new JButton("Exit");

    	
    	
        public MenuPane() {
        	
    		addBook.addActionListener(new ActionListener () {
    		    public void actionPerformed (ActionEvent event) {
    		        System.out.println("It works!!");
    		    }
    		});
    		searchBook.addActionListener(new ActionListener () {
    		    public void actionPerformed (ActionEvent event) {
    		        System.out.println("you clicked search book");
    		    }
    		});
    		listBooks.addActionListener(new ActionListener () {
    		    public void actionPerformed (ActionEvent event) {
    		        System.out.println("you clicked list book!");
    		    }
    		});
    		exitBookshelf.addActionListener(new ActionListener () {
    		    public void actionPerformed (ActionEvent event) {
    		        System.out.println("you clicked exit");
    		       
    		    }
    		});
    		
        	
        	
            setBorder(new EmptyBorder(30, 100, 30, 100));
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTH;

            add(new JLabel("<html><h1><strong>Bookshelf</strong></h1><hr></html>"), gbc);
            add(new JLabel("<html>What would you like to do?</html>"), gbc);
            add(new JLabel("<html>  </html>"), gbc);

            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JPanel panel = new JPanel(new GridBagLayout());
            

    		
            panel.add(addBook, gbc);
            panel.add(searchBook, gbc);
            panel.add(listBooks, gbc);
            panel.add(exitBookshelf, gbc);

            gbc.weighty = 1;
            add(panel, gbc);
        }
    	
          
    }

}