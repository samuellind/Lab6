/**
 * Class for modelling a print button for a BST
 * @author Kerstin Andersson
 *
 */

import javax.swing.*;
import java.awt.event.*;

public class PrintButton extends JButton {
	//First the properties
    private BST _bst;
    private HolderPrintOrder _holder;
    private JLabel _message;

  //Then the methods, starting with the constructor
    public PrintButton(String title, BST aBST, HolderPrintOrder aHolder, JLabel aMessage){
    	super(title);
    	_bst = aBST;
    	_holder = aHolder;
    	_message = aMessage;
    	this.addActionListener(new PrintListener());
    }
    
    private class PrintListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (_holder.getPrintOrder().equals("PreOrder") && !isEmpty())
				_message.setText(_bst.preOrder());
			else if (_holder.getPrintOrder().equals("InOrder") && !isEmpty())
				_message.setText(_bst.inOrder());
			else if (_holder.getPrintOrder().equals("PostOrder") && !isEmpty())
				_message.setText(_bst.postOrder());
		}
    }
    
    //post: returns true if BST is empty 
    private boolean isEmpty(){
    	return _bst.isEmpty();
    }
}
