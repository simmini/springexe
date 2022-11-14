package net.ict.springex.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.ict.springex.domain.TodoVO;
import net.ict.springex.dto.TodoDTO;
import net.ict.springex.mapper.TodoMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

//데이터 베이스를 처리하는 TodoMapper와 DTO,VO변환을 처리하는 ModelMapper주입
@Service
@Log4j2
@RequiredArgsConstructor //의존성 주입이 필요한 객체의 타입을 final로 고정하고
// 생성자 @ReqriredArgsConstructor을 이용하여 생성자로 생성하는 방식 사용
public class TodoServiceImpl implements TodoService {
    private final TodoMapper todoMapper;
    private final ModelMapper modelMapper;


    public void register (TodoDTO todoDTO)
    {
        log.info(modelMapper);
        TodoVO todoVo=modelMapper.map(todoDTO,TodoVO.class);
        log.info(todoVo);
        todoMapper.insert(todoVo);
    }

}
