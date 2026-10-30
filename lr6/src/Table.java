public class Table {
    private final double diameter;
    private final String material;

    private int a;
    private static int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Table(int diameter, String material, int a) {
        this(diameter,material);
        this.a = a;
    }

    public void method1(){
        System.out.println(this.diameter + this.material + this.a + b);
    }

    public static void method2(){
        System.out.println(b);
    }

    public Table(double diameter, String material) {
        if (!Double.isFinite(diameter) || diameter <= 0) {
            throw new IllegalArgumentException("Диаметр должен быть положительным числом.");
        }
        if (material == null || material.isBlank()) {
            throw new IllegalArgumentException("Материал не должен быть пустым.");
        }
        this.diameter = diameter;
        this.material = material;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }

    public double area() {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius;
    }
}
