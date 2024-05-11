package org.example.lethithuykieu_activemq;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {
    private String name;
}
