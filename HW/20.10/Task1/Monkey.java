class Monkey {
    protected int creative;
    protected boolean wool;
    protected int age;
    protected int weight;
    protected int growth;
    private boolean eatBanana;
    private boolean sleep;


    Monkey() {
    }

    public int getAge() {
        return age;
    }

    public int getCreative() {
        return creative;
    }

    public int getWeight() {
        return weight;
    }

    public int getGrowth() {
        return growth;
    }

    void eatBanana() {
        eatBanana = true;
    }

    void goSleep() {
        sleep = true;
    }

    void wakeUp() {
        sleep = false;
    }

    Monkey(int creative, boolean wool, int age, int weight, int growth) {
        this.creative = creative;
        this.wool = wool;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }


}