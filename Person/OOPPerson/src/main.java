import Handler.EngineerHandler;
import Handler.StaffHandler;
import Handler.WorkerHandler;
import Person.Person;
import Person.Worker;
import Person.Engineer;
import Person.Staff;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static WorkerHandler workerHandler = new WorkerHandler();
    static EngineerHandler engineerHandler = new EngineerHandler();
    static StaffHandler staffHandler = new StaffHandler();
    public static void main(String[] args) {

        showOptionMain();
        int selected = selectOption();
        switch (selected){
            case 1:{
                showOptionAddPerson();
                int selectedAddPerson = selectOptionAddPerson();
                switch (selectedAddPerson){
                    case 1: {
                        Worker worker= addWorker();
                        System.out.println("----------->New worker---------->");
                        workerHandler.showWorker(worker);
                        break;
                    }
                    case 2: {
                        // Engineer
                        Engineer engineer = addEngineer();
                        System.out.println("--------> New Engineer--------->");
                        engineerHandler.showEngineers(engineer);
                        break;
                    }
                    case 3: {
                        // Staff
                        Staff staff = addStaff();
                        System.out.println("-------->New Staff------->");
                        staffHandler.showStaffs(staff);
                        break;
                    }
                }
                break;
            }
        }

    }

    private static Staff addStaff() {
        Person person = addPerson();
        System.out.print("Please type work of person: ");
        String work = scanner.nextLine();

        return  staffHandler.addStaff(person.getName(), person.getAge(), person.getSex(), person.getAddress(), work);
    }

    private static Engineer addEngineer() {
        Person person = addPerson();
        System.out.print("Please type training industry: ");
        String trainingIndustry = scanner.nextLine();

        return  engineerHandler.addEngineer(person.getName(), person.getAge(), person.getSex(), person.getAddress(), trainingIndustry);
    }

    private static Worker addWorker() {
        Person person = addPerson();
        int rank = addNewRank();
        return workerHandler.addWorker(person.getName(), person.getAge(), person.getSex(), person.getAddress(), rank);
    }

    private static int addNewRank() {
        System.out.print("Please type rank from 0 to 10: ");
        int rank = scanner.nextInt();
        if(rank > -1 && rank < 11)
            return  rank;

        System.out.println("Add rank failed");
        return addNewRank();
    }

    private static Person addPerson() {
        System.out.print("Please type name: ");
        String name = scanner.nextLine();

        
        System.out.print("Please type age: ");
        int age = scanner.nextInt();

        String sex = addSexOfPerson();

        System.out.println("Please type address: ");
        String address = scanner.nextLine();

        return new Person(name, age, sex, address);
    }

    private static String addSexOfPerson() {
        System.out.println("1: Male");
        System.out.println("2: Female");
        System.out.println("3: Other");
        System.out.println("Please selected options: ");
        int selectedSex = scanner.nextInt();
        if(selectedSex > 0 && selectedSex < 4){
            switch (selectedSex){
                case 1: return "Male";
                case 2: return "Female";
                case 3: return "Other";
            }
        }

        System.out.println("Select "+ selectedSex + " not found");
        return  addSexOfPerson();
    }


    private static int selectOptionAddPerson() {
        System.out.print("Please select options person you want create: ");
        int selectedOption = scanner.nextInt();
        if(selectedOption > 0 && selectedOption < 4)
            return  selectedOption;

        System.out.println("Selected " + selectedOption + " not found");
        return selectOptionAddPerson();
    }

    private static void showOptionAddPerson() {
        System.out.println("1: Add new Worker");
        System.out.println("2: Add new Engineer");
        System.out.println("3: Add new Staff");
    }

    private static void showOptionMain(){
        System.out.println("1: Add new Person");
        System.out.println("2: Search Person By Name");
        System.out.println("3: Show all person");
        System.out.println("4: Exit");
    }

    private static int selectOption(){
        System.out.print("Please select options: ");
        int selected = scanner.nextInt();
        if(selected > 0 && selected < 5)
            return selected;

        System.out.println("Select options "+ selected + " not found");
        return selectOption();
    }
}
