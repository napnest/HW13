package Computer.hardDisk;

public class HardDisk {
    private int capacityHardDisk;
    private double weight;
    private TypeHardDisk typeHardDisk;

    public HardDisk(int capacityHardDisk, double weight, TypeHardDisk typeHardDisk) {
        this.capacityHardDisk = capacityHardDisk;
        this.weight = weight;
        this.typeHardDisk = typeHardDisk;
    }

    public int getCapacityHardDisk() {
        return capacityHardDisk;
    }

    public double getWeight() {
        return weight;
    }

    public TypeHardDisk getTypeHardDisk() {
        return typeHardDisk;
    }

    public void setCapacityHardDisk(int capacityHardDisk) {
        this.capacityHardDisk = capacityHardDisk;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTypeHardDisk(TypeHardDisk typeHardDisk) {
        this.typeHardDisk = typeHardDisk;
    }
    public String toString(){
        return "Емкость жесткого диска: "+getCapacityHardDisk()+" Тип жесткого диска: "+getTypeHardDisk()
                +" Вес жесткого диска: "+getWeight();
    }
}
