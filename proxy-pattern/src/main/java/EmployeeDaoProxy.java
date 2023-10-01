import java.util.Objects;

public class EmployeeDaoProxy implements EmployeeDao {

    private EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        if (!Objects.equals(client, "ADMIN")) {
            throw new RuntimeException("Insufficent Priviledges");
        }
        employeeDao.createEmployee(client, employee);
    }

    @Override
    public Employee getEmployee(String client, Integer employeeId) {
        if (!client.equals("ADMIN") && !client.equals("USER")) {
            throw new RuntimeException("Insufficent Priviledges");
        }
        return employeeDao.getEmployee(client, employeeId);
    }

    @Override
    public void deleteEmployee(String client, Integer employeeId) {
        if (!Objects.equals(client, "ADMIN")) {
            throw new RuntimeException("Insufficent Priviledges");
        }
        employeeDao.deleteEmployee(client, employeeId);
    }
}
