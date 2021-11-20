package com.example.bcslr;

import com.example.bcslr.mapper.UserMapper;
import com.example.bcslr.mapper.repositoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.bcslr.pojo.User;
import com.example.bcslr.pojo.repository;

import java.util.List;

@SpringBootTest
class BcslrApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test//测试插入
    public void InsertUser(){
        User user = new User();
        user.setName("yyb");
        user.setID(1);
        user.setAge(12);
        user.setLevel(1);
        Integer result = userMapper.insert(user); //会帮我们自动生成id
        System.out.println(result); //受影响的行数
        System.out.println(user); //通过日志发现id会自动回填
    }

    @Test//测试更新
    public void UpdateUser(){
        User user = new User();
        user.setID(2);//怎么改id？？
        //通过条件自动拼接动态Sql
        user.setName("root");
        user.setAge(12);
        user.setLevel(1);
        int i = userMapper.updateById(user);//updateById，但是参数是个user
        System.out.println(i);
    }

    @Test//测试插入
    public void InsertRepository(){
        repository repo = new repository();
        repo.setID(2);//怎么改id？？
        //通过条件自动拼接动态Sql
        repo.setName("root");
        repo.setComment("Best code website");
        repo.setQuality(70);
        System.out.println(repo); //通过日志发现id会自动回填
    }

    @Test//测试更新
    public void UpdateRepository(){
        repository repo = new repository();
        repo.setID(2);//怎么改id？？
        //通过条件自动拼接动态Sql
        repo.setName("root");
        repo.setComment("Best code website");
        repo.setQuality(70);
//        int i = repositoryMapper.updateById(repo);//updateById，但是参数是个user
//        System.out.println(i);
    }
}
