package com.shoppaholic.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import com.shoppaholic.shoppaholic.*;



@Service
public class PedidoService {
	@Autowired
	PedidoRepository pedidoRepository;

	public Pedido findById(long id) {
		return pedidoRepository.findById(id);
	}
	
	public List<Pedido>findByTotalPrice(double price){
		return pedidoRepository.findByTotalPrice(price);
	}
	
	public List<Pedido> findByStatus(String status) {
		return pedidoRepository.findByStatus(status);
	}
	
	public List<Pedido> findByUser(String user) {
		return pedidoRepository.findByUser(user);
	}
	
	public List<Pedido> findByDate(String date) {
		return pedidoRepository.findByDate(date);
	}
}
