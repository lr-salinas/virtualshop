package backend.project.dao;

import backend.project.model.Transaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionDao {
    public Integer create(Transaction transaction);
    public Integer getLastInsertId();
}
