import data.WrongLoginException;
import data.WrongPasswordException;
import transport.*;
import data.Data;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8", 2.5, "купэ");
        Car bmw = new Car("BMW", "M2 Competition", 3.0, "van");
        Car mercedes = new Car("Mercedes-Benz", "SLS AMG", 6.2, "minivan");
        Car ferrari = new Car("Ferrari", "250 TR", 6.6, "universal");

        Truck man = new Truck("MAN", "TGS 6x6", 11.2, "n1");
        Truck iveco = new Truck("Iveco", "Turbostar 190.48", 12.1, "n2");
        Truck daf = new Truck("DAF", "MNS-390", 10.8, "n3");
        Truck scania = new Truck("Scania", "RK-907", 11.7, "n2");

        Bus ankai = new Bus("Ankai", "S-308", 8.1, "especially small");
        Bus baw = new Bus("BAW", "JS-778", 7.2, "small");
        Bus foton = new Bus("Foton", "HR 558", 8.6, "Особо большая");
        Bus higer = new Bus("Higer", "FVN-367", 7.8, "средняя");

        Driver robbyn =new  Driver("Афанасьев Робин Евгеньевич", 5);
        robbyn.addLicense("b");
//        robbyn.setCurrentTransport(bmw);
//        robbyn.startDriving();
//        robbyn.stopDriving();
//        robbyn.refillTransport();
//        System.out.println(ankai);
//        System.out.println(baw);
//        System.out.println(foton);
//        System.out.println(higer);

        try {
            System.out.println(Data.check("abcd1_23", "qwerty123", "qwerty123"));
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }


        checkDiagnosed(audi, ankai, iveco);
    }

    public static void checkDiagnosed(Transport... transports) {
        try {
            for (Transport a : transports) {
                if (!a.getDiagnosed()) throw new RuntimeException(a.getTypeOfTransport()+" "+a.getBrand()+" "+a.getModel()+" не прошел диагностику");
            }
        } catch (CantGetDiagnosed e) {
            System.out.println(e.getTransport()+" в диагностике не требуется");
        }
    }
}