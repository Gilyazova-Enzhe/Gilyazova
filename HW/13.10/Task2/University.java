class University {
    String name;
    String city;

    University() {
    }

    University(String name, String city) {
        this.name = name;
        this.city = city;
    }

    String getCity() {
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