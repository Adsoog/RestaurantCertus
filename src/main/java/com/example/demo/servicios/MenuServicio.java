package com.example.demo.servicios;

import org.springframework.stereotype.Service;
import com.example.demo.modelo.MenuFoto;

import java.util.List;

@Service
public interface MenuServicio {
    public MenuFoto create(MenuFoto menufoto);
    public List<MenuFoto> viewAll();
    public MenuFoto viewById(long id);
}
