package CurrencyConvertor;


	import java.util.concurrent.atomic.AtomicLong;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class PLZtoINRController {

	    private final AtomicLong counter = new AtomicLong();
	    double rate = 17.5;
	    @RequestMapping("/PLNtoINR")
	    public PLZtoINR PLZtoINR(@RequestParam(value="PLN", defaultValue="1") double PLZ) {
	        return new PLZtoINR(counter.incrementAndGet(),
	                            PLZ,
	                            PLZ * rate);
	    }
	    @RequestMapping("/INRtoPLN")
	    public INRtoPLZ INRtoPLZ(@RequestParam(value="INR", defaultValue="17.5") double INR) {
	        return new INRtoPLZ(counter.incrementAndGet(),
	                            INR,
	                            INR / rate);
	    }
	    }