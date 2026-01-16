public class Main {

   public static void main(String []args) {
     
     // Create a new string -> SHORTCUT
      String lebron = "Goat";
      // But Strings are actually OBJECTS
      // The original way to create a String:
      String steph = new String("GOAT");

      // All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear basicBear = new BuildABear();
      // "BuildABear basicBear" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLINZG a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(basicBear);
      
      // Create a new object with our own values
      // called the CONSTRUCTOR: ClassName(String, String, int)
      BuildABear athlete = new BuildABear("Player", "Lebron", 90);

      // Printing an OBJECT calls the CLASS' toString() method
      System.out.println(athlete);

      // Test our methods below by CALLING them on an object instance
      // GETTERS are NON-VOID (we need to handle output data)
      System.out.println( athlete.getType() );
      // or, store the return value in a variable
      double price = athlete.getPrice();
      System.out.println( price );

      // SETTERS are VOID (means no return value)
      // Calling void methods: objectName.methodName();
      athlete.setName("Lebron");
      athlete.setFillLevel(50);
      // setters (mutators) changed values. Let's see the effects:
      System.out.println(athlete);

      //STATIC variables and methods belong to a CLASS
      // get CALLED using the Class name, NOT an object
      BuildABear.showStore();
      // We've used static methods from the Math class!!
      double randNum = Math.random();
      // NOTE: the main method is STATIC bc there is
      // ONLY ONE COPY of it per program 
;

   } // end main() METHOD
} // end Main CLASS
