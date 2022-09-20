public class Animal {

private String name,speak,food;

    public Animal(String name, String speak, String food) {
        this.name = name;
        this.speak = speak;
        this.food = food;
    }


    // getter method
    public String getName (){
        return this.name;
    }
    // set method
    public void setName(String name){
        this.name = name;
    }
    public String getSpeak(){

        return this.speak;
    }
    public void setSpeak(String speak){
        this.speak =speak;
    }
    public static void makeNoise(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(animal.speak);
        }else if(animal instanceof Cat) {
            System.out.println(animal.speak);
        }else if (animal instanceof Tiger){
            System.out.println(animal.speak);
        }
    } public static void foodTime(Animal animal){
        if (animal instanceof Dog){
            System.out.println(animal.food);
        }else if (animal instanceof Cat){
            System.out.println(animal.food);
        }else if (animal instanceof Tiger){
            System.out.println(animal.food);
        }
    }
    public static void petsName(Animal animal){
        if (animal instanceof Dog){
            System.out.println(animal.speak);
        }else if(animal instanceof Cat){
            System.out.println(animal.speak);
        }else if(animal instanceof Tiger){
            System.out.println(animal.speak);
        }
    }
    //Everybody will create a method that takes an array of animals and prints out each animals name.
// toString method
    public String toString() {

        return "Animal{ " +
                "name=" + name + '\'' +
                "speak" + speak + '\'' +
                '}';
    }


}


