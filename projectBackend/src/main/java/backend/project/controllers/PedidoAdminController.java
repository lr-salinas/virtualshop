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


    //	AGREGAR UN NUEVO PRODUCTO
    @PostMapping
    public PedidoAdmin guardarPedido(@RequestBody PedidoAdmin pedidoAdmin) throws ServerException {
        System.out.println(pedidoAdmin);
        pedidoAdminService.guardar(pedidoAdmin);
        if (pedidoAdmin== null) {
            throw new ServerException(null);
        }
        else {
            return pedidoAdmin;
        }
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
