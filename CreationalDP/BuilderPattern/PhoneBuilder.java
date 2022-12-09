package BuilderPattern;

public class PhoneBuilder {
    String OS, size;
    int Ram;

    public String getOS() {
        return OS;
    }

    public PhoneBuilder setOS(String oS) {
        OS = oS;
        return this;
    }

    public String getSize() {
        return size;
    }

    public PhoneBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public int getRam() {
        return Ram;
    }

    public PhoneBuilder setRam(int ram) {
        Ram = ram;
        return this;
    }

    @Override
    public String toString() {
        return "PhoneBuilder [OS=" + OS + ", Ram=" + Ram + ", size=" + size + "]";
    }

    Phone build() {
        return new Phone(OS, size, Ram);
    }

}
