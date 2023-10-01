package Computer.processor;



public class Processor {
private double weight;
private CoreProcessor coreProcessor;
private FrequencyProcessor frequencyProcessor;
private MadeInProcessor madeInProcessor;

    public Processor(double weight, CoreProcessor coreProcessor,FrequencyProcessor frequencyProcessor,
                     MadeInProcessor madeInProcessor) {
        this.weight = weight;
        this.coreProcessor = coreProcessor;
        this.frequencyProcessor = frequencyProcessor;
        this.madeInProcessor = madeInProcessor;
    }

    public double getWeight() {
        return weight;
    }

    public CoreProcessor getCoreProcessor() {
        return coreProcessor;
    }

    public FrequencyProcessor getFrequencyProcessor() {
        return frequencyProcessor;
    }

    public MadeInProcessor getMadeInProcessor() {
        return madeInProcessor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCoreProcessor(CoreProcessor coreProcessor) {
        this.coreProcessor = coreProcessor;
    }

    public void setFrequencyProcessor(FrequencyProcessor frequencyProcessor) {
        this.frequencyProcessor = frequencyProcessor;
    }

    public void setMadeInProcessor(MadeInProcessor madeInProcessor) {
        this.madeInProcessor = madeInProcessor;
    }

    @Override
    public String toString() {
        return
                "Вес процессора: " + weight +
                ", Количество ядер: " + coreProcessor +
                ", Частота процессора" + frequencyProcessor +
                ", Изготовитель: " + madeInProcessor ;

    }
}
