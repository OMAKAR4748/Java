package com.xworkz.tv.util;

import com.xworkz.tv.dto.TvDto;

public class TvUtil {

        private static TvDto tvDto;

    public static TvDto getTv(){

        return tvDto;
    }
    static {
        tvDto = new TvDto();
    }
}
