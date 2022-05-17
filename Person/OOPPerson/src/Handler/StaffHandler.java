package Handler;

import Person.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffHandler {
    public List<Staff> staffList = new ArrayList<>();

    public StaffHandler(){
    }

    public Staff addStaff(String name, int age, String sex, String address, String work){
        Staff staff = new Staff();
        staff.setName(name);
        staff.setAge(age);
        staff.setSex(sex);
        staff.setAddress(address);
        staff.setWork(work);
        staffList.add(staff);
        return staff;
    }

    public Staff getStaffByIndex(int index){
        return staffList.get(index);
    }

    public void showStaffs(){
        for(int i = 0; i < staffList.size(); i++ ){
            Staff staff = getStaffByIndex(i);
            System.out.println("Staff Information person: " + i + ", Person name is: "+ staff.getName());
            staff.showPerson(staff.getName(), staff.getAge(), staff.getSex(), staff.getAddress());
            System.out.println("Training Industry: " + staff.getWork());
        }
    }

    public List<Staff> searchStaffsByName(String name){
        List<Staff> result = new ArrayList<>();
        for(int i = 0; i < staffList.size(); i++){
            Staff temp = getStaffByIndex(i);
            if(temp.getName().contains(name))
                result.add(temp);

        }
        return  result;
    }

    public void showStaffs(Staff staff) {
        System.out.println("Worker " + staff.getName() +" information");
        staff.showPerson(staff.getName(),staff.getAge(), staff.getSex(), staff.getAddress());
        System.out.println("Work: " + staff.getWork());
    }
}
