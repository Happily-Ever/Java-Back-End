package com.happilyever.weddingplanner.services;

import com.happilyever.weddingplanner.models.Wedding;


import java.util.ArrayList;
import java.util.List;

public interface WeddingService
{
    List<Wedding> findAll();

    Wedding findWeddingById(long id);

    List<Wedding> findByUserName(String username);

    void delete(long id);

    Wedding save(Wedding wedding);

    Wedding update(Wedding wedding, long id);

}
