package br.com.jdlm.stock_service.domain.repository;

import br.com.jdlm.stock_service.domain.entity.stock.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockRepository extends JpaRepository<Stock, UUID> {

    Stock findByProductId(UUID productId);

}
