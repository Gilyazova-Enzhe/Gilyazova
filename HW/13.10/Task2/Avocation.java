class Avocation {
    String name;
    String grade;
    int prize;
    boolean chempion;

    Avocation() {
    }

    Avocation(String name, String grade, int prize, boolean chempion) {
        this.name = name;
        this.grade = grade;
        this.prize = prize;
        this.chempion = chempion;
    }

    String getName() {
        return name;
    }

    public boolean isChempion() {
        return chempion;
    }

    void setName(String name) {
        this.name = name;
    }

    String getGrade() {
        return grade;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }

    int getPrize() {
        return prize;
    }

    void setPrize(int prize) {
        this.prize = prize;
    }

    void setChempion(boolean chempion) {
        this.chempion = chempion;
    }
}