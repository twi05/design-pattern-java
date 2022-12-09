package BuilderPattern;

public class Phone {
    String OS, size;
    int Ram;

    public Phone(String oS, String size, int ram) {
        OS = oS;
        this.size = size;
        Ram = ram;
    }

    public String getOS() {
        return OS;
    }

    public String getSize() {
        return size;
    }

    public int getRam() {
        return Ram;
    }

    @Override
    public String toString() {
        return "Phone [OS=" + OS + ", Ram=" + Ram + ", size=" + size + "]";
    }
}
