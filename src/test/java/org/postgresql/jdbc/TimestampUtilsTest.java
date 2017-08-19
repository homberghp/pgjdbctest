/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.postgresql.jdbc;

import java.sql.Date;
import java.util.TimeZone;
import org.junit.Test;
import static org.junit.Assert.*;
import org.postgresql.jdbc.TimestampUtils;
/**
 *
 * @author Pieter van den Hombergh {@code <p.vandenhombergh@fontys.nl>}
 */
public class TimestampUtilsTest {
    
    public TimestampUtilsTest() {
        
    }
    
    @Test
    public void instantiate(){
        TimestampUtils tsu = new TimestampUtils(false, () -> TimeZone.getDefault() );
        Date convertToDate = tsu.convertToDate(System.currentTimeMillis(), TimeZone.getDefault() );
        System.out.println( "convertToDate = " + convertToDate );
    }
}
