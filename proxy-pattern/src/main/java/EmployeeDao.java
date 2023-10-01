public interface EmployeeDao {

    void createEmployee(String client, Employee employee) throws Exception;
    Employee getEmployee(String client, Integer employeeId);
    void deleteEmployee(String client, Integer employeeId);

}
