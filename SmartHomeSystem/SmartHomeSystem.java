class Device {
    String deviceName;

    Device(String deviceName) {
        this.deviceName = deviceName;
    }

    void operate() {
        System.out.println("Operating device");
    }
}

class Light extends Device {
    Light(String deviceName) {
        super(deviceName);
    }

    @Override
    void operate() {
        System.out.println(deviceName + " light turned on");
    }
}

class Thermostat extends Device {
    Thermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    void operate() {
        System.out.println(deviceName + " temperature set");
    }
}

class SecurityCamera extends Device {
    SecurityCamera(String deviceName) {
        super(deviceName);
    }

    @Override
    void operate() {
        System.out.println(deviceName + " recording started");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Device[] devices = {
                new Light("Bedroom"),
                new Thermostat("Living Room"),
                new SecurityCamera("Main Gate")
        };

        for(Device d : devices) {
            d.operate();
        }
    }
}