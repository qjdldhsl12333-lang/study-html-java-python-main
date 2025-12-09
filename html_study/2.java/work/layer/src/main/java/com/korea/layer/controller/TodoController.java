package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
//@RequiredArgsConstructor
@CrossOrigin(originPatterns ="*",allowCredentials = "false")
public class TodoController {
	//해야할 일 api 만들것이다.
	
	//@Autowired //필드로 객체넣는법 필드 주입
	//스프링 컨테이너가 실행될때 TodoService 타입의 빈을  
	//찾아서 service 필드에 넣어준다
	private final TodoService service; //null 처음엔 비어있다.
	//-스프링에서 가장 권장하는 방식 
	public TodoController(TodoService service) { //생성자 주입방식
		this.service = service;
	}
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
	//할일생성--------------------------------------------------------------------------
	@PostMapping("/createTodo")
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			String tempraryUserId ="temporary-user";
			//DTO ->Entity
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			//엔티티가 새로운 데이터임을 보장
			entity.setId(null);
			
			//엔티티에 임시 유저 아이디 세팅
			entity.setUserId(tempraryUserId);
			
			//서비스 레이어의 create메서드를 호출해서, TodoEntity를 데이터베이스에 저장하는 작업을 한다.
			//저장을 한 다음 TodoEnitiy 객체들을 저장한 List를 반환한다.
//			TodoService todo = new TodoService();
			
			List<TodoEntity> entities = service.create(entity);
			
			
			
			List<TodoDTO> dtos = entities.stream()
					.map(TodoDTO::new)
					.collect(Collectors.toList());
			
//			List<TodoDTO> dtos = new ArrayList<>();
//			
//			//리스트안에 있는 TodoEntity를 TodoDTO 타입으로 변경해서 dtos에 넣는다.
//			for(TodoEntity e :entites) {
//				dtos.add(new TodoDTO(e)); //entity를 dto로 바꿔서 리스트에 추가
//			}
			
			//builder패턴을 이용해서 dtos를 ResponseDTO에 담아서 ResPonseEntity로 반환한다.
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>
					builder().
					data(dtos).
					build();
			
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
			String errorString = e.getMessage();
			
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>
					builder()
			        .error(e.getMessage())
			        .build();
			return ResponseEntity.ok().body(response); 
		}
//-------------------------------------------------------------------------------------------------------------------------------------					
		}
		// 생성된 모든 할 일을 조회
	   @GetMapping
	   public ResponseEntity<?> retrieveTodoList(){
	      //임시 유저 아이디
	      String temporaryUserId = "temporary-user";
	      
	      //서비스레이어의 retrieve메서드를 이용해 Todo리스트를 반환받아 entities리스트에 저장한다.
	      List<TodoEntity> entities = service.retrieve(temporaryUserId);
	      
	      //List에 들어있는 Entity들을 DTO로 변환한다.
			List<TodoDTO> dtos = entities.stream()
					.map(TodoDTO::new)
					.collect(Collectors.toList());
	      
	      //ResponseDTO객체에 담는다.
	      ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>
	      			builder().
	      			data(dtos).
	      			build();
	      
	      //ResponseEntity로 반환한다.
	      return ResponseEntity.ok().body(response);
	   }
//------------------------------------------------------------------------------------------
	   //수정하기
	   //할일을 수정하기 위한 updateTodo메서드 작성하기
	   //수정하려는 내용을 사용자로부터 받아서 처리
	   //임시유저 "temporary-user"
	   //update from Todo set title="수정할내용" where id = ??
	   //id와 title을 받아야함
	   @PutMapping
	   public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto) {
	           	//임시유저 생성
		   		String temporaryUserId = "temporary-user";

	           // DTO → Entity 변환
	           TodoEntity entity = TodoDTO.toEntity(dto);

	           // 수정할 때도 userId 필요 (본인 데이터인지 확인용)
	           entity.setUserId(temporaryUserId);
	           //entity
	           // id: xxxxx
	           //userId : temporary-user
	           //title: 수정하려는 내용
	           //done : true

	           // 서비스 update 호출
	           List<TodoEntity> entities = service.update(entity);

	           // Entity → DTO 변환
	           List<TodoDTO> dtos = entities.stream()
						.map(TodoDTO::new)
						.collect(Collectors.toList());

	           // 성공 응답
	           ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>
	           			builder()
	                   .data(dtos)
	                   .build();

	           return ResponseEntity.ok().body(response);
	   }
	   //controller 부분
	   //삭제하기
	   //@deleteMapping
	   //메서드이름 deleteTodo
	   //임시유저 세팅
	   //삭제 후 전체조회를 하고 반환
	   @DeleteMapping("/{id}")
	    public List<TodoDTO> deleteTodo(@PathVariable Long id) {

	        // ⭐ 임시 유저 세팅
	        String tempUserId = "temp-user";

	        // Service 호출
	        List<TodoEntity> entities = service.deleteTodo(id, tempUserId);

	        // Entity → DTO 변환
	        return entities.stream()
	                .map(TodoDTO::new)
	                .collect(Collectors.toList());
	   }
		   
}
	   
	   
	   