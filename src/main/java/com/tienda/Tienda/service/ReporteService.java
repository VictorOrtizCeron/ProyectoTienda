package com.tienda.Tienda.service;


import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

public interface ReporteService {

    public ResponseEntity<Resource> generaReporte(String reporte, Map<String, Object> parametros, String tipo) ;


}
