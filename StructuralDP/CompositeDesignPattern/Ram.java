package CompositeDesignPattern;

public class Ram implements Component{
    int size;
    Ram(int size){
        this.size = size;
    }

    @Override
    public void showcomponent() {
        System.out.println("ram size is "+size);
    }
}
