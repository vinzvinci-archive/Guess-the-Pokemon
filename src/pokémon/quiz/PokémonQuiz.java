
package pokémon.quiz;

public class PokémonQuiz {

    public static void main(String[] args) {
        Progressbar run = new Progressbar();
        run.setVisible(true);
        try {
            for (int v=0; v<=100; v++){
                Thread.sleep(80);
                Progressbar.progbar.setValue(v);
                if (v==100) {
            Start_Game me = new Start_Game();
            me.setVisible(true);
            run.setVisible(false);
            }
            }
        }catch (Exception e) {
            e.printStackTrace();
    }
    }
    
}
