package controller;

import java.util.Scanner;

import service.EmployeeService;

public class PrintAllController extends Controller {
	@Override
	public void execute(Scanner sc) {
		EmployeeService.getInstance().printAllEmployee();
	}
}
