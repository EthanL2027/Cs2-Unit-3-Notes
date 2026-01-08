public class Main {

   public static void main(String []args) {
     
     // Create a new string -> SHORTCUT
      String lebron = "Goat";
      // But Strings are actually OBJECTS
      // The original way to create a String:
      String steph = new String("GOAT");

      // All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear hero = new BuildABear();
      // "BuildABear hero" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLINZG a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(hero);
      

   }
}
