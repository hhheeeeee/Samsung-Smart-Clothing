package sueprtizen.smartclothing.domain.clothing.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class ClothingSeason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int seasonId;

    @ManyToOne
    @JoinColumn(name = "clothing_connection_id", nullable = false)
    UserClothing userClothing;

    @Column(nullable = false)
    private int month;


}
