package api;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

private AtomicLong count = new AtomicLong();

@RequestMapping("/cars")
public Cars cars(){
return new Cars(count.incrementAndGet());
}
}
