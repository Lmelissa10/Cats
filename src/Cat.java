class Cat {
    // Attributes
    private String name;
    private int age;
    private String breed;
    private String personality;

    private String colors;

    private String gender;
    private String cat;

    private int size;


    // Constructor

    public Cat(String name, int age, String breed,String personality, String gender, int size) {

//    public Cat(String name, int age, String breed,String personality, String cat) {

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.personality = personality;

        this.gender = gender;
        this.size = size;

//        this.genders = genders;
        this.cat = cat;


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

        System.out.println("Color: " + colors);



        System.out.println("Gender: " + gender);
        System.out.println("Size: " + size);

//        System.out.println("Gender: " + genders);
        System.out.println("Cat: " + cat);



    }
}