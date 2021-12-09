package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().getList();
		System.out.println("전체 학생 정보 출력");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}










