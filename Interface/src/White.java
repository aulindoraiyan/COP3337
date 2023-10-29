public class White implements Human{
    private String language;
    private String eyesColor;

    public White(String language, String eyesColor) {
        this.language = language;
        this.eyesColor = eyesColor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public void legs() {
        System.out.println("White have 2 legs too");
    }

    @Override
    public void hands() {
        System.out.println("White have 2 legs too");
    }

    @Override
    public void blood() {
        System.out.println("Their blood have rbc and wbc too");

    }
    public String toString(){
        return "Whites speak in " + getLanguage()+" and their eye color is " + getEyesColor();
    }
}
