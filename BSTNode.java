import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BSTNode {
BSTNode left;
BSTNode right;
int count=1;
String phoneNumber;
String name;
String email;
public BSTNode() {}
public BSTNode(ContactInformation CI) {
	this.name=CI.name;
	this.phoneNumber=CI.phoneNumber;
	this.email=CI.email;
	
}


public void insert(ContactInformation d) 
{
	 if (d.name.compareTo(name)<0) 
    {    
        if (left == null) 
     	   left = new BSTNode(d);
        else 
     	   left.insert(d);
    } 
	 
    else 
    {
        if (right == null) right = new BSTNode(d);
        else right.insert(d);
    }
}
public void insert_1(ContactInformation d) 
{
	if(d.name.equalsIgnoreCase(name)&&d.phoneNumber.equalsIgnoreCase(phoneNumber)&&d.email.equalsIgnoreCase(email)) {
		count++;
	}
	else
	if (d.name.compareTo(name)<0) 
    {    
        if (left == null) 
     	   left = new BSTNode(d);
        else 
     	   left.insert_1(d);
    } 
   
    else 
    {
        if (right == null) right = new BSTNode(d);
        else right.insert_1(d);
    }
}
public void Handling_duplicates() throws IOException {
	BST n=new BST();
	 File f = new File("dat.txt");
	 
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readline = "";
		System.out.println("The Contacts Saved in directory :");
		while ((readline = br.readLine()) != null) {
        String[] arr = readline.split(" ");
        if (arr.length == 3) {
          
            n.insert_1( new ContactInformation(arr[0], arr[1], arr[2]));

        }
    }
	n.inorder_1();
	}
public void inorder_1(){
	  if(left != null)
		  
		  left.inorder_1();
	  System.out.print("Name: "+name+"|"+" Phone Number: "+ phoneNumber +"|"+" Email: "+email+"("+count+")"+"\n" );
	  if(right !=null)
		  right.inorder_1();
}
public void inorder(){
	  if(left != null)
		  
		  left.inorder();
	  System.out.print("Name: "+name+"|"+" Phone Number: "+ phoneNumber +"|"+" Email: "+email+"\n" );
	  if(right !=null)
		  right.inorder();
}
public void Display(){
	 BST b = new BST();
	 File f = new File("dat.txt");
	 try {
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readline = "";
		System.out.println("The Contacts Saved in directory :");
		while ((readline = br.readLine()) != null) {
         String[] arr = readline.split(" ");
         if (arr.length == 3) {
             b.insert( new ContactInformation(arr[0], arr[1], arr[2]));
             
         }
     }
     b.inorder();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void search(String key) {
    int flag = 0;
    BSTNode n=new BSTNode();           
    n = n.BSTroot();
     while (n != null)
     {
        if (n.name.equalsIgnoreCase(key)) {
            flag = 1;
               System.out.println("Name :"+n.name+"| PhoneNumber:"+n.phoneNumber +"Email |"+n.email);
            break;
        }
        if (key.compareTo(n.name)<0) {
            n = n.left;
        } else {
            n= n.right;
        }
    }
    if (flag == 0) {
        System.out.println("No such Contact Found");
    }
}
	

public void Display_First(BSTNode node) {
	if(node.left==null) {
		System.out.println("Name :"+node.name+" PhoneNumber : "+node.phoneNumber+" Email :"+node.email);
	}
	else {
		Display_First(node.left);
	}
}
public BSTNode BSTroot() {
    BST n = new BST();
    try {
        File f = new File("dat.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";
        while ((readLine = b.readLine()) != null) {
            String[] arrOfStr = readLine.split(" ");
            if (arrOfStr.length == 3) {
                n.insert( new ContactInformation(arrOfStr[0], arrOfStr[1], arrOfStr[2]));
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return n.root;
}
public void Display_Last(BSTNode node) {
	if(node.right==null) {
		System.out.println("Name :"+node.name+"PhoneNumber : "+node.phoneNumber+" Email :"+node.email);
	}
	else {
		Display_Last(node.right);
	}
}
}