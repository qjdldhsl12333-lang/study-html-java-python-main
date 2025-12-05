package com.korea.layer.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.korea.layer.model.TodoEntity;
import com.korea.layer.persistence.TodoRepository;
import com.sun.tools.javac.util.Log;

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
	
	public create(TodoEntity entity) {
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
		
		repository.save(entity);
		//2.DB에 저장한다.
		
		//3. 해당 유저가 추가한 todo item을 모두 조회하여 반환(1건이 아닐수도 있음)
		//findbyUserId()를 사용할 것
		
		log.info("Entity Id ; {} is savad",entity.getId());
		
		return repository.findByUserId(entity.getUserId());
		//select * from todo where userid=?
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
