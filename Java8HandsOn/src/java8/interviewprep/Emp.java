package java8.interviewprep;

import java.time.LocalDate;

public class Emp {

	
		private String fName;
		
		private LocalDate date;

		
		
		public Emp(String fName, LocalDate date) {
			super();
			this.fName = fName;
			this.date = date;
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Emp [fName=" + fName + ", date=" + date + "]";
		}

		
		
		
	
}
