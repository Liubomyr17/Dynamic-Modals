package Springbootthymeleaf.Dynamic.Modals;

import Springbootthymeleaf.Dynamic.Modals.Enteties.Country;
import Springbootthymeleaf.Dynamic.Modals.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class DynamicModalsApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DynamicModalsApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
        countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("Ukraine", "Kyiv"));
		countryRepository.save(new Country("Slovakia", "Bratislava"));
		countryRepository.save(new Country("Germany", "Berlin"));
		countryRepository.save(new Country("England", "London"));
		countryRepository.save(new Country("Sweden", "Stockholm"));
		countryRepository.save(new Country("Finland", "Helsinki"));
		countryRepository.save(new Country("Norway", "Oslo"));
		countryRepository.save(new Country("Denmark", "Copenhagen"));
		countryRepository.save(new Country("France", "Paris"));
		countryRepository.save(new Country("Spain", "Madrid"));
		countryRepository.save(new Country("Italy", "Rome"));
		countryRepository.save(new Country("Bulgaria", "Sofia"));
		countryRepository.save(new Country("Turkey", "Ankara"));
	}
}

