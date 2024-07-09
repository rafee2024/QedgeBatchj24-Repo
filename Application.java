// A class with public access specifier
public class MyClass {
    
    // Public field
    public int publicField = 10;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

#feature202 changes by vivek for the Reports module in jul2024
class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("JavaFile.java");

    // deletes the file
    boolean value = file.delete();
    if(value) {
      System.out.println("JavaFile.java is successfully deleted.");
    }
    else {
      System.out.println("File doesn't exit");
    }
  }
}

 #feature201 changes by Vinay for the Module PaymentGateway in Jul2024
 public static void main(String[] args) {


    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("input.txt");

      // Reads characters
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
  #End of feature201 code
  
        // Calling the public method
        myObject.publicMethod();
    }
}