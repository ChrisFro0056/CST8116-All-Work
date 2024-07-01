// To Do: Programmer Comments

public class GradingSystem {
	private String courseName;
	private String letterGrade;

	public GradingSystem() {
		this("Not specified", "F");
	}

	public GradingSystem(String courseName, String letterGrade) {
		setCourseName(courseName);
		setLetterGrade(letterGrade);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String createReport() {
		String report = null;

		switch (letterGrade){
			case "A":
				report = "course:" + courseName + ", Entered Grade A, Percent Grade 80 – 100, Number Grade 4.0";
				break;
			case "B":
				report = "course:" + courseName + ", Entered Grade B, Percent Grade 70 – 79, Number Grade 3.0";
				break;
			case "C":
				report = "course:" + courseName + ", Entered Grade C, Percent Grade 60 – 69, Number Grade 2.0";
				break;
			case "D":
				//If the course is specifically ABC333 it will change the grade from D to an F
				if(courseName.equals("ABC333"))
					report = "course:" + courseName + ", Entered Grade D, Actual Grade F Percent Grade 0 – 49, Number Grade 0.0";
				else
					report = "course:" + courseName + ", Entered Grade D, Percent Grade 50 – 59, Number Grade 1.0";
				break;
			case "F":
				report = "course:" + courseName + ", Entered Grade F, Percent Grade 0 – 49, Number Grade 0.0";
				break;

			default:
				report = "Invalid letter grade entered";

		}

		return report;
	}

}