package com.capgemini.hotelreservationsystem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HotelTest 
{
    @Test
    public void whenHotelAdded_ShouldReturnTrue()
    {	
    	HotelReservation hotelReservation = new HotelReservation();
    	boolean isHotelAdded = hotelReservation.addHotel("Lakewood",110, 90);
        assertTrue(isHotelAdded);
    }
}
