package test;


//color 
interface ColorPrintable{
	void printColor(String doc); //�÷� 
}

interface Printable extends ColorPrintable {
	void print(String doc); //��� 
}


class Prn999 implements Printable {
	public void printColor(String doc) {
		System.out.println("�÷� ��� doc ");
	}
	
	public void print(String doc) {
		System.out.println("��� ��� doc ");
	}
	
}

class Prn888 implements Printable {
	public void printColor(String doc) {
		System.out.println("�÷� ��� doc ");
	}
	
	public void print(String doc) {
		System.out.println("��� ��� doc ");
	}
	
}

class Prn77 implements Printable {
	public void printColor(String doc) {
		System.out.println("�÷� ��� doc ");
	}
	
	public void print(String doc) {
		System.out.println("��� ��� doc ");
	}
	
}





public class PrnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prn999 prn999 = new Prn999();
		
		prn999.print("");
		prn999.printColor("");
	}

}
