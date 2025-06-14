/* You are developing a media player application. There is a base class called MediaPlayer, which has methods like play(), pause(), 
and stop(). The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() and fastForward(). Additionally, there is an 
interface called Playlist, which defines methods like addSong() and removeSong(). The VideoPlayer class implements the Playlist interface. 
Implement the classes and demonstrate inheritance with interface by creating objects of the VideoPlayer class and calling its methods as well 
as the interface methods. */

package Task5;

interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Pausing media...");
    }

    void stop() {
        System.out.println("Stopping media...");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist{
    public void rewind() {
        System.out.println("Rewinding video...");
    }

    public void fastForward() {
        System.out.println("Fast forwarding video...");
    }

    @Override
    public void addSong(String song) {
        System.out.println("Added song: " + song);
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removed song: " + song);
    }
}
public class MediaTest {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        player.play();
        player.pause();
        player.stop();
        player.rewind();
        player.fastForward();
        player.addSong("Track 1");
        player.removeSong("Track 1");
    }
}
