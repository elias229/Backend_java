/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ejula
 */

    
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeRateRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String requestDetails;

    // Getters and Setters
}


@Entity 
public class ExchangeRateResponse { 
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
private String responseDetails; 
// Getters and Setters }
   }     


