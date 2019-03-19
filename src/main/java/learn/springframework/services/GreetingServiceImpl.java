package learn.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String SAY_HELLO = "Hello Spring Developers";

	@Override
	public String sayGreeting() {
		return SAY_HELLO;
	}

}
