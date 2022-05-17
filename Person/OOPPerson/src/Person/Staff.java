package Person;

public class Staff extends Person{
    public String work;

    public Staff(String name, int age, String sex, String address, String work) {
        super(name, age, sex, address);
        this.work = work;
    }

    public Staff(String work) {
        this.work = work;
    }

    public Staff(){}

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
