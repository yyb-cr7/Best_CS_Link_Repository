package com.example.bcslr.mapper;

import com.example.bcslr.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository // 代表持久层的
public interface UserMapper extends BaseMapper<User>{

}
