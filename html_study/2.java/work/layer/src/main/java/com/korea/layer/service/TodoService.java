package com.korea.layer.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.korea.layer.DTO.TodoDTO;
import com.korea.layer.model.TodoEntity;
import com.korea.layer.persistence.TodoRepository;


import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j //(Simple Logging Facade for java) 로그를 작성하는 표준 인터페이스 제공
@Service
//스프링 프레임워크에서 제공하는 어노테이션중 하나로  서비스레이어에
//사용되는 클래스를 명시할 때 사용
// 이 어노테이션을 사용하면 스프링 부트가 해당 클래스를 스프링 컨테이너에서
//관리하는 빈(bean)으로 등록하고, 비즈니스 로직을 처리하는 역할을 맡는다.
@RequiredArgsConstructor
public class TodoService {
	
	//TodoRepository를 생성자 주입받기
	private final TodoRepository repository;
	
	public String testService() {
		//build 패턴으로 TodoEntity객체를 하나 만든다.
		//title : My First Todo item
		TodoEntity entity = TodoEntity
				.builder()
				.userId("qjdl123")
				.title("My First Todo item")
				.build();
		//TodoEntity를 db에 저장하기
		repository.save(entity);
		
		//저장된 데이터 찾기(조회)
		//findById의 반환형 Optional
		//Optional "null" 이 들어올 수 있는 값을 안전하게 감싸는 박스 
		//값이 없으면 예외 발생, 값이 있으면 정상 반환
		TodoEntity savedEntity = repository.findById(entity.getId())
			.orElseThrow(() -> new RuntimeException("데이터 없음"));
		
//		Optional<TodoEntity> optional = repository.findById(entity.getId());
//		
//		TodoEntity savedEntity =null;
//		//isPresent() : 반환된 optional 객체 안에 값이 존재하면 true, 없으면 false
//		if(optional.isPresent()) {
//			savedEntity =optional.get();
//		}
		
		return savedEntity.getTitle();
	}
	
	public List<TodoEntity>  create(TodoEntity entity) {
		//1.매게 변수로 넘어온 Entity가 유효(null인지 아닌지)한지 검사한다.
		//null이면 RunTimeException("Entity cannot be null")
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		//1-1.userId가 null이면 RunTimeException("Unknown User")에러 발생
		if(entity.getUserId() == null) {
			log.warn("Unknown User");
			throw new RuntimeException("Unknown User");
			
		}
		
		repository.save(entity); //insert into
		//2.DB에 저장한다.
		
		//3. 해당 유저가 추가한 todo item을 모두 조회하여 반환(1건이 아닐수도 있음)
		//findbyUserId()를 사용할 것
		
		log.info("Entity Id ; {} is savad",entity.getId());
		
		return repository.findByUserId(entity.getUserId());
		//select * from todo where userid=?
		
	}
	//----------------------------------------------------------------------
	 //db에서 모든 데이터를 꺼내서 반환하는 retrieve메서드 작성하기
	public List<TodoEntity> retrieve(String temporaryUserId ){
		return repository.findByUserId(temporaryUserId);
	}
	 //findByUserId() 메서드 활용하기
//=======================================================================
	   //update 메서드
	public List<TodoEntity> update(TodoEntity entity) {

	    // 1. 유효성 검사
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		//1-1.userId가 null이면 RunTimeException("Unknown User")에러 발생
		if(entity.getUserId() == null) {
			log.warn("Unknown User");
			throw new RuntimeException("Unknown User");
			
		}
		

	    // 2. DB에서 기존 데이터 한 건 조회
	    //넘겨받은 entity의 id를 이용해서 todoEntity 한 건을 db로부터 가져온다.
	    //존재하지 않는 엔티티는 업데이트 할 수 없기 때문에
	    Optional<TodoEntity> original = repository.findById(entity.getId());

	    // 3. 값이 있으면 title, done 수정
	    if (original.isPresent()) {
	    	//오리지날의 내용을 가져와서
	        TodoEntity todo = original.get();  // Optional → entity 꺼내기
	        // 사용자가 전달한 제목과 boolean값으로 다시 세팅
	        todo.setTitle(entity.getTitle());  // 제목 수정
	        todo.setDone(entity.isDone());     // 완료 여부 수정

	        // 4. DB에 저장(update)
	        repository.save(todo);

	    } else {
	        throw new RuntimeException("Todo not found : " + entity.getId());
	    }

	    // 5. 동일한 userId의 전체 Todo 리스트 반환
	    return repository.findByUserId(entity.getUserId());
	}
	
	// service 부분
	//삭제하기
	//넘어온 entity가 유효한지 검사
	//유효하면 삭제 후 전체 조회 후 반환
	public List<TodoEntity> deleteTodo(Long id, String userId){
		 
		// 1. 유효성 검사
		if(id == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		//1-1.userId가 null이면 RunTimeException("Unknown User")에러 발생
		if(userId == null) {
			log.warn("Unknown User");
			throw new RuntimeException("Unknown User");
			
		}
		//2. DB에서 삭제할 entity 조회
		TodoEntity entity = repository.findById(entity.getId())
		.orElseThrow(() -> new RuntimeException("데이터 없음"));
		
		//유저가 맞는지 체크 옵션
		if(!entity.getUserId().equals(userId)) {
			throw new RuntimeException();
		}
		  repository.delete(entity);
		
		  return repository.findByUserId(userId);
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
