
//  } } a) Explain the concept of inheritance in the code above. b) Create a main method 
// that instantiates one Animal, one Dog, and one Cat object. Call the makeSound method on 
// each object and print out the name, age, breed (if applicable), and whether the cat is
//  indoor or not.
//  c) Describe one advantage of using inheritance in object-oriented programming.
class animal {
    private String name;
    private int age;

    animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public void make_sound() {
        System.out.println("the animal makes a sound");
    }

}

class dogs extends animal {
    private String breed;

    public dogs(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String get_breed() {
        return breed;
    }

    @Override
    public void make_sound() {
        System.out.println("the dog barks.");
    }
}

class cat extends animal {
    private boolean isindoor;

    public cat(String name, int age, boolean isindoor) {
        super(name, age);
        this.isindoor = isindoor;
    }

    public boolean getisindoor() {
        return isindoor;
    }

    @Override
    public void make_sound() {
        System.out.println("the CAT makes a sound ");
    }
}

// creating the main method
public class Main {
    public static void main(String[] args) {
        dogs d1 = new dogs("tom", 2000, "poodle");
        cat c1 = new cat("the dark ferocius beast", 300, true);
        System.out.println("the details of the dog is : " + d1.get_name() + " " + d1.get_age() + " " + d1.get_breed());
        System.out
                .println("the details of the cat is : " + c1.get_name() + " " + c1.get_age() + " " + c1.getisindoor());

    }
}