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

		report = "Not yet implemented"; // replace with logic.

		return report;
	}

}