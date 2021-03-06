package com.zl.autism.mapper;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.zl.autism.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User>{
    User login(@Param("phone")String phone,@Param("password")String password);

    ArrayList<User> getUserInfos(@Param("uuid")List<String> uuid, @Param("open_id")List<String> openId,@Param("type")String type);

    User getUserByPhone(@Param("phone")String phone);
}
