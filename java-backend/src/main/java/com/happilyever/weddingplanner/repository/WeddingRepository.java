package com.happilyever.weddingplanner.repository;

import com.happilyever.weddingplanner.models.Wedding;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface WeddingRepository extends CrudRepository<Wedding, Long>
{
    @Transactional
    @Modifying
    @Query(value = "DELETE from User where userid = :userid")
    void deleteUserRolesByUserId(long userid);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO Wedding(userid, weddingid) values (:userid, :weddingid)",
           nativeQuery = true)
    void insertUser(long userid, long weddingid);

    List<Wedding> findByUser_Username(String username);


   // Wedding findByNameIgnoreCase(String username);
}
