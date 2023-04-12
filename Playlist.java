import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Hold My Liquor");
    desertIslandPlaylist.add("Slippin");
    desertIslandPlaylist.add("The Art of Peer Pressure");
    desertIslandPlaylist.add("Christopher Walking"); 
    desertIslandPlaylist.add("Gatti");
    desertIslandPlaylist.add("Dior");

    desertIslandPlaylist.remove(1);

    System.out.println(desertIslandPlaylist.indexOf("The Art of Peer Pressure"));
    System.out.println(desertIslandPlaylist.indexOf("Dior"));

    String tempA = "The Art of Peer Pressure";
    desertIslandPlaylist.set(1, "Dior");

    desertIslandPlaylist.set(4, tempA);

    System.out.println(desertIslandPlaylist);

    System.out.println(desertIslandPlaylist.size());

    
  }
  
}
