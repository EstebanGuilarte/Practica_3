package com.practica03.dao;

import com.practica03.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDao extends JpaRepository<Estado,Long>{
    
}
