package org.craftedsw.tripservicekata.trip;

// import static org.junit.Assert.*;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TripServiceTest {
	@Test public void
    should_throw_when_not_logged_in(){
        TripService tripService = new TripService();    
        
        Assertions.assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(null));
    }
}
