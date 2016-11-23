/**
 * Created by hp on 22.11.2016.
 */
abstract class TV {
    private String name;
    private String model;
    private int currentChannel;

    public TV(String name, String model, int currentChannel) {
        this.name = name;
        this.model = model;
        this.currentChannel = currentChannel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public abstract void switchOn();

    public abstract void switchOff();

    public void nextChannel() {
        int channel = getCurrentChannel();
        setCurrentChannel(++channel);
        System.out.println(channel);
    }

    public void previousChannel() {
        int channel = getCurrentChannel();
        setCurrentChannel(--channel);
        System.out.println(channel);
    }
}
