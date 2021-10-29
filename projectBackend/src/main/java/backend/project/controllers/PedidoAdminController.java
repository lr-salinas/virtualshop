package backend.project.controllers;

import backend.project.entity.Categoria;
import backend.project.entity.PedidoAdmin;
import backend.project.entity.Producto;
import backend.project.service.CategoriaService;
import backend.project.service.PedidoAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/pedidos")

public class PedidoAdminController {
    @Autowired
    private PedidoAdminService pedidoAdminService;


    //	OBTENER TODOS LOS PEDIDOS
    @GetMapping
    public List<PedidoAdmin> ListarTodos() {

        return pedidoAdminService.BuscarTodos();
    }

    //	OBTENER PRODUCTO POR ID
    @GetMapping("/{id}")
    public Optional<PedidoAdmin> getById (@PathVariable Integer id) {

        return (Optional<PedidoAdmin>) pedidoAdminService.getById(id);
    }

    //	ACTUALIZAR UN PEDIDO EXISTENTE
    @PutMapping
    public void actualizarPedidoAdmin(@RequestBody PedidoAdmin pedidoAdmin) {
        pedidoAdminService.actualizar(pedidoAdmin);
    }
    //	BORRAR UN PEDIDO
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        pedidoAdminService.eliminar(id);
    }

}
