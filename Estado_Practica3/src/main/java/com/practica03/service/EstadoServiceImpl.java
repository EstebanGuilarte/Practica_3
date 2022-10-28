package com.practica03.service;

import com.practica03.dao.EstadoDao;
import com.practica03.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao estadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstados() {
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }
}
