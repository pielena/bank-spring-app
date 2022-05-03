package com.bank.spring.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@EnableJpaRepositories(basePackages = "com.bank.spring.repository")
public class JpaConfig {

    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/bank?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
            dataSource.setUser("user");
            dataSource.setPassword("user");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean("entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean localContainerEMF(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource);
        emf.setPackagesToScan("com.bank.spring.entity");
        return emf;
    }
}
