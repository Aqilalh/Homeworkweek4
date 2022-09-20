import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog1 = new Dog("doggy", "wolf wolf","dog food");
        Cat cat1 = new Cat("catty", "meow meow","cat food");
        Tiger tiger = new Tiger("beast", "rawr rawr","meat");
        Animal[] animals = {dog1,cat1,tiger};
        Animal.foodTime(dog1) ;
        Animal.foodTime(cat1);
        Animal.foodTime(tiger);

        System.out.println("How many pets do you have");
        scan.nextInt();
        System.out.println("what kind of pet it is ");
        String Animals = scan.next();
        System.out.println("What are the pets name and what sound they make");
            if (Animals.equalsIgnoreCase("Dog")) {
                System.out.println(dog1.getName() + " " + dog1.getSpeak());
                scan.nextLine();
            } else if (Animals.equalsIgnoreCase("cat")) {
                System.out.println(cat1.getName() + " " + cat1.getSpeak());

            } else if (Animals.equalsIgnoreCase("tiger")) {
                System.out.println(tiger.getName() + " " + tiger.getSpeak());
            }
        }



   // how many pets they have. Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name.
    //For now your program should just hold onto the user input and print out the list at the end;



    //Animal dog = new Animal("doggy", "dogfood","barks","hip hop");
    //dog.name = "Bob";
    // dog.setName("bob");
    // System.out.println(dog.getName());
    //dog.setHabbits("bark bark");
    // System.out.println(dog.getHabbits());
    // Animal cat = new Animal("catty", "catfood","meow","drill");
    // System.out.println(dog);
    // System.out.println(cat);
   // Dog dog1 = new Dog("bobby","dogfood","bark bark","hip hop","longTail");
    //Cat cat = new Cat("catty", "catfood", "meow","drill");
    //Animal[] animals = {dog1,cat};

  //  Animal.makeNoise(dog1);
   // Animal.makeNoise(cat);
}


