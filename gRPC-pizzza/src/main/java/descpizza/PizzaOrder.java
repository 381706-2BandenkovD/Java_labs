package descpizza;

public class PizzaOrder {
    public PizzaOrder() {}
    public PizzaOrder(int number, int summ, String status) {
        this.number = number;
        this.summ = summ;
        this.status = status;
    }
    public int number;
    public int summ;
    public String status;

    public String toString() {
        return "number order: " + number + "\tsumma " + summ + "\tstatus = " + status + "";
    }
    public String toStatus() { return "status: " + status + ""; }
}