package org.postgresql.jdbc;


import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pieter van den Hombergh {@code <p.vandenhombergh@fontys.nl>}
 */
public class JDBCTimeUtilsMain {
    public static void main( String[] args ) {
        org.postgresql.jdbc.TimestampUtils tsu = new TimestampUtils(false, ()-> TimeZone.getDefault());
    }
}
