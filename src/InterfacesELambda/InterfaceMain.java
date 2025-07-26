package InterfacesELambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class InterfaceMain {
    public static void main(String[] args){
        List<User> users = List.of(new User("Maria", 21), new User("João", 32),
                new User("Eduardo" ,40), new User("Anne", 19));
        printStringValue(Record::toString, users);

//        MusicPlayer musicPlayer = new Computer();
//        runMusic(musicPlayer);
//        runVideo((VideoPlayer) musicPlayer);
    }
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }


//    public static void runVideo(VideoPlayer videoPlayer){
//        videoPlayer.playVideo();
//    }
//    public static void runMusic(MusicPlayer musicPlayer){
//        musicPlayer.playMusic();
//    }
}
