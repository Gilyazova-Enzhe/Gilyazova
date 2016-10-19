 class Student {
	String name;
	String surname;
	int birthday;
	String yearOfEntrance;
	int course;
	boolean grant;
	
	
	University univer = new University();
	
	
	Student (){}
	
	
	Student(String name, String surname, int birthday, String university, int course, boolean grant, String yearOfEntrance ) {
		
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.birthday=birthday;
		this.yearOfEntrance=yearOfEntrance;
		this.course=course;
		this.grant=grant;
		univer.setUniversity(university);
		birth.setBirthday(birthday);
	}
	
	
	String getName() {
		return name;
	}
	
	
	void setName(){
		this.name = name;
	}
	
	
	String getFullName(){
		return this.name + " " + this.surname;
	}
	
	
	String getFromOfStuding(){
		if (this.grant) {
			return getFullName() + " student on budget" ;
		}
		else {
			return getFullName() + " student on contract" ;
		}	
	}
	
	
	
}