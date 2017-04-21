package service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")

public class ServiceController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Employee getEmployee(
    		@RequestParam(value="id", required=false, defaultValue="1") String name) {
        return new Employee(
        		counter.incrementAndGet(),"firstName", "firstName","firstName", "firstName",
        		"firstName","firstName","firstName","firstName","firstName","firstName",5,
        		"firstName","firstName", 4,"firstName", "firstName", "firstName","firstName");
    }
	
}
