package J2EE.BusinessLayerDesignPattern.TransferObjectPattern;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public EmployeeDTO getEmployeeDetails(String employeeId) {
        // Assume fetching employee details from a database or remote service
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setFirstName("John");
        employeeDTO.setLastName("Doe");
        employeeDTO.setDepartment("Engineering");
        return employeeDTO;
    }
}