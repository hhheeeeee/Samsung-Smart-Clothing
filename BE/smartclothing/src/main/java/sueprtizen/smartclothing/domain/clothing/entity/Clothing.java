package sueprtizen.smartclothing.domain.clothing.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import sueprtizen.smartclothing.domain.users.entity.User;

import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@ToString
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clothingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "clothing_detail_id")
    private ClothingDetail clothingDetail;

    @OneToMany(mappedBy = "clothing")
    private List<ClothingStyle> clothingStyles;

    @OneToMany(mappedBy = "clothing")
    private List<ClothingSeason> clothingSeasons;

    @Column
    private String nowAt;

    @Column(name = "RFID_uid")
    private String RFIDUid;

    @Column
    private String clothingName;

    @Column
    private String washedAt;

    @Column
    private int polluted;

    @Column
    private String wornCount;

    @Column
    private String category;
}
