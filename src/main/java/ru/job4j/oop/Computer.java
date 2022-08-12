package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;
    private String gpu;

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println("Модель GPU: " + gpu);
    }

    public Computer() {
    }

    public Computer(boolean multiMonitor, int ssd, String cpu, String gpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700k", "Nvidia RTX 1050");
        computer.printInfo();
        System.out.println();
        Computer info = new Computer(true, 1024, "AMD Ryzen 7 5800H", "Nvidia RTX 3070");
        info.printInfo();
        Computer copm = new Computer();
        System.out.println();
        copm.printInfo();
    }
}
