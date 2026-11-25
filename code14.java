interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar strings.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Pressing the piano keys.");
    }
}

class Main2 {
    public static void main(String[] args) {

        Playable p1 = new Guitar();
        Playable p2 = new Piano();

        p1.play();
        p2.play();
    }
}
