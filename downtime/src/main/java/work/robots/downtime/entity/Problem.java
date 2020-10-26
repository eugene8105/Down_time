package work.robots.downtime.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity(name = "robots")
@Entity
@Data
@NoArgsConstructor
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "resource_name")
    private String resourceName;

    @Column(name = "date")
    private String date;

    @Column(name = "which_cell")
    private String whichCell;

    @Column(name = "time_spend")
    private int timeSpend;

    @Column(name = "reason")
    private String reason;

    @Column(name = "program_name")
    private String programName;

    @Column(name = "line_number")
    private String lineNumber;

    @Column(name = "initials")
    private String initials;
}
