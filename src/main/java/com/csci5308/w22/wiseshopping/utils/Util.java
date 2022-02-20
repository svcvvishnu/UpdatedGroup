package com.csci5308.w22.wiseshopping.utils;

import java.sql.Time;

/**
 * @author Elizabeth James
 */
public class Util {
    /**
     * this method parse the time passed as string
     * Accepts date in HH:MM:SS or HH:MM or HH format
     *
     * @param time time as string
     * @return Time object
     */
    public static Time parseTime(String time) {

        if (time.split(":").length == 1) {
            time = time + ":00:00";
            //return Time.valueOf(time);
        } else if (time.split(":").length == 2) {
            time = time + ":00";
            return Time.valueOf(time);
        } else if (time.split(":").length == 3) {
            return Time.valueOf(time);
        }
        // throw exception if any other format is passed
        else {
            throw new IllegalArgumentException("Invalid argument for time.\n Expected format : HH:MM");
        }
        try{
            return Time.valueOf(time);
        }
        catch (NumberFormatException e){
            throw new IllegalArgumentException("Invalid argument for time. No other characters expect string is allowed.\n Expected format : HH:MM");
        }
    }
}
