package service;

import dao.DepartmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LiGuanda
 * @date 2022/11/1 下午 8:11:58
 * @description no description right now...
 * @filename DepartmentService.java
 */


@Service
public class DepartmentService {


    @Autowired
    private DepartmentDAO departmentDAO;


    @Transactional
    public void insertDepartment(Integer id, String departmentName) {

        departmentDAO.insert(id, departmentName);
        System.out.println("Insert successfully!");

    }


}
