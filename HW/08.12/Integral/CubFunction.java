package Integral;

/**
 * Created by hp on 28.12.2016.
 */
public class CubFunction implements FunctionAware {

    public CubFunction() {
    }

    @Override
    public float func(float x) {
        return x * x * x;
    }
}
