package classwork;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {
    public static void main(String[] args) {

    Bird eagle=new Eagle();
    Bird duck=new Duck();
    Bird rubDuck=new RubberDuck();

//        eagle.sound();
//        duck.sound();

        Bird [] birds=new Bird[3];
        birds[0]=eagle;
        birds[1]=duck;
        birds[2]=rubDuck;

        for (Bird bird : birds) {
            bird.sound();
        }


        //интерфейс задает поведение
        CreateEggs pinguin=new Penguin();//имплеиентирубт поведение откладывать яйца
        CreateEggs ducks=new Duck();
       // CreateEggs eag=new Eagle();//интерфейса нести яйцау орла нет

        CreateEggs[]mass=new CreateEggs[2];
        mass[0]=pinguin;
        mass[1]=ducks;

        for(CreateEggs mas:mass){
            mas.createEggs();
        }






    }




}
