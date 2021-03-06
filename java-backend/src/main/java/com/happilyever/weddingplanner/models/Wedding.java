package com.happilyever.weddingplanner.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "wedding")
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


    private String meal;


    private String wedding;


    @ManyToOne
    @JoinColumn(name = "userid",
                nullable = false)
    @JsonIgnoreProperties("weddings")

    private User user;
    public Wedding()
    {
    }

    public Wedding(String couplename, String weddingtheme, String itemphoto, String weddingdate, String weddinglocation, String weddingphotographer, String meal, String wedding)
    {
        this.couplename = couplename;
        this.weddingtheme = weddingtheme;
        this.itemphoto = itemphoto;
        this.weddingdate = weddingdate;
        this.weddinglocation = weddinglocation;
        this.weddingphotographer = weddingphotographer;
        this.meal = meal;
        this.wedding = wedding;
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

    public String getMeal()
    {
        return meal;
    }

    public void setMeal(String meal)
    {
        this.meal = meal;
    }

    public String getWedding()
    {
        return wedding;
    }

    public void setWedding(String wedding)
    {
        this.wedding = wedding;
    }
}