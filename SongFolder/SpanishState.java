package SongFolder;
import java.io.FileReader;
import java.util.ArrayList;

public class SpanishState {
    

    public SpanishState(MusicBox box){
        super(box);
    }
    
     public void pressHappyButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("Happy.txt");
        box.playSong("Happy", lyrics);
    }


    public void pressStarButton() {
        ArrayList<String> lyrics = FileReader.getLyrics("TwinkleTwinkle.txt");
        box.playSong("Twinkle Twinkle", lyrics);
    }
    
    public void pressEnglishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-english.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Already in English!");
    }

    public void pressFrenchButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Switched to French!");
    }


    public void pressSpanishButton(){
        ArrayList<String> lyrics = FileReader.getLyrics("twinkle-french.txt");
        box.playSong("Twinkle Twinkle", lyrics);
        System.out.println("Switched to Spanish!");
    }
}
