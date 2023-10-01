package Computer.memory;



public class Ram {
   private double weight;
   private int capacityMemory;
   private TypeRam typeRam;

    public Ram(double weight, int capacityMemory, TypeRam typeRam) {
        this.weight = weight;
        this.capacityMemory = capacityMemory;
        this.typeRam = typeRam;
    }

    public double getWeight() {
        return weight;
    }

    public int getCapacityMemory() {
        return capacityMemory;
    }

    public TypeRam getTypeRam() {
        return typeRam;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacityMemory(int capacityMemory) {
        this.capacityMemory = capacityMemory;
    }

    public void setTypeRam(TypeRam typeRam) {
        this.typeRam = typeRam;
    }

    @Override
    public String toString() {
        return
                "Вес ОЗУ: " + weight +
                ", Объем ОЗУ: " + capacityMemory +
                ", Тип памяти: " + typeRam ;
    }
}
