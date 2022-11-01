package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author LiGuanda
 * @date 2022/11/1 下午 8:08:54
 * @description no description right now...
 * @filename DepartmentDAO.java
 */

@Repository
public class DepartmentDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert(Integer id, String departmentName) {

        String sql = "insert into department values (?,?)";
        jdbcTemplate.update(sql, id, departmentName);

    }


}
