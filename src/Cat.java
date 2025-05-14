class Cat {
    // Attributes
    private String name;
    private int age;
    private String breed;
    private String personality;
<<<<<<< HEAD
    private String color;
=======
    private String gender;
>>>>>>> 68f5dbdbd42f5a0ca6d47df98f9726fea69ab408

    // Constructor
    public Cat(String name, int age, String breed,String personality, String gender) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.personality = personality;
        this.gender = gender;

    }

    // Methods
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breeds: " + breed);
        System.out.println("Personality: " + personality);
<<<<<<< HEAD
        System.out.println("Color: " + color);

=======
        System.out.println("Gender: " + gender);
>>>>>>> 68f5dbdbd42f5a0ca6d47df98f9726fea69ab408

    }
}