public class ArrayMediaLib {

    public static void main(String args[]){

        String[] sharingFriends = {"Jamal",
                "Emily",
                "Destiny",
                "Mateo",
                "Sofia"
        };
        for (int i = 0; 1< sharingFriends.length; ++i){
            System.out.println(sharingFriends[i]);
        }

        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int val: daysBtwnPurchase) {
            total = total + val;
        }

        Song[] topTenSongs = {new Song(),
                new Song("The Twist"),
                new Song("Smooth"),
                new Song("Mack the Knife"),
                new Song("How do I live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("I Gotta Feeling"),
                new Song("Macroens"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")
        };
        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }
        System.out.println("-BEDORE-");
        for (Song changSong : topTenSongs){
            changSong.setTitle("Test");
        }
        System.out.println("-AFTER-");
        for (Song showSong : topTenSongs){
            System.out.println(showSong.getTitle());
        }
    }
}
