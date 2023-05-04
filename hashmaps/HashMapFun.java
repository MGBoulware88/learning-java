import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    //add songs to the map with K, V as title, lyrics
    public static String addASong(HashMap<String, String> hashMap, String title, String lyrics) {
        //check if key exists first --only add if false
        if (hashMap.containsKey(title)) {
            return "That song is already here!";
        } else {
            hashMap.put(title, lyrics);
            return "Added " + title + "!";
        }
    }
    //grab a song by key
    public static String getSongLyricsByTitle(HashMap<String, String> hashMap, String title) {
        String foundSong = "";
        if (hashMap.containsKey(title)) {
            foundSong = hashMap.get(title);
            return foundSong;
        }
        return "Song not found";
    }
    //print all songs as title: lyrics
    public static void showAllSongs(HashMap<String, String> hashMap) {
        //use keySet to set the keys into a Set obj
        Set<String> titles = hashMap.keySet();
        //now loop through the keys to get Title: Lyrics
        for (String title : titles) {
            System.out.println(title + ": " + hashMap.get(title));
        }
    }
}
