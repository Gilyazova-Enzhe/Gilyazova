class StudentApp {
    public static void main(String[] args) {
        University u = new University("KFU", "Kazan");
        Avocation a = new Avocation("Dance", "МS", 100, true);
        Student s = new Student("Enzhe", "Gilyazova", 18, u, 1, false, "2016", a);
        System.out.println(s.getFullName());
        System.out.println(s.getAge());
        System.out.println(s.infoAboutUniversity());
        System.out.println(s.getFormOfStuding());
        System.out.println(s.isChempion());
        s.passSession();
        System.out.println(s.getCourse());
    }
}
