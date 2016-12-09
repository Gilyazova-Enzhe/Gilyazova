class SuperMan implements SportsmanInterface {
	
	
    @Override
    public void run() {
        System.out.println("I run faster than the Sportsman!");
    }

    @Override
    public void fight() {
        System.out.println("You'd better give up!");
    }
	
	@Override
    public void kill() {
        System.out.println("I will kill you in one minute!");
    }
	
    @Override
    public void jump() {
        System.out.println("If I jump off the pole, I can fly!");
    }

    @Override
    public void force() {
        System.out.println("I can be on the move ever!");
    }
	
	 @Override
    public void abilities() {
        System.out.println("I can do everything!");
    }
	
}