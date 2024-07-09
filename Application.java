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

        // Calling the public method
        myObject.publicMethod();
    }
}