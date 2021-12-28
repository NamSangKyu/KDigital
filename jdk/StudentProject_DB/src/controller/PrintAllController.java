package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = 
				StudentService.getInstance().selectAllStudent();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}










