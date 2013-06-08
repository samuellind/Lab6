/**
 * Class for modeling a binary search tree with integers
 * @author Kerstin Andersson
 *
 */

import java.util.*;
import java.io.*;

public class BST {
	//First the properties
    private Node _root;    //component

    //Then the methods, starting with the constructor
    //Pre: true
    //Post: an empty binary search tree is created
    public BST(){
    	_root = null;
    }

    //Method for inserting an element in the BST
    //Pre: !search(aElement)
    //Post: element aElement has been inserted into the BST
    public void insert(int aElement){
    	_root = this.insertAux(aElement, _root);
    }

    //Method for inserting an element in a BST
    //Pre: !searchAux(aElement, aNode)
    //Post: element aElement has been inserted into the BST 
    //with root aNode
    private Node insertAux(int aElement, Node aNode){
        return aNode;
    }

    //Method for searching for an element in the BST
    //Pre: true
    //Post: result = true if element aElement is in the BST, 
    //otherwise false
    public boolean search(int aElement){
        return this.searchAux(aElement, _root);
    }

    //Method for searching for an element in a BST
    //Pre: true
    //Post: result = true if element aElement is in the BST 
    //with root aNode, otherwise false
    private boolean searchAux(int aElement, Node aNode){
    	return false;
    }

    //Method for deleting an element in the BST
    //Pre: search(aElement)
    //Post: element aElement has been deleted from the BST
    public void delete(int aElement){
    	_root = this.deleteAux(aElement, _root);
    }

    //Method for deleting an element in a BST
    //Pre: searchAux(aElement, aNode)
    //Post: element aElement has been deleted from the BST 
    //with root aNode
    private Node deleteAux(int aElement, Node aNode){
        return aNode;
    }

    //Method for removing all elements in the BST
    //Pre: true
    //Post: the BST is empty
    public void clear(){
    }

    //Method for checking whether the BST is empty or not
    //Pre: true
    //Post: result = true if the BST is empty, otherwise false 
    //with root aNode, otherwise false
    public boolean isEmpty(){
    	return true;
    }

    //Method for creating a string with the BST elements in preorder 
    //Pre: true
    //Post: result = string with the BST elements in preorder
    public String preOrder(){
        return this.preOrderAux(_root);
    }

    //Method for creating a string with BST elements in preorder
    //Pre: true
    //Post: result = string with BST elements in preorder    
    private String preOrderAux(Node aNode){
        return "";
    }
    
    //Method for creating a string with the BST elements in inorder 
    //Pre: true
    //Post: result = string with the BST elements in inorder
    public String inOrder(){
        return inOrderAux(_root);
    }

    //Method for creating a string with BST elements in inorder
    //Pre: true
    //Post: result = string with BST elements in inorder
    private String inOrderAux(Node aNode){
    	return "";
    }

    //Method for creating a string with the BST elements in postorder 
    //Pre: true
    //Post: result = string with the BST elements in postorder   
    public String postOrder(){
        return this.postOrderAux(_root);
    }

    //Method for creating a string with BST elements in postorder
    //Pre: true
    //Post: result = string with BST elements in postorder  
    private String postOrderAux(Node aNode){
        return "";
    }

    //Method for saving the BST to a file
    //Pre: true
    //Post: BST is saved to file     
    public void save(PrintWriter aFile){
    	this.saveAux(aFile, _root);
    }

    //Method for saving a BST to a file
    //Pre: true
    //Post: a BST is saved to file
    private void saveAux(PrintWriter aFile, Node aNode){
    }

    //Method for reading a BST from a file
    //Pre: true
    //Post: a BST is read from a file   
    public void open(Scanner aFile){
    }

}