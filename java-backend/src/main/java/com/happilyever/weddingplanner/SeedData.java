package com.happilyever.weddingplanner;

import com.happilyever.weddingplanner.models.Wedding;
import com.happilyever.weddingplanner.models.User;
import com.happilyever.weddingplanner.services.WeddingService;
import com.happilyever.weddingplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    WeddingService weddingService;

    @Autowired
    UserService userService;


    @Override
    public void run(String[] args) throws Exception
    {
        ArrayList<Wedding> wedding = new ArrayList<>();
        User u1 = new User("admin", "password", "admin@email.local", "location", wedding);
        userService.save(u1);
    }
}