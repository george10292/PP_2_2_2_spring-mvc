package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> allCars(Integer count) {
        return carDao.allCars(count);
    }
}
