package backend.project.controllers;

import backend.project.dto.OrderDto;
import backend.project.entity.Order;
import backend.project.entity.PedidoAdmin;
import backend.project.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/orderList")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Operation(summary = "Get order list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the order",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Order.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Order not found",
                    content = @Content) })
    //	OBTENER TODOS LOS PEDIDOS
    @GetMapping
    public ResponseEntity<List<OrderDto>> getDeptEmployeesInnerJoin(){
        return new ResponseEntity<List<OrderDto>>(orderService.ObtenerPedidos(), HttpStatus.OK);
    }
}
