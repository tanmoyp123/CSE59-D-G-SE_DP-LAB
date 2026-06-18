class Sensor{
    string name;
    int batteryLevel;
     Sensor(String sensorName) {
        name = sensorName;
        batteryLevel = 0;
        
        
}
      void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
      }
}
public class Main{
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperature Sensor");
sensor.charge();
        System.out.println("Battery Level = " + sensor.batteryLevel);
    }
}
