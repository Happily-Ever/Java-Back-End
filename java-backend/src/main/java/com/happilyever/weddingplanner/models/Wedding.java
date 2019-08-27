package com.happilyever.weddingplanner.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
public class Wedding extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long weddingid;


    private String couplename;


    private String weddingtheme;


    private String itemphoto;


    private String weddingdate;


    private String weddinglocation;


    private String weddingphotographer;


    private String userid;


    private String meal;


    @OneToMany(mappedBy = "user",
               cascade = CascadeType.ALL)
    @JsonIgnoreProperties("user")
    private List<User> users = new ArrayList<>();

    public Wedding()
    {
    }

    public Wedding(String couplename, String weddingtheme, String itemphoto, String weddingdate, String weddinglocation, String meal, String weddingphotographer, String userid, List<User> users)
    {
        this.couplename = couplename;
        this.weddingtheme = weddingtheme;
        this.itemphoto = itemphoto;
        this.weddingdate = weddingdate;
        this.weddinglocation = weddinglocation;
        this.weddingphotographer = weddingphotographer;
        this.userid = userid;
        this.users = users;
        this.meal = meal;
    }

    public String getMeal()
    {
        return meal;
    }

    public void setMeal(String meal)
    {
        this.meal = meal;
    }

    public long getWeddingid()
    {
        return weddingid;
    }

    public void setWeddingid(long weddingid)
    {
        this.weddingid = weddingid;
    }

    public String getCouplename()
    {
        return couplename;
    }

    public void setCouplename(String couplename)
    {
        this.couplename = couplename;
    }

    public String getWeddingtheme()
    {
        return weddingtheme;
    }

    public void setWeddingtheme(String weddingtheme)
    {
        this.weddingtheme = weddingtheme;
    }

    public String getItemphoto()
    {
        return itemphoto;
    }

    public void setItemphoto(String itemphoto)
    {
        this.itemphoto = itemphoto;
    }

    public String getWeddingdate()
    {
        return weddingdate;
    }

    public void setWeddingdate(String weddingdate)
    {
        this.weddingdate = weddingdate;
    }

    public String getWeddinglocation()
    {
        return weddinglocation;
    }

    public void setWeddinglocation(String weddinglocation)
    {
        this.weddinglocation = weddinglocation;
    }

    public String getWeddingphotographer()
    {
        return weddingphotographer;
    }

    public void setWeddingphotographer(String weddingphotographer)
    {
        this.weddingphotographer = weddingphotographer;
    }

//    public String getUserid()
//    {
//        return userid;
//    }
//
//    public void setUserid(String userid)
//    {
//        this.userid = userid;
//    }

    public List<User> getUsers()
    {
        return users;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }
}