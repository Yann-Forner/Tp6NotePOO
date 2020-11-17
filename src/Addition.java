public class Addition extends Operation{

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String operator() {
        return " + ";
    }

    @Override
    public double calcule(double... variables) {
        return this.getLeft().evalue(variables) + this.getRight().evalue(variables);
    }
}
