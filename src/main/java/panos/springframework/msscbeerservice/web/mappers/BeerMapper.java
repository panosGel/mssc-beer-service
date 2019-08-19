package panos.springframework.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import panos.springframework.msscbeerservice.domain.Beer;
import panos.springframework.msscbeerservice.web.model.BeerDto;

@Mapper(uses = { DateMapper.class })
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
