package org.craftedsw.tripservicekata.trip;

import static org.junit.Assert.*;
import org.junit.Test;


public class TripServiceTest {
	@Test(expected = UserNotLoggedInException.class) public void
    should_throw_when_not_logged_in(){
        TripService tripService = new TripService();    
        
        tripService.getTripsByUser(null);
    }
}
