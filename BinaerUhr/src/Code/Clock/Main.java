package Clock;

import Gui.Frame;

public class Main{
    
    public static void main(String[] args) {

        // Frame und Rechnung starten

        Rechnung rechnung = new Rechnung();
        Frame frame = new Frame();

        frame.JFrame();
        rechnung.firstRechnung();
    }
    
}