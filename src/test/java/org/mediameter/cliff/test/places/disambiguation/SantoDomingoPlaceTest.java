package org.mediameter.cliff.test.places.disambiguation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mediameter.cliff.ParseManager;
import org.mediameter.cliff.extractor.ExtractedEntities;
import org.mediameter.cliff.test.util.TestPlaces;

public class SantoDomingoPlaceTest {
    
    @Test
    public void testSantoDomingo() throws Exception{
        ExtractedEntities entities = ParseManager.extractAndResolve("This is about the Santo Domingo.");
        assertEquals("Found "+entities.getResolvedLocations().size()+" places, should have been 1!",1,entities.getResolvedLocations().size());
        assertEquals("Found "+entities.getResolvedPeople().size()+" people, should have been 0!",0,entities.getResolvedPeople().size());
        assertEquals(TestPlaces.COUNTRY_DOMINICAN_REPUBLIC,entities.getResolvedLocations().get(0).getGeoname().getGeonameID());
    }

}
