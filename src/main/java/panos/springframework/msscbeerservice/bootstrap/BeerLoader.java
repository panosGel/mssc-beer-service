package panos.springframework.msscbeerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import panos.springframework.msscbeerservice.domain.Beer;
import panos.springframework.msscbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("PUNK IPA")
                    .beerStyle("IPA")
                    .quantityToBrew(20)
                    .upc(33700000100001L)
                    .price(new BigDecimal("2.65"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(337010000002L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }
    }
}
