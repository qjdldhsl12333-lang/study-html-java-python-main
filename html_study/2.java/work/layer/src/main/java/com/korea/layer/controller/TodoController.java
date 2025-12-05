package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.DTO.ResponseDTO;
import com.korea.layer.DTO.TodoDTO;
import com.korea.layer.model.TodoEntity;
import com.korea.layer.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
public class TodoController {
	//해야할 일 api 만들것이다.
	
	//@Autowired //필드로 객체넣는법 필드 주입
	//스프링 컨테이너가 실행될때 TodoService 타입의 빈을  
	//찾아서 service 필드에 넣어준다
	private final TodoService service; //null 처음엔 비어있다.
	//-스프링에서 가장 권장하는 방식 
//	public TodoController(TodoService service) { //생성자 주입방식
//		this.service = service;
//	}
	//setter주입
	//Setter를 통해 주입하는 방식
//	public void setService(TodoService service) {
//		this.service = service;
//	}
	
	
	//localhost:8080/todo/test
	@GetMapping("/test")
	public ResponseEntity<?> testTodo() {
		String str = service.testService();//testService()메서드를 실행해서 값을 가져온다.
		List<String> list =new ArrayList<String>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			String tempraryUserId ="temporary=user";
			//DTO ->Entity
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			//엔티티가 새로운 데이터임을 보장
			entity.setId(null);
			
			//엔티티에 임시 유저 아이디 세팅
			entity.setUserId(tempraryUserId);
			
			//서비스 레이어의 create메서드를 호출해서, TodoEntity를 데이터베이스에 저장하는 작업을 한다.
			//저장을 한 다음 TodoEnitiy 객체들을 저장한 List를 반환한다.
			TodoService todo = new TodoService();
			
			List<TodoEntity> entites = todo.create(entity);
			
			
			List<TodoDTO> dtos = new ArrayList<>();
			
			//리스트안에 있는 TodoEntity를 TodoDTO 타입으로 변경해서 dtos에 넣는다.
			for(TodoEntity e :entites) {
				dtos.add(new TodoDTO(e)); //entity를 dto로 바꿔서 리스트에 추가
			}
			//builder패턴을 이용해서 dtos를 ResponseDTO에 담아서 ResPonseEntity로 반환한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
			return
					
		}
	}
}




