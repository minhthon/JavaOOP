package Person;

public class Engineer extends Person {
    private String trainingIndustry;

    public Engineer(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public Engineer(String name, int age, String sex, String address, String trainingIndustry) {
        super(name, age, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }
    public Engineer(){}

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
}
