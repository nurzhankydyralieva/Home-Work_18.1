public class Manager extends Employee{
    private boolean hasStocks;

    public Manager(String fullName, int age, double salary, boolean hasStocks) {
        super(fullName, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager(){

    }
    public void print(){
        super.print();
        System.out.println("Ful name " + this.fullName + " Age " + this.age + " Salary " + this.salary + "Managers has stock " + this.hasStocks);

    }
    public void writeProcedures(){
        System.out.println("Managers are developing  new procedures for new project");
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
}
