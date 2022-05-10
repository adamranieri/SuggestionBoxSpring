package dev.ranieri.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "suggestion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "priority")
    private int priortiy;

    @Column(name = "submitted_time")
    private long submittedTime;
}
