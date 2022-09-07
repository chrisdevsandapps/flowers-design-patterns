
/*
 * https://www.youtube.com/watch?v=vNHpsC5ng_E
 * 
 * 
 * 
 */



public class WorkWithAnimals {
   public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        spacer();

        // everything is passed by value in java
        int randNum = 10;
        System.out.println("randNum value before method: " + randNum);
        fido.changeVar(randNum);
        System.out.println("randNum value after method: " + randNum);
        spacer();


        // objects on java are passed by references
        System.out.println("dog name before method: " + fido.getName());
        changeObject(fido);
        System.out.println("dog name after method: " + fido.getName());
        spacer();

   } 

    // objects on java are passed by references
    public static void changeObject(Dog objectName) {
        objectName.setName("Marcus");
   }

   public static void spacer() {
        System.out.println(" ");
   }
}
