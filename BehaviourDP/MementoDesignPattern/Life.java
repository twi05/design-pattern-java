package BehaviourDP.MementoDesignPattern;

import Singleton.Item;

public class Life {
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }



    Memento addprevstate(Life l) {
        return new Memento(l.getTime());
    }

    void getMementoTime(Memento m)
    {
        System.out.println(m.getTime());
    }

    class Memento {
        String time;

        Memento(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }
        
    }
}
