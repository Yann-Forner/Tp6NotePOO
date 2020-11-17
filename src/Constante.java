public class Constante implements Expression {
    private final double  myConst ;

    public Constante(double myConst) {
        this.myConst = myConst;
    }

    @Override
    public double evalue(double... variables) {
        return this.myConst;
    }

    public double getMyConst() {
        return myConst;
    }

    @Override
    public String toString() {
        return this.myConst+"";
    }
}
