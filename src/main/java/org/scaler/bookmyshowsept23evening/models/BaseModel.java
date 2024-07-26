package org.scaler.bookmyshowsept23evening.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

// These annotations supported by lombok
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date lastModifiedAt;
}

