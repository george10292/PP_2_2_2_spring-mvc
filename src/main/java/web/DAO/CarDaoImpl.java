package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1L, "Manufacturer1", "Series1"));
        cars.add(new Car(2L, "Manufacturer2", "Series2"));
        cars.add(new Car(3L, "Manufacturer3", "Series3"));
        cars.add(new Car(4L, "Manufacturer4", "Series4"));
        cars.add(new Car(5L, "Manufacturer5", "Series5"));
    }

    @Override
    public List<Car> allCars(Integer count) {
        if (count == null || count > cars.size()) {
            return cars;
        } else {
            List<Car> countCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                countCars.add(cars.get(i));
            }
            return countCars;
        }
    }
}
