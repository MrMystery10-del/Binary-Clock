package Gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Clock.KeyHand;

public class Frame extends JFrame {

    KeyHand keyHandler = new KeyHand();
    Gui gui = new Gui();
    ImageLoader imageLoader = new ImageLoader();

    

    public void JFrame() {
        
        //Button Erstellung
        JButton jButton = new JButton();

        jButton.setPreferredSize(new Dimension(50, 40));
        jButton.setBounds(650, 50, 50, 40);
        jButton.addActionListener(new ActionListener(){  
            
            //Button Click Event
            public void actionPerformed(ActionEvent e){ 

                gui.ClockColor++;

                    }
                });

                //Frame Stats
        this.setTitle("Binary Uhr by Kirils Turkins");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

        //Button, KeyHandler und Draw Method zu Frame hinzufuegen 
        this.add(jButton);
        this.add(gui);
        this.addKeyListener(keyHandler);
        jButton.addKeyListener(keyHandler);

        this.setVisible(true);

        this.isFocusable();

        //PNGs laden
        imageLoader.ImageLoaderT();

        while(true){
            //Farb Styles reseten
            if (gui.ClockColor > 10){
                gui.ClockColor = 0;
            }
            //KeyHandler Variablen weiterleiten
            EK();
        }

        

    }
    public void EK(){
        //KeyHandler Variablen weiterleiten
    gui.GuiHand = keyHandler.NoobTime; 
    gui.Explain = keyHandler.EH;
    }
    
}
