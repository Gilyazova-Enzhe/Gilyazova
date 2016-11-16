class Human extends Monkey {
    private boolean mind;
    private int danceLevel;

   public Human(int creative, boolean wool, int age, int weight, int growth, boolean mind, int danceLevel) {
        super(creative, wool, age, weight, growth);
        this.mind = mind;
        if (!(danceLevel >= 0 && danceLevel <= 10)) danceLevel = 0;
        this.danceLevel = danceLevel;
    }

    public boolean isMind() {
        return mind;
    }

    public int getDanceLevel() {
        return danceLevel;
    }
}