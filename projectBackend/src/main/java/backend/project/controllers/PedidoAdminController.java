package backend.project.controllers;

import backend.project.entity.Categoria;
import backend.project.entity.PedidoAdmin;
import backend.project.entity.Producto;
import backend.project.service.CategoriaService;
import backend.project.service.PedidoAdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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


    @Operation(summary = "Get order list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the order",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = PedidoAdmin.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Order not found",
                    content = @Content) })
    //	OBTENER TODOS LOS PEDIDOS
    @GetMapping
    public List<PedidoAdmin> ListarTodos() {

        return pedidoAdminService.BuscarTodos();
    }


    @Operation(summary = "Update order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the order",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = PedidoAdmin.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Order not found",
                    content = @Content) })
    //	ACTUALIZAR UN PEDIDO EXISTENTE
    @PutMapping
    public void actualizarPedidoAdmin(@RequestBody PedidoAdmin pedidoAdmin) {
        pedidoAdminService.actualizar(pedidoAdmin);
    }

    @Operation(summary = "Delete order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the order",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = PedidoAdmin.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Order not found",
                    content = @Content) })
    //	BORRAR UN PEDIDO
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        pedidoAdminService.eliminar(id);
    }

}
