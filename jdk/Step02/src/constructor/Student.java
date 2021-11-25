package constructor;

public class Student {
	String no;
	String name;
	String major;
	double score;
	/*
	 * 4.5 --> A+
	 * 4.0~4.4 --> A
	 * 3.5~3.9 --> B+
	 * 3.0~3.4 --> B
	 * 2.5~2.9 --> C+ 
	 * 2.0~2.4 --> C
	 * 1.0~1.9 --> D
	 * 0.0~0.9 --> F 
	 */
	String grade;//등급 ---> score를 기준으로 작성
	//전체 데이터를 받아서 초기화하는 생성자(학번, 이름, 학과, 평점)
	Student(String n, String a, String m, double s){
		no = n;
		name = a;
		major = m;
		score = s;
		switch((int)(s / 0.5)) {
		case 9:
			grade = "A+";
			break;
		case 8:
			grade = "A";
			break;
		case 7:
			grade = "B+";
			break;
		case 6:
			grade = "B";
			break;
		case 5:
			grade = "C+";
			break;
		case 4:
			grade = "C";
			break;
		case 3:
		case 2:
			grade = "D";
			break;
		default:
			grade = "F";
		}
	}
}



