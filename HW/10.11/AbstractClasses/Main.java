/**
 * Created by hp on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        TV tv = new LG("LG", "24LH450U", 5);
        tv.nextChannel();
        tv.nextChannel();
        System.out.println(tv.getCurrentChannel());
    }
}
