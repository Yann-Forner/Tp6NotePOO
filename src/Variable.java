public class Variable implements Expression {
    int id;

    public Variable(int id) {
        if (id < 0)throw new IllegalArgumentException();
        this.id =  id;
    }

    public int getId() {
        return id;
    }

    @Override
    public double evalue(double... variables) {
        if(variables.length <= this.id ) throw new VariableNonDefinieException(this);
        return variables[this.id];
    }

    @Override
    public String toString() {
        return "x("+this.id+")";
    }
}
