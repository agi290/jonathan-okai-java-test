package api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

private AtomicLong count = new AtomicLong();
private CarsService service;

@RequestMapping("/cars")
public Cars cars(@RequestParam(value="make", defaultValue="ford") String make, String model, int year, Date enrtyDate){
return new Cars(count.incrementAndGet(), make, model, year, enrtyDate);

}


@RequestMapping( method = RequestMethod.POST )
   @ResponseStatus( HttpStatus.CREATED )
   @ResponseBody
   public Long create( @RequestBody Cars car ){
      Preconditions.checkNotNull( resource );
      return service.create( car );
   }

 public void update( @PathVariable( "id" ) Long id, @RequestBody Foo resource ){

      service.update( car );
   }

@RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
   @ResponseStatus( HttpStatus.OK )
   public void delete( @PathVariable( "id" ) Long id ){
      service.deleteById( id );
   }
}
