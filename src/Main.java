public class Main {
    public static void main(String[] args) {
        double[] myData = {10,15,20,35,68,1526415,10,641,56};
        Expression expression = new Addition(
                new Division(
                        new Constante(2),
                        new Variable(0)),
                new Constante(1)
        );

        System.out.println(expression + "= "+ expression.evalue(myData));
    }
}
