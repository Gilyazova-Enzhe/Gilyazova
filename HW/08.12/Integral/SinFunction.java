package Integral;

/**
 * Created by hp on 28.12.2016.
 */
import static java.lang.Math.sin;
public class SinFunction implements FunctionAware {
    public SinFunction() {
    }

    @Override
    public float func(float x) {
        return (float) sin(x);
    }
}