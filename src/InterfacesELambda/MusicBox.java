package InterfacesELambda;

public  class MusicBox implements  MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("A music box está tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A music box  está pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A music box  está parando a música");
    }

}
