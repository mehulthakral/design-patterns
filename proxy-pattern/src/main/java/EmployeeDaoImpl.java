public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void createEmployee(String client, Employee employee) {
        System.out.println("Employee created");
    }

    @Override
    public Employee getEmployee(String client, Integer employeeId) {
        System.out.println("Finding employee with Id " + employeeId);
        return new Employee();
    }

    @Override
    public void deleteEmployee(String client, Integer employeeId) {
        System.out.println("Deleted employee with Id " + employeeId);
    }
}
