package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import Clock.FieldCheck;
import Clock.Rechnung;

public class Gui extends JPanel{

    public Boolean GuiHand = false;

    public Boolean Explain = false;

    public int ClockColor = 0;

    public int Loading = 0;

    Color color1 = Color.decode("#2bacb5"); 
    Color color2 = Color.decode("#932bb5");
    Color color3 = Color.RED;

    ImageLoader imageLoader = new ImageLoader();
    
    
    public void update(){
        //paintComponent Methode Starten
            repaint();
    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        if (Loading >= 60){
            drawColor();
            drawBase(g2d);
            drawFeature(g2d);
            drawField(g2d);
            drawText(g2d);
            if(GuiHand == true){
                drawNoob(g2d);
            } else if (Explain == true){
                drawExplain(g2d);
            }
        }else if (Loading < 60) {
            drawLoadScreen(g2d);
        }
        
        g2d.dispose();
        update();
        
    }

    //Loading Screen
    public void drawLoadScreen(Graphics g2d){
        
        FieldCheck fieldCheck = new FieldCheck();

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, 800, 600);

        g2d.setFont(new Font("Arial", Font.BOLD, 50));
        g2d.setColor(Color.decode("#1b8537"));
        g2d.drawString("Loading...", 280, 250);

        g2d.drawRect(249, 299, 301, 21);
        g2d.fillRect(250, 300, 5 * Loading, 20);

        fieldCheck.getField();
        g2d.setFont(new Font("Arial", Font.BOLD, 17));
        g2d.drawString("FieldCheckDone: "+fieldCheck.FieldCheckDone, 10, 30);
        
        try {
            Thread.sleep(50);
            Loading ++;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    //Farb Style Checker
    public void drawColor(){

        if (ClockColor == 0){
            color1 = Color.decode("#2bacb5"); 
            Color.decode("#932bb5");
            color3 = Color.RED;
        } else if (ClockColor == 1){
            color1 = Color.RED;
            color2 = Color.decode("#d19f0a");
            color3 = Color.BLUE;
        } else if (ClockColor == 2){
            color1 = Color.MAGENTA;
            color2 = Color.GREEN;
            color3 = Color.WHITE;
        } else if (ClockColor == 3){
            color1 = Color.BLUE;
            color2 = Color.decode("#d19f0a");
            color3 = Color.GREEN;
        } else if (ClockColor == 4){
            color1 = Color.BLACK;
            color2 = Color.WHITE;
            color3 = Color.WHITE;
        } else if (ClockColor == 5){
            color1 = Color.decode("#7d4f06");
            color2 = Color.decode("#de9f3a");
            color3 = Color.ORANGE;
        } else if (ClockColor == 6){
            color1 = Color.decode("#e52165");
            color2 = Color.decode("#0d1137");
            color3 = Color.decode("#0d1137");
        } else if (ClockColor == 7){
            color1 = Color.decode("#ecc19c");
            color2 = Color.decode("#1e147f");
            color3 = Color.decode("#1e147f");
        } else if (ClockColor == 8){
            color1 = Color.decode("#1868ae");
            color2 = Color.decode("#d9a5b3");
            color3 = Color.decode("#8a307f");
            color3 = Color.BLACK;
        } else if (ClockColor == 9){
            color1 = Color.decode("#6883bc");
            color2 = Color.decode("#79a7d3");
            color3 = Color.decode("#79a7d3");
        } else if (ClockColor == 10){
            color1 = Color.decode("#fff1e1");
            color2 = Color.decode("#1d3c45");
            color3 = Color.decode("#d2601a");
        }

}
    //Main Konstrukt Zeichnen
    public void drawBase(Graphics g2d){

        boolean drawClock = true;
        int x = 50;
        int y = 50;
        
        //Draw Background
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(0, 0, 800, 600);

        g2d.setColor(Color.GRAY);
        g2d.fillRect(49, 49, 500, 500);

        g2d.setColor(Color.BLUE);
        g2d.drawRect(49, 49, 499, 500);

        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(650, 50, 50, 40);

        //Draw Button
        imageLoader.ImageLoaderT();
        g2d.drawImage(imageLoader.Image, 650, 50, 50, 40, null);

        //Draw Gitter
        while(drawClock == true){
            g2d.setColor(Color.BLACK);

        if(x < 548 && y < 548){

            for(x = 50; x < 548; x = x + 83){
                g2d.drawRect(x, y, 83, 166);
            }

        }else if(x >= 548 && y < 548){

            y = y + 166;
            x = 50;

        }else if(y >= 548){

            drawClock = false;

        }
    }
}

//Zeichnung von nicht festen Bestandteilen
public void drawFeature(Graphics g2d){

    //Zeichnungen von Features

    g2d.setColor(color2);
    g2d.fillRect(549, 49, 60, 501);

    g2d.fillRect(705, 80, 100, 5);
    g2d.fillRect(700, 48, 5, 37);

    g2d.fillRect(610, 43, 200, 5);
    g2d.fillRect(605, 0, 5, 48);

    g2d.fillRoundRect(-60, -60, 100, 100, 100, 100);
    g2d.fillRoundRect(-60, 510, 100, 100, 100, 100);
    g2d.fillRoundRect(700, 460, 300, 300, 300, 300);

    g2d.fillRect(0, 0, 5, 600);
    g2d.fillRect(780, 0, 5, 600);
    g2d.fillRect(0, 556, 50, 5);
    g2d.fillRect(411, 556, 500, 5);

    g2d.setColor(color1);
    g2d.fillRect(50, 32, 500, 5);
    g2d.fillRect(550, 0, 5, 37);

}

// Felder Zeichnen in der CLock
public void drawField(Graphics g2d){

    FieldCheck fieldCheck = new FieldCheck();
    fieldCheck.getField();

    //Zeichnung von Clock Feldern
    if(fieldCheck.S1 == true){
        g2d.fillRect(466, 383, 82, 165);
    }
    if(fieldCheck.S2 == true){
        g2d.fillRect(383, 383, 82, 165);
    }
    if(fieldCheck.S4 == true){
        g2d.fillRect(300, 383, 82, 165);
    }
    if(fieldCheck.S8 == true){
        g2d.fillRect(217, 383, 82, 165);
    }
    if(fieldCheck.S16 == true){
        g2d.fillRect(134, 383, 82, 165);
    }
    if(fieldCheck.S32 == true){
        g2d.fillRect(51, 383, 82, 165);
    }

    if(fieldCheck.M1 == true){
        g2d.fillRect(466, 217, 82, 165);
    }
    if(fieldCheck.M2 == true){
        g2d.fillRect(383, 217, 82, 165);
    }
    if(fieldCheck.M4 == true){
        g2d.fillRect(300, 217, 82, 165);
    }
    if(fieldCheck.M8 == true){
        g2d.fillRect(217, 217, 82, 165);
    }
    if(fieldCheck.M16 == true){
        g2d.fillRect(134, 217, 82, 165);
    }
    if(fieldCheck.M32 == true){
        g2d.fillRect(51, 217, 82, 165);
    }

    if(fieldCheck.H1 == true){
        g2d.fillRect(466, 51, 82, 165);
    }
    if(fieldCheck.H2 == true){
        g2d.fillRect(383, 51, 82, 165);
    }
    if(fieldCheck.H4 == true){
        g2d.fillRect(300, 51, 82, 165);
    }
    if(fieldCheck.H8 == true){
        g2d.fillRect(217, 51, 82, 165);
    }
    if(fieldCheck.H16 == true){
        g2d.fillRect(134, 51, 82, 165);
    }
    if(fieldCheck.H32 == true){
        g2d.fillRect(51, 51, 82, 165);
    }
    
}

// Draw Text
public void drawText(Graphics g2d){

    Rechnung rechnung = new Rechnung();

    //Aktuelle Daten bekommen
    rechnung.RechnungT();

    g2d.setFont(new Font("Arial", Font.BOLD, 30));
    g2d.setColor(Color.BLACK);
    g2d.drawString(ClockColor+"/10", 705, 77);

    g2d.setColor(color2);
    g2d.setFont(new Font("Arial", Font.BOLD, 20));
    g2d.drawString("Binary: "+rechnung.BitZahl, 50, 30);

    g2d.setColor(Color.decode("#5f3cba"));
    g2d.drawString("Farbe Wechseln", 610, 40);

    g2d.setColor(Color.BLACK);
    g2d.setFont(new Font("Arial", Font.BOLD, 12));
    g2d.drawString("Falls sie keine Binary Uhr Lesen koennen clicken sie die Taste N ", 50, 560);
    g2d.drawString("Falls sie wissen wollen wie diese Uhr funktioniert clicken sie die Taste E ", 50, 48);

    g2d.setFont(new Font("Arial", Font.BOLD, 70));
    g2d.drawString("H", 550, 160);
    g2d.drawString("M", 550, 326);
    g2d.drawString("S", 550, 492);

    rechnung.BitZahl = "";

}


public void drawNoob(Graphics g2d){
    
    Rechnung rechnung = new Rechnung();

    //Aktuelle Daten bekommen
    rechnung.RechnungT();

    //Zeichnung von Noob Mode
    g2d.setColor(Color.LIGHT_GRAY);
    g2d.fillRect(50, 550, 361, 20);

    g2d.setFont(new Font("Arial", Font.BOLD, 20));

    g2d.setColor(color3);
    g2d.drawString("Time for Noobs: "+rechnung.FTime, 310, 30);

    g2d.setFont(new Font("Arial", Font.BOLD, 25));

    g2d.drawString("Stunden", 640, 130);
    g2d.drawString("<-----------", 640, 150);

    g2d.drawString("Minuten", 640, 296);
    g2d.drawString("<-----------", 640, 316);

    g2d.drawString("Sekunden", 640, 462);
    g2d.drawString("<-----------", 640, 482);

    g2d.setFont(new Font("Arial", Font.BOLD, 70));

    g2d.drawString("1", 486, 153);
    g2d.drawString("1", 486, 319);
    g2d.drawString("1", 486, 485);

    g2d.drawString("2", 403, 153);
    g2d.drawString("2", 403, 319);
    g2d.drawString("2", 403, 485);

    g2d.drawString("4", 320, 153);
    g2d.drawString("4", 320, 319);
    g2d.drawString("4", 320, 485);

    g2d.drawString("8", 237, 153);
    g2d.drawString("8", 237, 319);
    g2d.drawString("8", 237, 485);

    g2d.drawString("16", 134, 153);
    g2d.drawString("16", 134, 319);
    g2d.drawString("16", 134, 485);

    g2d.drawString("32", 51, 153);
    g2d.drawString("32", 51, 319);
    g2d.drawString("32", 51, 485);
}

public void drawExplain(Graphics g2d){
    
    //Explain Mode Zeichnung
    g2d.drawImage(imageLoader.Explain, 0, 0, 800, 600, null);

    g2d.setColor(Color.decode("#e1e4e6"));
    g2d.setFont(new Font("Arial", Font.BOLD, 25));
    g2d.drawString("- Die Uhrzeit wird im binänerem Zahlensystem dargestellt", 30, 50);
    g2d.drawString("- Dabei gibt es nur die 1 und 0, auch true or false genannt", 30, 100);
    g2d.drawString("- Der Wert der Kästchen, variiert durch die Stelle im System", 30, 150);
    g2d.drawString("- Das System beginnt von rechts, der erste Wert ist 1", 30, 200);
    g2d.drawString("- Der zweite Wert von rechts ist die Verdopplung vom erstem", 30, 250);
    g2d.drawString("- Der dritte Wert ist Verdopplung vom zweitem Wert usw. (4 2 1)", 30, 300);
    g2d.drawString("- Also wenn wir 1011 haben bedeutet es: 8+0+2+1 = 11", 30, 350);

}

}

