/**
 * Created by hp on 22.11.2016.
 */
public class LG extends TV {

    public LG(String name, String model, int currentChannel) {
        super(name, model, currentChannel);
    }

    @Override
    public void switchOn() {
        System.out.printf("Hello! I'm LG");
    }

    @Override
    public void switchOff() {
        System.out.printf("Goodbye!");

    }
}
