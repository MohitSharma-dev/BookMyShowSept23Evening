package org.scaler.bookmyshowsept23evening.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theatre extends BaseModel {
    private String name;
    private Region region;
    private String address;
//    private List<Show> shows;
//    private List<Screen> screens;
//    private List<Movie> movies;
}
// Show : Screen