package com.happilyever.weddingplanner.services;

import com.happilyever.weddingplanner.models.User;
import com.happilyever.weddingplanner.repository.WeddingRepository;
import com.happilyever.weddingplanner.models.Wedding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "quoteService")
public class WeddingServiceImpl implements WeddingService
{
    @Autowired
    private WeddingRepository weddingrepos;

    @Override
    public List<Wedding> findAll()
    {
        List<Wedding> list = new ArrayList<>();
        weddingrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Wedding findWeddingById(long id)
    {
        return weddingrepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }

    @Override
    public void delete(long id)
    {
        if (weddingrepos.findById(id).isPresent())
        {
            weddingrepos.deleteById(id);
        } else
        {
            throw new EntityNotFoundException(Long.toString(id));
        }
    }

    @Transactional
    @Override
    public Wedding save(Wedding wedding)
    {
        return weddingrepos.save(wedding);
    }

    @Override
    public List<User> findByUserName(String username)
    {
        List<Wedding> list = new ArrayList<>();
        weddingrepos.findAll().iterator().forEachRemaining(list::add);

        list.removeIf(q -> !q.getUsers().getUsername().equalsIgnoreCase(username));
        return list;
    }

    @Override
    public Wedding update(Wedding wedding, long id)
    {
        Wedding newTodo = weddingrepos.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));

        if (wedding.getWedding() != null)
        {
            newTodo.setWedding(wedding.getWedding());
        }

        if (wedding.getUsers() != null)
        {
            newTodo.setUsers(wedding.getUsers());
        }

        return weddingrepos.save(newTodo);
    }
}