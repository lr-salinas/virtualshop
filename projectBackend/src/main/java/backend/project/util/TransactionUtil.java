package backend.project.util;

import backend.project.model.Transaction;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class TransactionUtil {

    public static Transaction createTransaction(HttpServletRequest request){
        Transaction transaction = new Transaction();
        transaction.setTxDate(new Date());
        transaction.setTxHost(request.getRemoteHost());
        transaction.setTxUserId(0);
        return transaction;

    }

}
