public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.createEmployee("ADMIN", new Employee());
        employeeDao.getEmployee("USER", 1);
        employeeDao.deleteEmployee("ADMIN", 1);
    }
}
