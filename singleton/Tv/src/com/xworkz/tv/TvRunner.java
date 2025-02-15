package com.xworkz.tv;

import com.xworkz.tv.dto.TvDto;
import com.xworkz.tv.util.TvUtil;

public class TvRunner {
    public static void main(String[] args) {

        TvDto tvDto = TvUtil.getTv();
        tvDto.setSpeed(5);
        tvDto.setOn(true);
        tvDto.setColor("Black");
        System.out.println(tvDto);

        TvDto tvDto1 = TvUtil.getTv();
        tvDto.setSpeed(4);
        tvDto.setOn(true);
        tvDto.setColor("blue");
        System.out.println(tvDto1);

        TvDto tvDto2 = TvUtil.getTv();
        tvDto.setSpeed(3);
        tvDto.setOn(true);
        tvDto.setColor("Grey");
        System.out.println(tvDto2);

    }
}
