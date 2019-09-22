package com.ticketservice.domian;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = { "id" })


public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Integer eventStatus;
    @Column
    private String eventName;
    @Column
    private String artist;
    @Column
    private Timestamp eventStart;
    @Column
    private Double eventDurationHours;
    @Column
    private int hall;
    @Column
    private int eventType;
    @Column
    private String description;
    @Column
    ArrayList<String> images;
    @Column
    List<PriceRanges> priceRanges;

}
