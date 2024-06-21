package controller;

public class EmployeeFormController extends AssociateFormController{
    private String department;
    private String jobTitle;
    private  double basicSalary;
    private String passportDetail;

    public EmployeeFormController() {
    }

    public EmployeeFormController(String name, String id, int age, String address, String contact, String department, String jobTitle, double basicSalary, String passportDetail) {
        super(name, id, age, address, contact);
        this.department = department;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
        this.passportDetail = passportDetail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getPassportDetail() {
        return passportDetail;
    }

    public void setPassportDetail(String passportDetail) {
        this.passportDetail = passportDetail;
    }
}
