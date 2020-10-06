package com.capgemini.hotelreservationsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Hotel Reservation.
 */
public class HotelTest 
{
	HotelReservation hotelReservation;
	@Before
	public void init() {
		 hotelReservation = new HotelReservation();
		 hotelReservation.addHotel("Lakewood", 110, 90, 3);
	     hotelReservation.addHotel("Bridgewood", 160, 60, 4);
	     hotelReservation.addHotel("Ridgewood", 220, 150, 5);
	}
    @Test
    public void whenHotelAdded_ShouldReturnTrue() {
    	boolean isHotelAdded = hotelReservation.addHotel("Lakewood",110, 90,3);
        assertTrue(isHotelAdded);
    }
    @Test 
    public void whenGivenDate_OneToSixOct2020_ShouldReturnLakewoodHotelCheapest() {
    	Hotel hotel = hotelReservation.findCheapestBestRatedHotel("01-Oct-2020", "06-Oct-2020");
    	assertEquals("Lakewood", hotel.getHotelName());
    }
    @Test 
    public void whenGivenDate_Improper_ShouldReturnNull() {
    	Hotel hotel = hotelReservation.findCheapestBestRatedHotel("06-Oct-2020", "01-Oct-2020");
    	assertEquals(null, hotel);
    }
    @Test 
    public void whenGivenDateRange_InvokingFindCheapestBestRatedHotel_ShouldReturnBetterRatedCheapestHotel() {
        hotelReservation.addHotel("Cheapest Hotel", 110, 90, 5);
    	Hotel hotel = hotelReservation.findCheapestBestRatedHotel("01-Oct-2020", "06-Oct-2020");
    	assertEquals("Cheapest Hotel", hotel.getHotelName());
    }
    @Test 
    public void whenGivenDateRange_InvokingFindBestRatedHotel_ShouldReturnBestRatedHotel() {
        hotelReservation.addHotel("Best Rated Hotel", 200, 150, 6);
    	Hotel hotel = hotelReservation.findBestRatedHotel("01-Oct-2020", "06-Oct-2020");
    	assertEquals("Best Rated Hotel", hotel.getHotelName());
    }
}
