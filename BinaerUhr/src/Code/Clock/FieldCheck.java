package Clock;

import java.time.LocalDateTime;

public class FieldCheck {

    //Stunden
    public Boolean H1 = false;
    public Boolean H2 = false;
    public Boolean H4 = false;
    public Boolean H8 = false;
    public Boolean H16 = false;
    public Boolean H32 = false;

    //Minuten
    public Boolean M1 = false;
    public Boolean M2 = false;
    public Boolean M4 = false;
    public Boolean M8 = false;
    public Boolean M16 = false;
    public Boolean M32 = false;

    //Sekunden
    public Boolean S1 = false;
    public Boolean S2 = false;
    public Boolean S4 = false;
    public Boolean S8 = false;
    public Boolean S16 = false;
    public Boolean S32 = false;

    public Boolean FieldCheckDone = false;

    public void getField(){
        //Diese Methode Checkt welches Feld auf der Binary Clock Leuchten soll
        int ih = 0;
        int im = 0;
        int is = 0;
              
            //Zeit check
            LocalDateTime now = LocalDateTime.now();

            ih = now.getHour();
            im = now.getMinute();
            is = now.getSecond();

    //Wir reden einfach nicht ueber dieses System D:
    if(ih == 1){
        H1 = true;
    }else if(ih == 3){
        H1 = true;
    }else if(ih == 5){
        H1 = true;
    }else if(ih == 7){
        H1 = true;
    }else if(ih == 9){
        H1 = true;
    }else if(ih == 11){
        H1 = true;
    }else if(ih == 13){
        H1 = true;
    }else if(ih == 15){
        H1 = true;
    }else if(ih == 17){
        H1 = true;
    }else if(ih == 19){
        H1 = true;
    }else if(ih == 21){
        H1 = true;
    }else if(ih == 23){
        H1 = true;
    }else if(ih == 25){
        H1 = true;
    }else if(ih == 27){
        H1 = true;
    }else if(ih == 29){
        H1 = true;
    }else if(ih == 31){
        H1 = true;
    }else if(ih == 33){
        H1 = true;
    }else if(ih == 35){
        H1 = true;
    }else if(ih == 37){
        H1 = true;
    }else if(ih == 39){
        H1 = true;
    }else if(ih == 41){
        H1 = true;
    }else if(ih == 43){
        H1 = true;
    }else if(ih == 45){
        H1 = true;
    }else if(ih == 47){
        H1 = true;
    }else if(ih == 49){
        H1 = true;
    }else if(ih == 51){
        H1 = true;
    }else if(ih == 53){
        H1 = true;
    }else if(ih == 55){
        H1 = true;
    }else if(ih == 57){
        H1 = true;
    }else if(ih == 59){
        H1 = true;
    }
        


    if(ih == 2){
        H2 = true;
    }else if(ih == 3){
        H2 = true;
    }else if(ih == 6){
        H2 = true;
    }else if(ih == 7){
        H2 = true;
    }else if(ih == 10){
        H2 = true;
    }else if(ih == 11){
        H2 = true;
    }else if(ih == 14){
        H2 = true;
    }else if(ih == 15){
        H2 = true;
    }else if(ih == 18){
        H2 = true;
    }else if(ih == 19){
        H2 = true;
    }else if(ih == 22){
        H2 = true;
    }else if(ih == 23){
        H2 = true;
    }else if(ih == 26){
        H2 = true;
    }else if(ih == 27){
        H2 = true;
    }else if(ih == 30){
        H2 = true;
    }else if(ih == 31){
        H2 = true;
    }else if(ih == 34){
        H2 = true;
    }else if(ih == 35){
        H2 = true;
    }else if(ih == 38){
        H2 = true;
    }else if(ih == 39){
        H2 = true;
    }else if(ih == 42){
        H2 = true;
    }else if(ih == 43){
        H2 = true;
    }else if(ih == 46){
        H2 = true;
    }else if(ih == 47){
        H2 = true;
    }else if(ih == 50){
        H2 = true;
    }else if(ih == 51){
        H2 = true;
    }else if(ih == 54){
        H2 = true;
    }else if(ih == 55){
        H2 = true;
    }else if(ih >= 58){
        H2 = true;
    }

    if(ih == 4){
        H4 = true;
    }else if(ih == 5){
        H4 = true;
    }else if(ih == 6){
        H4 = true;
    }else if(ih == 7){
        H4 = true;
    }else if(ih == 12){
        H4 = true;
    }else if(ih == 13){
        H4 = true;
    }else if(ih == 14){
        H4 = true;
    }else if(ih == 15){
        H4 = true;
    }else if(ih == 20){
        H4 = true;
    }else if(ih == 21){
        H4 = true;
    }else if(ih == 22){
        H4 = true;
    }else if(ih == 23){
        H4 = true;
    }else if(ih == 28){
        H4 = true;
    }else if(ih == 29){
        H4 = true;
    }else if(ih == 30){
        H4 = true;
    }else if(ih == 31){
        H4 = true;
    }else if(ih == 36){
        H4 = true;
    }else if(ih == 37){
        H4 = true;
    }else if(ih == 38){
        H4 = true;
    }else if(ih == 39){
        H4 = true;
    }else if(ih == 44){
        H4 = true;
    }else if(ih == 45){
        H4 = true;
    }else if(ih == 46){
        H4 = true;
    }else if(ih == 47){
        H4 = true;
    }else if(ih >= 52){
        H4 = true;
    }

    if(ih == 8){
        H8 = true;
    }else if(ih == 9){
        H8 = true;
    }else if(ih == 10){
        H8 = true;
    }else if(ih == 11){
        H8 = true;
    }else if(ih == 12){
        H8 = true;
    }else if(ih == 13){
        H8 = true;
    }else if(ih == 14){
        H8 = true;
    }else if(ih == 15){
        H8 = true;
    }else if(ih == 24){
        H8 = true;
    }else if(ih == 25){
        H8 = true;
    }else if(ih == 26){
        H8 = true;
    }else if(ih == 27){
        H8 = true;
    }else if(ih == 28){
        H8 = true;
    }else if(ih == 29){
        H8 = true;
    }else if(ih == 30){
        H8 = true;
    }else if(ih == 31){
        H8 = true;
    }else if(ih == 40){
        H8 = true;
    }else if(ih == 41){
        H8 = true;
    }else if(ih == 42){
        H8 = true;
    }else if(ih == 43){
        H8 = true;
    }else if(ih == 44){
        H8 = true;
    }else if(ih == 45){
        H8 = true;
    }else if(ih == 46){
        H8 = true;
    }else if(ih == 47){
        H8 = true;
    }else if(ih >= 56){
        H8 = true;
    }

    if(ih == 16){
        H16 = true;
    }else if(ih == 17){
        H16 = true;
    }else if(ih == 18){
        H16 = true;
    }else if(ih == 19){
        H16 = true;
    }else if(ih == 20){
        H16 = true;
    }else if(ih == 21){
        H16 = true;
    }else if(ih == 22){
        H16 = true;
    }else if(ih == 23){
        H16 = true;
    }else if(ih == 24){
        H16 = true;
    }else if(ih == 25){
        H16 = true;
    }else if(ih == 26){
        H16 = true;
    }else if(ih == 27){
        H16 = true;
    }else if(ih == 28){
        H16 = true;
    }else if(ih == 29){
        H16 = true;
    }else if(ih == 30){
        H16 = true;
    }else if(ih == 31){
        H16 = true;
    }else if(ih >= 48){
        H16 = true;
    }

    if(ih >= 32){
        H32 = true;
    }



    if(im == 1){
        M1 = true;
    }else if(im == 3){
        M1 = true;
    }else if(im == 5){
        M1 = true;
    }else if(im == 7){
        M1 = true;
    }else if(im == 9){
        M1 = true;
    }else if(im == 11){
        M1 = true;
    }else if(im == 13){
        M1 = true;
    }else if(im == 15){
        M1 = true;
    }else if(im == 17){
        M1 = true;
    }else if(im == 19){
        M1 = true;
    }else if(im == 21){
        M1 = true;
    }else if(im == 23){
        M1 = true;
    }else if(im == 25){
        M1 = true;
    }else if(im == 27){
        M1 = true;
    }else if(im == 29){
        M1 = true;
    }else if(im == 31){
        M1 = true;
    }else if(im == 33){
        M1 = true;
    }else if(im == 35){
        M1 = true;
    }else if(im == 37){
        M1 = true;
    }else if(im == 39){
        M1 = true;
    }else if(im == 41){
        M1 = true;
    }else if(im == 43){
        M1 = true;
    }else if(im == 45){
        M1 = true;
    }else if(im == 47){
        M1 = true;
    }else if(im == 49){
        M1 = true;
    }else if(im == 51){
        M1 = true;
    }else if(im == 53){
        M1 = true;
    }else if(im == 55){
        M1 = true;
    }else if(im == 57){
        M1 = true;
    }else if(im == 59){
        M1 = true;
    }
        


    if(im == 2){
        M2 = true;
    }else if(im == 3){
        M2 = true;
    }else if(im == 6){
        M2 = true;
    }else if(im == 7){
        M2 = true;
    }else if(im == 10){
        M2 = true;
    }else if(im == 11){
        M2 = true;
    }else if(im == 14){
        M2 = true;
    }else if(im == 15){
        M2 = true;
    }else if(im == 18){
        M2 = true;
    }else if(im == 19){
        M2 = true;
    }else if(im == 22){
        M2 = true;
    }else if(im == 23){
        M2 = true;
    }else if(im == 26){
        M2 = true;
    }else if(im == 27){
        M2 = true;
    }else if(im == 30){
        M2 = true;
    }else if(im == 31){
        M2 = true;
    }else if(im == 34){
        M2 = true;
    }else if(im == 35){
        M2 = true;
    }else if(im == 38){
        M2 = true;
    }else if(im == 39){
        M2 = true;
    }else if(im == 42){
        M2 = true;
    }else if(im == 43){
        M2 = true;
    }else if(im == 46){
        M2 = true;
    }else if(im == 47){
        M2 = true;
    }else if(im == 50){
        M2 = true;
    }else if(im == 51){
        M2 = true;
    }else if(im == 54){
        M2 = true;
    }else if(im == 55){
        M2 = true;
    }else if(im >= 58){
        M2 = true;
    }

    if(im == 4){
        M4 = true;
    }else if(im == 5){
        M4 = true;
    }else if(im == 6){
        M4 = true;
    }else if(im == 7){
        M4 = true;
    }else if(im == 12){
        M4 = true;
    }else if(im == 13){
        M4 = true;
    }else if(im == 14){
        M4 = true;
    }else if(im == 15){
        M4 = true;
    }else if(im == 20){
        M4 = true;
    }else if(im == 21){
        M4 = true;
    }else if(im == 22){
        M4 = true;
    }else if(im == 23){
        M4 = true;
    }else if(im == 28){
        M4 = true;
    }else if(im == 29){
        M4 = true;
    }else if(im == 30){
        M4 = true;
    }else if(im == 31){
        M4 = true;
    }else if(im == 36){
        M4 = true;
    }else if(im == 37){
        M4 = true;
    }else if(im == 38){
        M4 = true;
    }else if(im == 39){
        M4 = true;
    }else if(im == 44){
        M4 = true;
    }else if(im == 45){
        M4 = true;
    }else if(im == 46){
        M4 = true;
    }else if(im == 47){
        M4 = true;
    }else if(im >= 52){
        M4 = true;
    }

    if(im == 8){
        M8 = true;
    }else if(im == 9){
        M8 = true;
    }else if(im == 10){
        M8 = true;
    }else if(im == 11){
        M8 = true;
    }else if(im == 12){
        M8 = true;
    }else if(im == 13){
        M8 = true;
    }else if(im == 14){
        M8 = true;
    }else if(im == 15){
        M8 = true;
    }else if(im == 24){
        M8 = true;
    }else if(im == 25){
        M8 = true;
    }else if(im == 26){
        M8 = true;
    }else if(im == 27){
        M8 = true;
    }else if(im == 28){
        M8 = true;
    }else if(im == 29){
        M8 = true;
    }else if(im == 30){
        M8 = true;
    }else if(im == 31){
        M8 = true;
    }else if(im == 40){
        M8 = true;
    }else if(im == 41){
        M8 = true;
    }else if(im == 42){
        M8 = true;
    }else if(im == 43){
        M8 = true;
    }else if(im == 44){
        M8 = true;
    }else if(im == 45){
        M8 = true;
    }else if(im == 46){
        M8 = true;
    }else if(im == 47){
        M8 = true;
    }else if(im >= 56){
        M8 = true;
    }

    if(im == 16){
        M16 = true;
    }else if(im == 17){
        M16 = true;
    }else if(im == 18){
        M16 = true;
    }else if(im == 19){
        M16 = true;
    }else if(im == 20){
        M16 = true;
    }else if(im == 21){
        M16 = true;
    }else if(im == 22){
        M16 = true;
    }else if(im == 23){
        M16 = true;
    }else if(im == 24){
        M16 = true;
    }else if(im == 25){
        M16 = true;
    }else if(im == 26){
        M16 = true;
    }else if(im == 27){
        M16 = true;
    }else if(im == 28){
        M16 = true;
    }else if(im == 29){
        M16 = true;
    }else if(im == 30){
        M16 = true;
    }else if(im == 31){
        M16 = true;
    }else if(im >= 48){
        M16 = true;
    }

    if(im >= 32){
        M32 = true;
    }




    if(is == 1){
        S1 = true;
    }else if(is == 3){
        S1 = true;
    }else if(is == 5){
        S1 = true;
    }else if(is == 7){
        S1 = true;
    }else if(is == 9){
        S1 = true;
    }else if(is == 11){
        S1 = true;
    }else if(is == 13){
        S1 = true;
    }else if(is == 15){
        S1 = true;
    }else if(is == 17){
        S1 = true;
    }else if(is == 19){
        S1 = true;
    }else if(is == 21){
        S1 = true;
    }else if(is == 23){
        S1 = true;
    }else if(is == 25){
        S1 = true;
    }else if(is == 27){
        S1 = true;
    }else if(is == 29){
        S1 = true;
    }else if(is == 31){
        S1 = true;
    }else if(is == 33){
        S1 = true;
    }else if(is == 35){
        S1 = true;
    }else if(is == 37){
        S1 = true;
    }else if(is == 39){
        S1 = true;
    }else if(is == 41){
        S1 = true;
    }else if(is == 43){
        S1 = true;
    }else if(is == 45){
        S1 = true;
    }else if(is == 47){
        S1 = true;
    }else if(is == 49){
        S1 = true;
    }else if(is == 51){
        S1 = true;
    }else if(is == 53){
        S1 = true;
    }else if(is == 55){
        S1 = true;
    }else if(is == 57){
        S1 = true;
    }else if(is == 59){
        S1 = true;
    }
        


    if(is == 2){
        S2 = true;
    }else if(is == 3){
        S2 = true;
    }else if(is == 6){
        S2 = true;
    }else if(is == 7){
        S2 = true;
    }else if(is == 10){
        S2 = true;
    }else if(is == 11){
        S2 = true;
    }else if(is == 14){
        S2 = true;
    }else if(is == 15){
        S2 = true;
    }else if(is == 18){
        S2 = true;
    }else if(is == 19){
        S2 = true;
    }else if(is == 22){
        S2 = true;
    }else if(is == 23){
        S2 = true;
    }else if(is == 26){
        S2 = true;
    }else if(is == 27){
        S2 = true;
    }else if(is == 30){
        S2 = true;
    }else if(is == 31){
        S2 = true;
    }else if(is == 34){
        S2 = true;
    }else if(is == 35){
        S2 = true;
    }else if(is == 38){
        S2 = true;
    }else if(is == 39){
        S2 = true;
    }else if(is == 42){
        S2 = true;
    }else if(is == 43){
        S2 = true;
    }else if(is == 46){
        S2 = true;
    }else if(is == 47){
        S2 = true;
    }else if(is == 50){
        S2 = true;
    }else if(is == 51){
        S2 = true;
    }else if(is == 54){
        S2 = true;
    }else if(is == 55){
        S2 = true;
    }else if(is >= 58){
        S2 = true;
    }

    if(is == 4){
        S4 = true;
    }else if(is == 5){
        S4 = true;
    }else if(is == 6){
        S4 = true;
    }else if(is == 7){
        S4 = true;
    }else if(is == 12){
        S4 = true;
    }else if(is == 13){
        S4 = true;
    }else if(is == 14){
        S4 = true;
    }else if(is == 15){
        S4 = true;
    }else if(is == 20){
        S4 = true;
    }else if(is == 21){
        S4 = true;
    }else if(is == 22){
        S4 = true;
    }else if(is == 23){
        S4 = true;
    }else if(is == 28){
        S4 = true;
    }else if(is == 29){
        S4 = true;
    }else if(is == 30){
        S4 = true;
    }else if(is == 31){
        S4 = true;
    }else if(is == 36){
        S4 = true;
    }else if(is == 37){
        S4 = true;
    }else if(is == 38){
        S4 = true;
    }else if(is == 39){
        S4 = true;
    }else if(is == 44){
        S4 = true;
    }else if(is == 45){
        S4 = true;
    }else if(is == 46){
        S4 = true;
    }else if(is == 47){
        S4 = true;
    }else if(is >= 52){
        S4 = true;
    }

    if(is == 8){
        S8 = true;
    }else if(is == 9){
        S8 = true;
    }else if(is == 10){
        S8 = true;
    }else if(is == 11){
        S8 = true;
    }else if(is == 12){
        S8 = true;
    }else if(is == 13){
        S8 = true;
    }else if(is == 14){
        S8 = true;
    }else if(is == 15){
        S8 = true;
    }else if(is == 24){
        S8 = true;
    }else if(is == 25){
        S8 = true;
    }else if(is == 26){
        S8 = true;
    }else if(is == 27){
        S8 = true;
    }else if(is == 28){
        S8 = true;
    }else if(is == 29){
        S8 = true;
    }else if(is == 30){
        S8 = true;
    }else if(is == 31){
        S8 = true;
    }else if(is == 40){
        S8 = true;
    }else if(is == 41){
        S8 = true;
    }else if(is == 42){
        S8 = true;
    }else if(is == 43){
        S8 = true;
    }else if(is == 44){
        S8 = true;
    }else if(is == 45){
        S8 = true;
    }else if(is == 46){
        S8 = true;
    }else if(is == 47){
        S8 = true;
    }else if(is >= 56){
        S8 = true;
    }

    if(is == 16){
        S16 = true;
    }else if(is == 17){
        S16 = true;
    }else if(is == 18){
        S16 = true;
    }else if(is == 19){
        S16 = true;
    }else if(is == 20){
        S16 = true;
    }else if(is == 21){
        S16 = true;
    }else if(is == 22){
        S16 = true;
    }else if(is == 23){
        S16 = true;
    }else if(is == 24){
        S16 = true;
    }else if(is == 25){
        S16 = true;
    }else if(is == 26){
        S16 = true;
    }else if(is == 27){
        S16 = true;
    }else if(is == 28){
        S16 = true;
    }else if(is == 29){
        S16 = true;
    }else if(is == 30){
        S16 = true;
    }else if(is == 31){
        S16 = true;
    }else if(is >= 48){
        S16 = true;
    }

    if(is >= 32){
        S32 = true;
    }

    FieldCheckDone = true;
    }
}
