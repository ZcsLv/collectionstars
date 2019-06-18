package com.example.colllectionstars.repository;

import com.example.colllectionstars.domain.Table_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @description:
 * @author:zcs
 * @date:2019-06-16 18:50
 */

public interface UserRepository extends JpaRepository<Table_user,Integer> {

@Modifying
@Transactional
//??????????为什么上面俩个注释要一起写
@Query(value = "insert into table_user values(?1,?2,?3,?4,?5,?6,?7)",nativeQuery = true)
void insert(int user_id, String user_nickname, String user_password, String user_email, int acti_state, String acti_code, Date token_exptime);
}
