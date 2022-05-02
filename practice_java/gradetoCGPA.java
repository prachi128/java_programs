import java.util.*;

class gradetoCGPA {
	public static double letterToGPA(String grade) {
		double gpa;
		switch (grade) {
		case "A+":
		case "A":
			gpa = 4;
			break;
		case "A-":
			gpa = 3.7;
			break;
		case "B+":
			gpa = 3.3;
			break;
		case "B":
			gpa = 3;
			break;
		case "B-":
			gpa = 2.8;
			break;
		case "C+":
			gpa = 2.5;
			break;
		case "C":
			gpa = 2;
			break;
		case "C-":
			gpa = 1.8;
			break;
		case "D":
			gpa = 1.5;
			break;
		case "F":
			gpa = 0;
			break;
		default:
			gpa = -1;
		}
		return gpa;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String grade = scn.nextLine();
		System.out.println(letterToGPA(grade));
	}
}