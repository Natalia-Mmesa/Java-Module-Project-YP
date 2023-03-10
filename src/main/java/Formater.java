public class Formater {

    public static String Formater (double itog1){

        int itog2 = (int) itog1;

        if ( itog2 %10 ==1){
            return "рубль";
        } else if (itog2 %10==2 || itog2 %10 == 3 || itog2 %10 ==4) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
