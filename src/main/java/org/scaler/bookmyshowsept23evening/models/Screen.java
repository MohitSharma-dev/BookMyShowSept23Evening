package org.scaler.bookmyshowsept23evening.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
    private List<Features> features;
    private Theatre theatre;
    private List<Seat> seats;
}
