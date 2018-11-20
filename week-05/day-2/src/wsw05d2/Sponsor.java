package wsw05d2;

public class Sponsor {
  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;

  public Sponsor() {
    this("Jane Doe", 30, "female", "Google", 0);
  }

  public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = hiredStudents;
  }

  public static void introduce(String name, int age, String gender, String company, int hiredStudents) {
    System.out.println("Hi, I'm " + name + ", a(n) " + age + " year old " + gender + "who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public static void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire(int hiredStudents) {
    this.hiredStudents++;
  }
}
