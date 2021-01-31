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
        System.out.println("Managers has stock " + this.isHasStocks());

    }
    public void writeProcedures(){
        System.out.println("Managers are developing  new procedures for new project");
    }

    @Override
    public void goToVacation() {
        super.goToVacation();
        System.out.println("I am manager and I am going to Paris");
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
}
