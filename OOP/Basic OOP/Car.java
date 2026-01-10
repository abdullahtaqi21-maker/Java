public class Car {
    final int maxSpeed = 200;
    int currentSpeed;

    void setSpeed(int speed) {
        if (speed > maxSpeed) {
            currentSpeed = maxSpeed;
        } else {
            currentSpeed = speed;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(250);
        System.out.println("   SPEED   ");
        System.out.println("==> " + myCar.currentSpeed + " <==");
    }
}