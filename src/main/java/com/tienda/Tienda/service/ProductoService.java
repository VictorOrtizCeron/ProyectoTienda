package com.tienda.Tienda.service;

import com.tienda.Tienda.domain.Producto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoService {

    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    public List<Producto> metodoNativo(double precioInf, double precioSup);

    public List<Producto> metodoTarea(int cantidad);
}