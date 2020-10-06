package com.capgemini.hotelreservationsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HotelTest 
{
	HotelReservation hotelReservation;
	@Before
	public void init() {
		 hotelReservation = new HotelReservation();
	}
    @Test
    public void whenHotelAdded_ShouldReturnTrue() {
    	boolean isHotelAdded = hotelReservation.addHotel("Lakewood",110, 90);
        assertTrue(isHotelAdded);
    }
    @Test 
    public void whenGivenDate_OneToSixOct2020_ShouldReturnLakewoodHotelCheapest() {
        hotelReservation.addHotel("Lakewood", 110, 90);
        hotelReservation.addHotel("Bridgewood", 160, 60);
        hotelReservation.addHotel("Ridgewood", 220, 150);
    	Hotel hotel = hotelReservation.findCheapestHotel("01-Oct-2020", "06-Oct-2020");
    	assertEquals("Lakewood", hotel.getHotelName());
    }
}
