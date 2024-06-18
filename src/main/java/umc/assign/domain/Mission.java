package umc.assign.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.assign.domain.common.BaseEntity;
import umc.assign.domain.enums.RestaurantType;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mission extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;

    @Enumerated(EnumType.STRING)
    private RestaurantType restaurantType;

    private Integer missionPrice;
    private Integer successPoint;
    private Integer dDay;
    private String region;

    //미션 양방향 매핑
    @OneToMany(mappedBy = "mission")
    private List<MemberMission> memberMissions = new ArrayList<>();
}
