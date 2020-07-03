public class Church extends Building {

    private double koeff = 0.224;
    public Church() {

        super();
    }

    public Church(double len, double wid, double hei, double dens) {
        super(len, wid, hei, dens);
    }

    @Override
    public double getVolume() {
        return getHeight() * getWidth() * getLength() * koeff;
    }

    @Override
    public String showInitialData() {
        return "Длина:" + getLength()  + ", ширина:" + getWidth() + ", высота" + getHeight();
    }

    @Override
    public String showCalculatedData() {
        return (getType() + " с объемом: " + getVolume() + " куб.м. и в форме:" + getForm());
    }


    @Override
    public String getType() {
        return "Церковь";
    }


}
