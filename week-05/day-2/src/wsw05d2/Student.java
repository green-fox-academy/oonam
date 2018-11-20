package wsw05d2;

public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life", 0);
  }

  public Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = skippedDays;
  }

  public static void introduce(String name, int age, String gender, String previousOrganization, int skippedDays) {
    System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + " from " + previousOrganization + "who skipped " + skippedDays + " days from the course already.");
  }

  public static void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}
