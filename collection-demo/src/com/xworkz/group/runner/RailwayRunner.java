package com.xworkz.group.runner;

import com.xworkz.group.dto.RailwayDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RailwayRunner {
    public static void main(String[] args) {
        RailwayDTO railwayDTO = new RailwayDTO("Rani channnamma Express",22450,250, LocalDate.of(2024,11,30));
        RailwayDTO railwayDTO1 = new RailwayDTO("Rani channnamma Express1",22350,230, LocalDate.of(2024,12,05));
        RailwayDTO railwayDTO2 = new RailwayDTO("Rani channnamma Express2",22470,200, LocalDate.of(2024,12,10));
        RailwayDTO railwayDTO3 = new RailwayDTO("Rani channnamma Express3",22490,340, LocalDate.of(2024,12,30));

        Collection<RailwayDTO> collection = new ArrayList<>();
        collection.add(railwayDTO);
        collection.add(railwayDTO1);
        collection.add(railwayDTO2);
        collection.add(railwayDTO3);

        Iterator<RailwayDTO> iterator = collection.iterator();
        while (iterator.hasNext())
        {
            RailwayDTO dto =iterator.next();
            if (dto.getName().equals("Rani channnamma Express"))
            {
                System.out.println(dto);
                collection.remove(dto);
            }
        }
    }
}
