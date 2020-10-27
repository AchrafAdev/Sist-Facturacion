package com.udemy.springboot.app.models.dao;



import org.springframework.data.repository.PagingAndSortingRepository;

import com.udemy.springboot.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

	
}
