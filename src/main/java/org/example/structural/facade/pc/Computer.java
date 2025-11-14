package org.example.structural.facade.pc;

class Computer {
    private Processor processor;
    private Memory memory;
    private Hdd hdd;

    Computer() {
        this.processor = new Processor();
        this.memory = new Memory();
        this.hdd = new Hdd();
    }

    public void power() {
        processor.exec();
        memory.load(new byte[]{1, 2});
        hdd.save(new byte[]{3, 4});
    }
}

class Processor {
    public void jmp() {

    }

    public void exec() {

    }
}

class Memory {
    public void load(byte[] data) {

    }
}

class Hdd {
    public void save(byte[] data) {

    }
}
