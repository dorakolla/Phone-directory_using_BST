import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BSTDriver {
public static void main (String [] args ) throws IOException {
Scanner in=new Scanner(System.in);
	    BST o=new BST();
	    BSTNode n=new BSTNode();
	    BSTNode node1=n.BSTroot();
		ContactInformation d=new ContactInformation();
		System.out.println("'Enter '0' to Stop Program'"+'\n'
				+ "'Enter '1' to Search'"+'\n'
				+ "'Enter '2' to Display contacts'"+'\n'
				+ "'Enter '3' to Display first contact'"+'\n'
				+ "'Enter '4' to Display last contact'"+'\n'+
				"'Enter '5' to Handle Duplicates");
		
		
	    int x=0;
	    while(x>=0&&x<=5) {
	    	System.out.println("Enter your choice");
	    	x=in.nextInt();
	    switch(x) {
	    case 0:
	    	System.exit(0);
	    case 1:
	    	System.out.println("Enter Name to search in PhoneDirectory");
	    	String Name=in.next();
	    	n.search(Name);
	    	break;
	    case 2:
	    	n.Display();
	    	break;
	    case 3:
	    	n.Display_First(node1);
	    	break;
	    case 4:
	    	n.Display_Last(node1);
	    	break;
	    case 5:
	    	n.Handling_duplicates();
	    }
		
	} 
}
}

