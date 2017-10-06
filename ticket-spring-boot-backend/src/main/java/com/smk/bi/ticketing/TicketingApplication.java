package com.smk.bi.ticketing;
import com.smk.bi.ticketing.repository.CityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TicketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository){
		return (args) -> {
			 Customer customer = new Customer();
			customer.setName("digo");
			customer.setIdentifyNumber(72818272);
			customer.setCustomerAddres("jalan diponegor");
			customer.setCustomerEmail("digo@gmail");
			customer.setCostumerPhone("08182828282");
			customerRepository.save(customer);
		};
	}
@Bean
	public CommandLineRunner demo2(CityRepository cityRepository) {
		return (args) -> {
			City city = new City();
			city.setCityName("Bandung");
			city.setValid("a");
			cityRepository.save(city);
		};
	}
	@Bean
	public CommandLineRunner demo4(UserRepository userRepository) {
		return (args) -> {
			User user = new User();
			user.setUserId("Bandung");
			user.setPassword("12342");
			user.setCustomerId(2L);
			userRepository.save(user);
		};
	}*/
}

