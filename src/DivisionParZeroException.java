public class DivisionParZeroException extends ExpressionException {
    public DivisionParZeroException(Expression exp) {
        super(exp, "On ne peux pas diviser par 0");
    }
}
