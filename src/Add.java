import interfaces.MathOperation;

public class Add implements MathOperation {

    @Override
    public int operate(int a, int b) {
        return (a + b);
    }
}
