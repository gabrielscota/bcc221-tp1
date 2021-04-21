package ui.pages.employees;

public interface EmployeeController
{
  void backPage();
  void addEmployeeToClinic(String type);
  void addEmployee();
  void saveEmployee();
  boolean validateName();
  boolean validateUser();
  boolean validatePassword();
  boolean validateCombobox();
  void showEmployeesTable();
  void populateCombobox();
  void onSelectedEmployee();
}