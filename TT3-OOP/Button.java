public class Button {
    private String label;
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getColor() {
        return color;
    }
    public String getLabel() {
        return label;
    }
    public void Press() {
        this.color = "GREEN";
        this.label = "ON";
    }
    public void dePress() {
        this.color = "RED";
        this.label = "OFF";
    }

}
