class MyApp {
    public static void main(String[] args) {
        Human h = new Human(10, true, 10, 35, 68, false, 170);
        Monkey m = new Monkey(0, true, 40, 35, 110);
        System.out.println(h.getCreative());
        System.out.println(h.getAge());
        System.out.println(h.getWeight());
        System.out.println(h.getGrowth());
    }
}