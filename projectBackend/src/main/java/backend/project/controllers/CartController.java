package backend.project.controllers;

import backend.project.dto.CartDto;
import backend.project.entity.Cart;
import backend.project.entity.Categoria;
import backend.project.entity.Producto;
import backend.project.entity.User;
import backend.project.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cart")

public class CartController {
    @Autowired
    private CartService cartService;

    @Operation(summary = "Get cart list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the cart",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Cart.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Cart not found",
                    content = @Content) })
    //	Obtener lista de productos


   /*  @GetMapping
    public List<Cart> ListarProd() {

        return cartService.SearchProd();
    }


    @RequestMapping("/cartAdmin")
    public ResponseEntity<List<CartDto>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<CartDto>>(cartService.ObtenerCompra(), HttpStatus.OK);
    }

*/
    @GetMapping
    public ResponseEntity<List<CartDto>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<CartDto>>(cartService.ObtenerCompra(), HttpStatus.OK);
    }






    @Operation(summary = "Get a cart by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the cart",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Cart.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Cart not found",
                    content = @Content) })


    //	OBTENER PRODUCTO POR ID
    @GetMapping("/{id}")
    public Optional<Cart> getById (@Parameter(description = "id of cart to be searched")
            @PathVariable Integer id) {

        return (Optional<Cart>) cartService.getById(id);
    }








    @Operation(summary = "Add product to cart")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the cart",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Cart.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Cart not found",
                    content = @Content) })
    //	Agregar producto al carrito
    @PostMapping
    public Cart saveProd(@RequestBody Cart cart) throws ServerException {
        System.out.println(cart);
        cartService.save(cart);
        if (cart == null) {
            throw new ServerException(null);
        }
        else {
            return cart;
        }
    }









    @Operation(summary = "Delete product to cart")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the cart",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Cart.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Cart not found",
                    content = @Content) })
    //	Borrar producto del carrito
    @DeleteMapping("/{id}")
    public void delete(@Parameter(description = "id of cart to be searched")
            @PathVariable("id") int id) {

        cartService.delete(id);
    }




}
