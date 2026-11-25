abstract class Appliance {

    abstract void turnOn();

    void plugIn() {
        System.out.println(
            "Appliance is connected to the power source."
        );
    }
}

class Fan extends Appliance {

    void turnOn() {
        System.out.println("The fan is spinning.");
    }

    public static void main(String[] args) {
        Fan f = new Fan();

        f.plugIn();
        f.turnOn();
    }
}
