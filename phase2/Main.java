package practice8.phase2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaffManager staffManager = new StaffManager();

        int chose = 0;
        do{
            System.out.println(
                    """
                            1. Add staffs.\s
                            2. Show staffs by department.\s
                            3. Show staffs by age of the department.\s
                            4. Show staffs have birthday in the same month.\s
                            5. Show staff's salary.\s
                            6. Show staff's vacation day.\s
                            0. Exit program.""");
            System.out.print("Enter your choice: ");
            chose = sc.nextInt();

            if (chose == 1) {
                System.out.print("Full staff's name: ");
                String name = sc.next();
                System.out.print("Staff's phone: ");
                int phone = sc.nextInt();
                System.out.print("Staff's address: ");
                String address = sc.next();
                System.out.print("Staff's birthday (dd/MM/yyyy): ");
                String date = sc.next();
                System.out.print("Staff's department (HCNS, CSKH, SALE, BOD, PRODUCT): ");
                String department = sc.next();
                System.out.print("Staff's job: ");
                String job = sc.next();
                System.out.print("Staff's seniority: ");
                float seniority = sc.nextFloat();
                System.out.print("Staff's salary: ");
                int salary = sc.nextInt();
                Staff staff = new Staff(name, phone, address, date, department, job, seniority, salary);
                staffManager.addStaff(staff);
                staffManager.addMap();
            } else if (chose == 2) {
                staffManager.showStaffList();
            } else if (chose == 3) {
                staffManager.staffListForAge();
                staffManager.showStaffList();
            } else if (chose == 4) {
                System.out.print("Birthday month: ");
                int month = sc.nextInt();
                staffManager.staffBirthday(month);
            } else if (chose == 5) {
                System.out.print("Enter department (HCNS, CSKH, SALE, BOD, PRODUCT): ");
                String department = sc.next();
                staffManager.staffSalary(department);
            } else if (chose == 6) {
                System.out.println("Staff's vacation day: ");
                staffManager.vacationDay();
            }
        } while (chose != 0);
    }
}
