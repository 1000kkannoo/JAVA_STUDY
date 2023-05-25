package study.project.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.project.dto.MemberSearchCondition;
import study.project.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
