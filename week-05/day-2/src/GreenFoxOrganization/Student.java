package GreenFoxOrganization;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
//    this.skippedDays = 0;
  }

  public void introduce(String name, int age, String gender, String previousOrganization, int skippedDays) {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  public Student clone() {
    try {
      return (Student)super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("Cloning not allowed.");
      return this;
    }
  }
}
