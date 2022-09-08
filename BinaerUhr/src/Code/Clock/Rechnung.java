package Clock;

import java.time.LocalDateTime;

import Gui.Gui;

public class Rechnung {

    public String BitZahl = "";

    long bitZahl = 0;
    public String FTime;

    FieldCheck fieldCheck = new FieldCheck();
    
    public void firstRechnung(){
        //Erstes Ausfuehren von Rechnung bevor loop
        Gui gui = new Gui();
        
        RechnungT();
        gui.update();
    }
    public void RechnungT(){

            //Aktuelle Zeit bekommen
            LocalDateTime now = LocalDateTime.now();

            int hour = now.getHour();
            String h = (hour > 9) ? Integer.toString(hour) : "0" + Integer.toString(hour);
              
            int minute = now.getMinute();
            String m = (minute > 9) ? Integer.toString(minute) : "0" + Integer.toString(minute);
              
            int second = now.getSecond();
            String s = (second > 9) ? Integer.toString(second) : "0" + Integer.toString(second);

            FTime = h +":"+ m +":"+ s;

            //Aktuelle Zeit in Sekunden umwandeln
            long HTime = now.getHour() * 60;
            HTime = HTime * 60;

            long MTime = now.getMinute() * 60;

            long Time = now.getSecond() + MTime + HTime;
        
            bitZahl = Time;

            //Check welches Feld in Binary Uhr an sein soll
            fieldCheck.getField();

            //Sekunden in Binary umwandeln
            UmRechnung();
    }

public void UmRechnung(){
    //Sekunden in Binary umwandeln
    long fakeBitZahl = 0;
    fakeBitZahl = bitZahl;
    while(fakeBitZahl != 0){
    BitZahl = fakeBitZahl % 2 + BitZahl;
    fakeBitZahl = fakeBitZahl / 2;
}
        
}

}
