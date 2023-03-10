package kr.yougo.gg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"kr.yougo.gg.mapper"})
public class YougoGgApplication {

	public static void main(String[] args) {
		SpringApplication.run(YougoGgApplication.class, args);
	}

}
