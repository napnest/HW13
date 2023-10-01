package Computer.monitor;

public class Display {
    private double diagonal;
    private double weight = 3;
    private TypeDisplay typeDisplay;

    public Display(double diagonal, double weight,TypeDisplay typeDisplay) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.typeDisplay = typeDisplay;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public TypeDisplay getTypeDisplay() {
        return typeDisplay;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTypeDisplay(TypeDisplay typeDisplay) {
        this.typeDisplay = typeDisplay;
    }

    @Override
    public String toString() {
        return
                "Диагональ монитора: " + diagonal +
                ", Вес монитора: " + weight +
                ", Тип монитора: " + typeDisplay ;

    }
}
