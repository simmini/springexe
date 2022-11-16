package net.ict.springex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

//페이지 처리는 현재페이지번호(page),한페이지당 데이터수(size) 기본적으로 필요
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
    @Builder.Default//page의 기본값
    @Min(value=1) //기본값 가장최소값 1
    @Positive //양수 (음수처리안하겟다)
    private int page=1;

    @Builder.Default//size의 기본값
    @Min(value=10)//데이터패치= 10개씩 가져오고
    @Max(value=100) //
    @Positive
    private int size=10;//10개씩 처리한다.

    public int getSkip(){//현재페이지에서 앞으로 가기
        return (page-1)*100;
    }

}
