import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlayList = new ArrayList<String>();

        desertIslandPlayList.add("Sneaker Pimps - Six Underground");
        desertIslandPlayList.add("A Tribe Called Quest - Electric Relaxation");
        desertIslandPlayList.add("Buena Vista Social Club - Murmullo");
        desertIslandPlayList.add("Little Dragon - Blinking Pigs");
        desertIslandPlayList.add("MF DOOM - Guinnesses");
        desertIslandPlayList.add("Radiohead - Idioteque");
        desertIslandPlayList.add("Erykah Badu - Drama");
        desertIslandPlayList.add("Gramatik - Good Evening Mr. Hitchcock");
        desertIslandPlayList.add("Jean Grae - Threats");
        desertIslandPlayList.add("The Modern Jazz Quartet - Django");

        desertIslandPlayList.remove("The Modern Jazz Quartet - Django");
        desertIslandPlayList.remove("Erykah Badu - Drama");
        desertIslandPlayList.remove("MF DOOM - Guinnesses");
        desertIslandPlayList.remove("Jean Grae - Threats");
        desertIslandPlayList.remove("Little Dragon - Blinking Pigs");

        // Get the indices of the songs you want to swap.
        int indexA = desertIslandPlayList.indexOf("Buena Vista Social Club - Murmullo");
        int indexB = desertIslandPlayList.indexOf("A Tribe Called Quest - Electric Relaxation");

        // Create a temporary variable to store the value of song a. (We’ll call the
        // songs a and b here.)
        String tempA = "Buena Vista Social Club - Murmullo";

        // Rewrite the value at the index of a to the value of b.
        desertIslandPlayList.set(indexA, "A Tribe Called Quest - Electric Relaxation");

        // Rewrite the value at the index of b to the value of the temporary variable.

        desertIslandPlayList.set(indexB, tempA);

        System.out.println(desertIslandPlayList.size());
        System.out.println(desertIslandPlayList);

    }

}