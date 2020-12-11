import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;   
import java.io.BufferedWriter;   
import java.io.RandomAccessFile;
import java.io.IOException;

public class shelf {

	public int howManyBooks;
	HashMap<String, String> books = new HashMap<String,String>();	

	public void addBook() {
		
		Scanner sc = new Scanner(System.in);
		book newBook = new book();
		shelf newShelf = new shelf();
		
		
		System.out.println("Write the new book's title:");
		newBook.title = sc.nextLine();
		System.out.println("Write the author:");
		newBook.author = sc.nextLine();	
		newShelf.books.put(newBook.title, newBook.author);	
		
		
	    try {
	        FileWriter myWriter = new FileWriter("books.txt", true);
	        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);

	        bufferedWriter.write(newBook.author+ ", "+ newBook.title+"\n");
	        bufferedWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		
	    
   
	    
	    
	    
	}
	
	
	
	
	
	
	
}


