package dkit.oop;

import java.util.Comparator;

public class CarWithinMakeComparator  implements Comparator<Car> {

    public int compare(Car car1, Car car2) {
        if (car1.getMake().equals(car2.getMake()))
            return Integer.compare(car1.getYear(), car2.getYear());
        else {
            return car1.getMake().compareTo(car2.getMake());
        }

    }
}
