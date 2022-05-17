package Person;

public class Worker extends Person{
    private int rank;

    public Worker(String name, int age, String sex, String address, int rank) {
        super(name, age, sex, address);
        this.rank = rank;
    }

    public Worker(int rank) {
        this.rank = rank;
    }

    public Worker() {        
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
