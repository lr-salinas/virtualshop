package backend.project.controllers;



import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.project.entity.Receipt;
import backend.project.model.ReceiptModel;
import backend.project.service.ReceiptService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/receipt")

public class ReceiptController{
    @Autowired
    private ReceiptService receiptService;


    @GetMapping
    public List<Receipt> ListarTodos() {

        return receiptService.BuscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Receipt> getById (@PathVariable Integer id) {

        return (Optional<Receipt>) receiptService.getById(id);
    }

    @PostMapping
    public Receipt guardarReceipt(@RequestBody Receipt receipt) throws ServerException {
        System.out.println(receipt);
        receiptService.guardar(receipt);
        if (receipt == null) {
            throw new ServerException(null);
        }
        else {
            return receipt;
        }
    }



}

