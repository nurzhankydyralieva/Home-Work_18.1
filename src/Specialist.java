public class Specialist extends Employee {
    private int levels;
    public Specialist(String name, int age, double salary, int levels){
        super(name, age, salary);
        this.levels = levels;
    }
    public Specialist(){

    }
    public void print(){
     System.out.println("The specialist level is " + this.levels);
    }
    public void workWithClients(){System.out.println("He is developing new product.");
    }
    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }


}
