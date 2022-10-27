package dao;

import bean.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author LiGuanda
 * @date AM 10:13:56
 * @description This is a description of WifeDAO
 * @since version-1.0
 */


@Repository
public class WifeDAO {


    @Qualifier("heihei")
    @Autowired
    public Wife wife;


    @Override
    public String toString() {

        return "WifeDAO{" +
                "wife=" + wife +
                '}';

    }


}
