import java.security.PublicKey;

public class Developer extends Employee{
    private String grades;

    public Developer(String fullName, int age, double salary, String grades) {
        super(fullName, age, salary);
        this.grades = grades;
    }

    public Developer(){

    }
    public void print(){
        super.print();
        System.out.println("Developer has grades  " + this.getGrades());
    }
    public void quotesTorvalds(){
        System.out.println("Most good programmers do programming not because they expect to get paid or get adulation by the public, but because it is fun to program.");
    }
    public void writeCode(){
        System.out.println("We are working on great project.");
    }
    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }


}
