import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile {
  public void readFile(String filename) {
	  
	shelf myShelf = new shelf();   
  
    try {
      File myFile = new File(filename);
      Scanner myReader = new Scanner(myFile);
      while (myReader.hasNextLine()) {
        String[] book_id = myReader.nextLine().split(",");
        String author = book_id[0];
        String title = book_id[1];
        myShelf.books.put(author, title);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


// lets make a GUI! It makes the most sense since i have a lot of hecking options