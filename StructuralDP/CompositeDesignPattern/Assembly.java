package CompositeDesignPattern;

import java.util.ArrayList;

public class Assembly implements Component {
    ArrayList<Component> arr = new ArrayList<>();

    public void add(Component a){
        arr.add(a);
    }

    public void remove(Component a){
        arr.remove(a);
    }

    @Override
    public void showcomponent() {
        for(Component a:arr){
            a.showcomponent();
        }
    }

}