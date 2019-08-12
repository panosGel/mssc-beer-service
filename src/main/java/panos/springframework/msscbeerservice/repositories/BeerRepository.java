package panos.springframework.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import panos.springframework.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
