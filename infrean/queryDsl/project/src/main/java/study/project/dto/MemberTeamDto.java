package study.project.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MemberTeamDto {
    private Long memberId;
    private String userName;
    private int age;
    private Long teamId;
    private String teamName;

    @QueryProjection
    public MemberTeamDto(Long memberId, String userName, int age, Long teamId, String teamName) {
        this.memberId = memberId;
        this.userName = userName;
        this.age = age;
        this.teamId = teamId;
        this.teamName = teamName;
    }
}
