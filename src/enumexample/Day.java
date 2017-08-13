package enumexample;

public class Day {
    Week week;
	public Day(Week week) {
		this.week = week;
	}
	
	public void whatToDo() {
		switch(week) {
		case MONDAY: System.out.println("Home work starts");break;
		case TUESDAY: System.out.println("Codelab assignment");break;
		case WEDNESDAY: System.out.println("Join mentoring");break;
		case THURSDAY: System.out.println("Discussion group");break;
		case FRIDAY: System.out.println("Home work submit");break;
		case SATURDAY: System.out.println("Lecture 1");break;
		case SUNDAY: System.out.println("Lecture2");break;
		default: System.out.println("no more days left.");
		}
	}
}
