package BehaviourDP.MementoDesignPattern;

import java.util.ArrayList;

public class MementoDP {
    public static void main(String[] args) {
        Life l = new Life();
        
        ArrayList<Life.Memento> savedTime = new ArrayList<>();
        
        l.setTime("1pm");
        savedTime.add(l.addprevstate(l));
        l.setTime("1pm");
        savedTime.add(l.addprevstate(l));
        l.setTime("1pm");
        savedTime.add(l.addprevstate(l));
        l.setTime("4pm");
        savedTime.add(l.addprevstate(l));
        l.setTime("1pm");
        savedTime.add(l.addprevstate(l));

        l.getMementoTime(savedTime.get(3));
    }
}
