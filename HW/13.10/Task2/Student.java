class Student {
    String name;
    String surname;
    int age;
    String yearOfEntrance;
    int course;
    boolean grant;
    University univer;
    Avocation av;


    Student() {
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    Student(String name, String surname, int age, University university, int course, boolean grant, String yearOfEntrance, Avocation av) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.yearOfEntrance = yearOfEntrance;
        this.course = course;
        this.grant = grant;
        this.univer = university;
        this.av = av;
    }

    String getName() {
        return name;
    }

    String getFullName() {
        return this.name + " " + this.surname;
    }

    String isChempion() {
        if (av.isChempion()) {
            return getName() + " chempion";
        } else {
            return getName() + " not chempion";
        }
    }

    String infoAboutUniversity() {
        return "Student studies in " + univer.getName() + " in " + univer.getCity();
    }

    void passSession() {
        this.course++;
    }

    String getFormOfStuding() {
        if (this.grant) {
            return getFullName() + " student on budget";
        } else {
            return getFullName() + " student on contract";
        }
    }


}