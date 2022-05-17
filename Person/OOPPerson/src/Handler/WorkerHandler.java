package Handler;

import Person.Worker;

import java.util.ArrayList;
import java.util.List;

public class WorkerHandler {
    public List<Worker> workers = new ArrayList<>();

    public WorkerHandler(){
    }

    public Worker addWorker(String name, int age, String sex, String address, int rank){
        Worker worker = new Worker();
        worker.setName(name);
        worker.setAge(age);
        worker.setSex(sex);
        worker.setAddress(address);
        worker.setRank(rank);
        workers.add(worker);
        return worker;
    }

    public Worker getWorkerByIndex(int index){
        return workers.get(index);
    }

    public void showWorkers(){
       for(int i = 0; i < workers.size(); i++ ){
           Worker worker = getWorkerByIndex(i);
           System.out.println("Worker Information person: " + i + ", Person name is: "+ worker.getName());
           worker.showPerson(worker.getName(), worker.getAge(), worker.getSex(), worker.getAddress());
           System.out.println("Rank: " + worker.getRank());
       }
    }

    public void showWorker(Worker worker){
        System.out.println("Worker " + worker.getName() +" information");
        worker.showPerson(worker.getName(),worker.getAge(), worker.getSex(), worker.getAddress());
        System.out.println("Rank: " + worker.getRank());
    }

    public List<Worker> searchWorkersByName(String name){
        List<Worker> result = new ArrayList<>();
        for(int i = 0; i < workers.size(); i++){
            Worker temp = getWorkerByIndex(i);
            if(temp.getName().contains(name))
                result.add(temp);

        }
        return  result;
    }
}
