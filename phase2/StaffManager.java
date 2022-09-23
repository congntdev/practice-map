package practice8.phase2;

import java.util.*;

public class StaffManager {
    private final ArrayList<Staff> staffList;
    final Map<String, ArrayList<Staff>> athena;

    public StaffManager() {
        this.staffList = new ArrayList<Staff>();
        this.athena = new HashMap<>();
    }

    public void addStaff(Staff staff) {
        this.staffList.add(staff);
    }

    public void addMap() {
        staffList.forEach(staff -> {
            ArrayList<Staff> staffDepartment = athena.get(staff.getDepartment());
            if (staffDepartment == null) {
                staffDepartment = new ArrayList<Staff>() {{
                    add(staff);
                }};
            } else {
                staffDepartment.add(staff);
            }
            athena.put(staff.getDepartment(), staffDepartment);
        });
    }

    public void showStaffList() {
        System.out.println("HCNS: " + athena.get("HCNS"));
        System.out.println("CSKH: " + athena.get("CSKH"));
        System.out.println("SALE: " + athena.get("SALE"));
        System.out.println("BOD: " + athena.get("BOD"));
        System.out.println("PRODUCT: " + athena.get("PRODUCT"));
    }

    public void staffListForAge() {
        this.staffList.sort(new Comparator<Staff>() {
            @Override
            public int compare(Staff staff1, Staff staff2) {
                return Integer.compare(staff2.getAge(), staff1.getAge());
            }
        });
    }

    public void staffBirthday(int month) {
        for (Staff staff : staffList) {
            if (staff.getMonth() == month) {
                System.out.println(staff);
            }
        }
    }

    public void staffSalary(String department) {
        int count = 0;
        for (Staff staff : staffList) {
            if (staff.getDepartment().equals(department)) {
                count ++;
                double newSalary = staff.getSalary() * (10/count);
                System.out.println(staff + "new salary: " +newSalary);
            }
        }
    }

    public void vacationDay() {
        for (Staff staff : staffList) {
            System.out.println(staff + "vacation day: " + staff.getVacationDay());
        }
    }
}
