package descpizza;

public class PizzaInf {
    public PizzaInf() {}
    public PizzaInf(int id,  String name, String description, int cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public int id;
    public String name;
    public String description;
    public int cost;

    public String toString() {
        return ": " + name + "\tdescription " + description + "\tcost = " + cost + "";
    }
}
