package com.github.miemiedev.smt.repository;


import com.github.miemiedev.mybatis.paginator.PageQuery;
import com.github.miemiedev.smt.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

@MyBatisRepository
public interface UserDao {

    public User get(Long id);

    public List<Map<String, Object>> queryByDeptCode(@Param("deptCode")String deptCode, @Param("createDate")Date createDate ,PageQuery pq);
}
