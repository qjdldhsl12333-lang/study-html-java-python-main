package com.korea.di.di4;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class DemoModel {
	
	@NonNull
	String id;

}
