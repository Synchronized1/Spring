package com.somnus.spring.annotation.map;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class MapService {
	
	/* 自己定义为集合或映射类型的bean不能通过@Autowired注入，因为类型匹配不适用于它们。 对这样的bean使用@Resource */
	/*@Autowired @Qualifier("iMap")*/
	@Resource
	private Map<String,Integer> iMap;
	
	
	public void say() {
		System.out.println(iMap);
	}
	
	
}
