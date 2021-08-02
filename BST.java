import java.io.IOException;

public class BST {
	BSTNode root;
	String phoneNumber;
	String name;
	String email;
	
public void insert(ContactInformation d) {
	if (root==null)
		root=new BSTNode(d);
	else root.insert(d);
}
public void insert_1(ContactInformation d) {
	if (root==null)
		root=new BSTNode(d);
	else root.insert_1(d);
}
public void inorder() {
	if(root==null) {
		return;
	}
	else root.inorder();
}
public void inorder_1() {
	if(root==null) {
		return;
	}
	else root.inorder_1();
}

public void Display() throws IOException {
    if (root == null) {
    	return;
    }
    else root.Display();
}
public void Handling_duplicates() throws IOException {
	
	root.Handling_duplicates();
	
}


}
