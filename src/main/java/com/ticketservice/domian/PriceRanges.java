package com.ticketservice.domian;

import lombok.*;

import java.util.ArrayList;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceRanges {

    private ArrayList<Integer> rows;
    private Double price;
    private String color;
}
