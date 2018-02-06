package homework;

/**
 * Created by java on 06.02.2018.
 */
public class Laincher {

     
        public static void main(String[] args) {


            Instrument i = new Instrument();
            Fluite flute = new Fluite();
            Guita guita=new Guita();

            Musician m = new Musician();

            m.play(flute);
            m.play(new Guita());


        }

    }




        







