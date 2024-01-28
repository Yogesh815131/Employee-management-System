import com.sfs.controller.EmployeeController;
import com.sfs.factory.EmployeeControllerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to employee Management System");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            EmployeeController employeeController = EmployeeControllerFactory.getEmployeeController();
            while(true){
                System.out.println("1. ADD Employee");
                System.out.println("2. SEARCH Employee");
                System.out.println("3. UPDATE Employee");
                System.out.println("4. DELETE Employee");
                System.out.println("Your Option     : ");
                int userOption = Integer.parseInt(bufferedReader.readLine());

                switch (userOption){
                    case 1:
                        System.out.println("ADD Employee Module");
                        System.out.println("===============================");
                        employeeController.addEmployee();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("thank you for using");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("wrong option please enter 1,2, 3, 4 and 5");
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}