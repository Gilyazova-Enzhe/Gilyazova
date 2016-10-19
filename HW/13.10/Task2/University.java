class University{
	String name;
	String surname;
	String city;
	
	University(){}
	
	University (String name, String surname, String city){
		this.name=name;
		this.surname=surname;
		this.city=city;
	}
	String  getCity() {
	return city;
    }
	void setCity(String city) {
        this.city = city;
    }
	String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}