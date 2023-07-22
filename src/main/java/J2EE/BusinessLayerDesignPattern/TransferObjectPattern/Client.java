package J2EE.BusinessLayerDesignPattern.TransferObjectPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

    private final EmployeeService employeeService;

    @Autowired
    public Client(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void retrieveEmployeeDetails(String employeeId) {
        EmployeeDTO employeeDTO = employeeService.getEmployeeDetails(employeeId);

        // Process the retrieved employee details
        System.out.println("Employee Name: " + employeeDTO.getFirstName() + " " + employeeDTO.getLastName());
        System.out.println("Department: " + employeeDTO.getDepartment());
    }
}