package wsw05d2;

public class Mentor {
  String name;
  int age;
  String gender;
  String level;

  public Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public static void introduce(String name, int age, String gender, String level) {
    System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + " " + level + " mentor.");
  }

  public static void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
