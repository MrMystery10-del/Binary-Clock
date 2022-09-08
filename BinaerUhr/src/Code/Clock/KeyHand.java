package Clock;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHand implements KeyListener{

    // Noob Mode
    public boolean NoobTime = false;
    // Explain Mode
    public boolean EH = false;

    Gui.Gui gui = new Gui.Gui();

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_N){
            // Noob Mode
            NoobTime = true;
    
        } else if (code == KeyEvent.VK_E){
            // Explain Mode
            EH = true;

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_N){
            NoobTime = false;
            
        } else if (code == KeyEvent.VK_E){
            EH = false;
            
        }
        
    }
    
}
