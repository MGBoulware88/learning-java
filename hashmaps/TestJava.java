import java.util.HashMap;

public class TestJava {
    public static void main(String[] args) {
        HashMap<String, String> songListMap = new HashMap<String, String>();
        String songTitle1 = "Song Number 1";
        String songTitle2 = "Song Number 2";
        String songTitle3 = "Song Number 3";
        String songTitle4 = "Song Number 4";
        String songLyrics1 = "Song Lyrics 1";
        String songLyrics2 = "Song Lyrics 2";
        String songLyrics3 = "Song Lyrics 3";
        String songLyrics4 = "Song Lyrics 4";

        //create the song list
        HashMapFun.addASong(songListMap, songTitle1, songLyrics1);
        HashMapFun.addASong(songListMap, songTitle2, songLyrics2);
        HashMapFun.addASong(songListMap, songTitle3, songLyrics3);
        HashMapFun.addASong(songListMap, songTitle4, songLyrics4);

        //pull out a song by its title
        HashMapFun.getSongLyricsByTitle(songListMap, songTitle4);

        //print out all of the songs
        HashMapFun.showAllSongs(songListMap);
    }
}