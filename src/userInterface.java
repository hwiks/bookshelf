import java.util.Scanner;

public class userInterface {
	
	public void sayHi() {
		
		System.out.println("Welcome to your bookshelf!");
	}
	
	public void getNextCommand() {
		
    	Scanner scanny = new Scanner(System.in);

		System.out.println("Do you want to do something else? YES/NO");
	
			String nextCommand = scanny.nextLine();

			switch(nextCommand) {
			case "YES":
				getCommand();
				break;
			case "NO":
				System.out.println("ok bie");
				scanny.close();
				break;
			}

	}
	
   public void getCommand() {
    	Scanner scannerino = new Scanner(System.in);
    	shelf newShelf = new shelf();
		
		System.out.println("Do you want to: ADD BOOK, SEE SHELVES, SEARCH BOOK");

			String command = scannerino.nextLine();
			switch(command) {
			
			case "ADD BOOK":
				newShelf.addBook();
				break;
			case "SEARCH BOOK":
				System.out.println("Write the book's title:");
				String searchedBook = scannerino.nextLine();
				String value = newShelf.books.get(searchedBook);
				if (value == null) {
					System.out.println("The book " + searchedBook+  " is not in your shelf yet");
				} else {
					System.out.println("The book " + searchedBook+  " is in your shelf already");
				}
		        break;
			case "SEE SHELVES":
				System.out.println("look");
				break;
			}

		
		getNextCommand();
    }
		

		
	}
	


		
    	
