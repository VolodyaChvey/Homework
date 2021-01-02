package src.com.lambda;

interface Group {
    String bestAlbum();
}

public class Chag {
    public static void main(String[] args) {
        Group pinkFloyd = new Group() {
            @Override
            public String bestAlbum() {
                return "Wish You Were Here";
            }
        };
        String album = pinkFloyd.bestAlbum();
        System.out.println(album);
        showGroup(new Group() {
            @Override
            public String bestAlbum() {
                return "A Night At The Opera";
            }
        });
    }

    public static void showGroup(Group group) {
        System.out.println(group.bestAlbum());
    }
}
