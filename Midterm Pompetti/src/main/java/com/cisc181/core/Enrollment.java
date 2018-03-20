package main.java.com.cisc181.core;

import java.util.UUID;

public class Enrollment {
		private UUID SectionID;
		private UUID StudentID;
		private UUID EnrollmentID;
		private double Grade;
		
		
		public double getGrade() {
			return Grade;
		}
		public void setGrade(double grade) {
			Grade = grade;
		}
		
		private Enrollment() {
			
		}
		public Enrollment(UUID StudentID, UUID SectionID) {
			
		}
}

