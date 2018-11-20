package wsw05d2;

public class Person {
    String name;
    int age;
    String gender;

    public Person() {
        this("Jane Doe", 30, "female");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void introduce(String name, int age, String gender) {
        System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + ".");
    }

    public static void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
