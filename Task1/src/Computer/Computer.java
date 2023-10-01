package Computer;

import Computer.hardDisk.HardDisk;
import Computer.hardDisk.TypeHardDisk;
import Computer.keyboard.Keyboard;
import Computer.keyboard.TypeKeyboard;
import Computer.memory.Ram;
import Computer.memory.TypeRam;
import Computer.monitor.Display;
import Computer.monitor.TypeDisplay;
import Computer.processor.CoreProcessor;
import Computer.processor.Processor;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDisk hardDisk;
    private Display display;
    private Keyboard keyboard;
    static final String VENDOR = "CHINA";
    static final String NAME = "PC";

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(Processor processor, Ram ram, HardDisk hardDisk,
                    Display display, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.display = display;
        this.keyboard = keyboard;
    }

    public double summaWeight() {
        return hardDisk.getWeight()+keyboard.getWeight()+ram.getWeight()+display.getWeight()
                + processor.getWeight();
    }

    public String toString() {
        return "Название компьютера: " + NAME + "\n" + "Изготовитель: " + VENDOR + "\n" +
                "Монитор: " + display + "\n" + "Жесткий диск: " + hardDisk + "\n" +
                "Клавиатура: " + keyboard + "\n" + "Процессор: " + processor + "\n"
                + "Оперативная память: " + ram + "\n" + "Вес всех комплектующих: " + summaWeight() + " кг";
    }


}
