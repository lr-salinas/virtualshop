package backend.project.bl;

import backend.project.dao.TransactionDao;
import backend.project.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionBl {
    private TransactionDao transactionDao;

    @Autowired
    public TransactionBl(TransactionDao transactionDao){
        this.transactionDao = transactionDao;
    }

    public Transaction createTransaction (Transaction transaction){
        //Registramos de la transaccion a la base de datos
        this.transactionDao.create(transaction);

        //Obtenemos la llave primaria generada
        Integer lastPrimaryKey = this.transactionDao.getLastInsertId();

        transaction.setTxId(lastPrimaryKey);

        return transaction;
    }
}
