package conf;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author LiGuanda
 * @date 2022/11/1 下午 7:39:08
 * @description no description right now...
 * @filename SpringConfig.java
 */


@Configuration
@EnableTransactionManagement
@ComponentScan(value = {"bean", "conf", "service", "dao"})
public class SpringConfig {


    @Bean
    public DataSource getDataSource() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("liguanda123456");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysqlpro");
        return dataSource;

    }


    @Bean
    public JdbcTemplate getJDBCTemplate() throws PropertyVetoException {

        return new JdbcTemplate(getDataSource());

    }


    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException {

        return new DataSourceTransactionManager(getDataSource());

    }

    @Bean
    public ApplicationConfig heihei() {

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("heihei");
        return applicationConfig;

    }


    @Bean
    public RegistryConfig hehe() {

        RegistryConfig config = new RegistryConfig();
        config.setPassword("dageIsHandsome");
        config.setAddress("zookeeper://127.0.0.1:2181");
        config.setClient("curator");
        return config;

    }


}
