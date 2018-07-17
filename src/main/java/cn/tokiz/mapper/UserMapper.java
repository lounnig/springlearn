package cn.tokiz.mapper;

import cn.tokiz.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectById(@Param("id") Integer id);
    Long insertUser(User user);
    Long deleteUserById(@Param("id") Integer id);
    Long updateByPrimaryKeySelective(User user);
    List<User> selectAllUser();

}
