class Wheel {
    // Wheel implementation
}

class Car {
    private Wheel wheel;

    public Car() {
        // The Car class controls the creation of Wheel objects.
        this.wheel = new Wheel();
    }
}
