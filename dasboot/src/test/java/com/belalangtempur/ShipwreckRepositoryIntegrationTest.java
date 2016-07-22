package com.belalangtempur;

import com.belalangtempur.model.Shipwreck;
import com.belalangtempur.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

/**
 * Created by arif on 10-7-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DasBootApplication.class)
public class ShipwreckRepositoryIntegrationTest {
    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void testFindAll() {
        List<Shipwreck> wrecks = shipwreckRepository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
