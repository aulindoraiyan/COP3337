public  abstract class Asian implements Human{
    private String language;
    public String eyesColor;

    public Asian(String language, String eyesColor) {
        this.language = language;
        this.eyesColor = eyesColor;
    }

    public Asian(){
        this("No language", "No color");
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
//    public void legs() {
//        System.out.println("Asians have 2 legs too.");
//    }

    @Override
    public void hands() {
        System.out.println("Asians have 2 hands too.");
    }

    @Override
    public void blood() {
        System.out.println("Their blood have RBC AND WBC too. ");
    }

    public String toString(){
        return "Asians speak in " + getLanguage() + " and their eye color is " + getEyesColor();
    }
}
