package Springbootthymeleaf.Dynamic.Modals.Repository;

import Springbootthymeleaf.Dynamic.Modals.Enteties.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
