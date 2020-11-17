public class VariableNonDefinieException extends ExpressionException {
    public VariableNonDefinieException(Expression exp) {
        super(exp, "La variable n'est pas définie");
    }
}
