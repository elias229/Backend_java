/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ejula
 */
public class ExchangeRateRequestRepository {
    
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRequestRepository extends JpaRepository<ExchangeRateRequest, Long> {
}

    
}

