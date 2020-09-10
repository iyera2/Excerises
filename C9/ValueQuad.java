public class ValueQuad {
    public static void main(String[] args) {
        double X;
        X = 2.0;
        double value = 4.0;
        float Quad = (float) (3 * (X * X) - (8 * X) + 4);
        float Quad2 = (float) (3 * (value * value) - (8 * value) + 4);
        System.out.println(Quad);
        System.out.println(Quad2);
        X = 0.0;
        float Quad3 = (float) (3 * (X * X) - (8 * X) + 4);
        System.out.println(Quad3);
    }
}