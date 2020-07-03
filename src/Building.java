abstract class Building implements IBuildable {
    private double length;
    private double width;
    private double height;
    private double density;

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public Building() {
        length = 100;
        width = 100;
        height = 50;
        density = 200;
    }

    public Building(double length, double width, double height, double density) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.density = density;
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public abstract double getVolume();

    @Override
    public String getForm() {
        if (length == width)
            return "Квадрат";
        else
            return "Прямоугольник";
    }

    public abstract String showInitialData();

    public abstract String showCalculatedData();


}
