public class Division extends Operation {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String operator() {
        return " / ";
    }

    @Override
    public double calcule(double... variables) {
        if(this.getRight().evalue(variables) == 0.0)throw  new DivisionParZeroException(this);
        return this.getLeft().evalue(variables) / this.getRight().evalue(variables);
    }
}
