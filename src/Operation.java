public abstract class Operation implements Expression{

    private Expression left;
    private Expression right;

    public Operation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
    abstract String operator();

    public abstract double calcule(double ... variables);

    @Override
    public double evalue(double... variables) {
        return calcule(variables);
    }

    @Override
    public String toString() {
        return "(" + this.left + this.operator() + this.right + ")" ;
    }
}
