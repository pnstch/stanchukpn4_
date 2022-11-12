import static java.lang.Math.sqrt;

public class RightTriangle {


    private double cathet1;
    private double cathet2;
    private double hypotenuse;

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public RightTriangle() {
    }

    public double getCathet1() {
        return cathet1;
    }

    public void setCathet1(double cathet1) {
        this.cathet1 = cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void setCathet2(double cathet2) {
        this.cathet2 = cathet2;
    }


    public static void showHypotenuse(RightTriangle treugolnik){
        System.out.println("Hypotenuse is: "+ (sqrt(treugolnik.getCathet1()*treugolnik.getCathet1()+treugolnik.getCathet2()*treugolnik.getCathet2())));
    }
}

