package Computer;

import Computer.hardDisk.HardDisk;
import Computer.hardDisk.TypeHardDisk;
import Computer.keyboard.Backlight;
import Computer.keyboard.Keyboard;
import Computer.keyboard.TypeKeyboard;
import Computer.memory.Ram;
import Computer.memory.TypeRam;
import Computer.monitor.Display;
import Computer.monitor.TypeDisplay;
import Computer.processor.CoreProcessor;
import Computer.processor.FrequencyProcessor;
import Computer.processor.MadeInProcessor;
import Computer.processor.Processor;

public class MainComputer {
    public static void main(String[] args) {
        Processor processor=new Processor(0.25,CoreProcessor.FOUR_CORE,FrequencyProcessor.FOUR_GHZ,
                MadeInProcessor.AMD);
        Ram ram = new Ram(0.2,8, TypeRam.DDR4);
        HardDisk hardDisk = new HardDisk(500,1.5, TypeHardDisk.SSD);
        Keyboard keyboard=new Keyboard(1.5, TypeKeyboard.MECHANICAL, Backlight.BACKLIGHT_NO);
        Display display=new Display(20,3.5, TypeDisplay.IPS);
        Computer computer=new Computer(processor,ram,hardDisk,display,keyboard);

        System.out.println(computer);
    }
}
