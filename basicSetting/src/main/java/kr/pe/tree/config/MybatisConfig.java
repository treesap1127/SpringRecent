package kr.pe.tree.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "kr.pe.tree.*.*.repository")
public class MybatisConfig {
}
