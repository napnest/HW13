package Computer.keyboard;

public class Keyboard {
    private double weight;
    private TypeKeyboard typeKeyboard;
    private Backlight backlight;

    public Keyboard(double weight, TypeKeyboard typeKeyboard, Backlight backlight) {
        this.weight = weight;
        this.typeKeyboard = typeKeyboard;
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTypeKeyboard(TypeKeyboard typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    @Override
    public String toString() {
        return
                "Вес клавиатуры: " + weight +
                ", Тип клавиатуры: " + typeKeyboard +
                ", Подсветка:" + backlight;
    }
}
