package net.ict.springex.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

//객체 자료형운 파라미터로 처리하기 위해서는 객체로 생성되고
//setxxx()이용해서 처리
@ToString
@Data
@Builder
@AllArgsConstructor //생성자
@NoArgsConstructor //기본생성자
public class TodoDTO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer; //작성자를 의미

}
