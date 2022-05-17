package Handler;

import Person.Engineer;

import java.util.ArrayList;
import java.util.List;

public class EngineerHandler {
    public List<Engineer> engineers = new ArrayList<>();

    public EngineerHandler(){
    }

    public Engineer addEngineer(String name, int age, String sex, String address, String trainingIndustry){
        Engineer worker = new Engineer();
        worker.setName(name);
        worker.setAge(age);
        worker.setSex(sex);
        worker.setAddress(address);
        worker.setTrainingIndustry(trainingIndustry);
        engineers.add(worker);
        return worker;
    }

    public Engineer getEngineerByIndex(int index){
        return engineers.get(index);
    }

    public void showEngineers(){
        for(int i = 0; i < engineers.size(); i++ ){
            Engineer engineer = getEngineerByIndex(i);
            System.out.println("Engineer Information person: " + i + ", Person name is: "+ engineer.getName());
            engineer.showPerson(engineer.getName(), engineer.getAge(), engineer.getSex(), engineer.getAddress());
            System.out.println("Training Industry: " + engineer.getTrainingIndustry());
        }
    }

    public List<Engineer> searchEngineersByName(String name){
        List<Engineer> result = new ArrayList<>();
        for(int i = 0; i < engineers.size(); i++){
            Engineer temp = getEngineerByIndex(i);
            if(temp.getName().contains(name))
                result.add(temp);

        }
        return  result;
    }

    public void showEngineers(Engineer engineer) {
        System.out.println("Worker " + engineer.getName() +" information");
        engineer.showPerson(engineer.getName(),engineer.getAge(), engineer.getSex(), engineer.getAddress());
        System.out.println("Training Industry: " + engineer.getTrainingIndustry());
    }
}
