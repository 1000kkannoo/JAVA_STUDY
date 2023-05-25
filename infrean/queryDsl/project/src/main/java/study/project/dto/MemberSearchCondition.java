package study.project.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    private String userName;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;
}
