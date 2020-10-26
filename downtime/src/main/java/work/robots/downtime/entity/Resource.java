package work.robots.downtime.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

//@Entity(name = "robots")
@Entity
@Data
@NoArgsConstructor
public class Resource {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "resource_name")
    private String resourceName;
}
