package api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

private AtomicLong count = new AtomicLong();

@RequestMapping("/cars")
public Cars cars(@RequestParam(value="make", defaultValue="ford") String make, String model, int year, Date enrtyDate){
return new Cars(count.incrementAndGet(), make, model, year, enrtyDate);

}
@RequestMapping( method = RequestMethod.POST )
   @ResponseStatus( HttpStatus.CREATED )
   @ResponseBody
   public String create(Cars car){

      return service.create(car);
   }

}
