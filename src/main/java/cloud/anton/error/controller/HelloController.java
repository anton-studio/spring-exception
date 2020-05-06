package cloud.anton.error.controller;

import cloud.anton.error.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static cloud.anton.error.core.enumeration.SystemEvent.CALCULATION_EROOR;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHomeActivity() {
        throw new NotFoundException(CALCULATION_EROOR);
    }

}
