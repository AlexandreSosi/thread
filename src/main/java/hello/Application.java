package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {

		long result  = 0;
		result = count(result, true);
		return "Hello Docker World" + result;


	}

	private static long count(long result, boolean desc) {
		for (long i = 0; i < 100000; i++) {
			if (desc)
				count(i, false);

			result = i;
		}
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
