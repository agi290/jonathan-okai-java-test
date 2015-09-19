package api;

import javax.persistence.EntityManager;

@Inject
    private EntityManager em;

public CarsRepository {


 Cars update(Cars car) {

        em.merge(car);
        
        return car;
    }
}
