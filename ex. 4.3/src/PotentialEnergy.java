public class PotentialEnergy {
    static int g = 10;
    private double h;
    private double m;

    public PotentialEnergy() {
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public static void Show(PotentialEnergy E){
        System.out.println("E = "+(E.getH()* E.getM()*g));
    }
}
