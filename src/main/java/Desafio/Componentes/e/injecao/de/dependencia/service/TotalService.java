package Desafio.Componentes.e.injecao.de.dependencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalService {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ShippingService shippingService;
}
