package GreenFoxOrganization;

public class Mentor extends Person {
  String level;

  public Mentor() {
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }

  public void introduce(String name, int age, String gender, String level) {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
