public abstract class ExpressionException extends RuntimeException {
    private Expression exp;

    public ExpressionException(Expression exp,String message) {
        super(message);
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }
}
