/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ejula
 */
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExchangeRateService {

    private final SoapClient soapClient;
    private final ExchangeRateRequestRepository requestRepository;
    private final ExchangeRateResponseRepository responseRepository;

    public ExchangeRateService(SoapClient soapClient, ExchangeRateRequestRepository requestRepository, ExchangeRateResponseRepository responseRepository) {
        this.soapClient = soapClient;
        this.requestRepository = requestRepository;
        this.responseRepository = responseRepository;
    }

    @Transactional
    public ExchangeRateResponse getExchangeRate() {
        // Registrar la solicitud
        ExchangeRateRequest request = new ExchangeRateRequest();
        request.setRequestDetails("Detalles de la solicitud"); // Actualizar con detalles relevantes
        requestRepository.save(request);

        // Obtener la respuesta del servicio SOAP
        Object response = soapClient.getExchangeRate();

        // Registrar la respuesta
        ExchangeRateResponse exchangeRateResponse = new ExchangeRateResponse();
        exchangeRateResponse.setResponseDetails(response.toString());
        responseRepository.save(exchangeRateResponse);

        return exchangeRateResponse;
    }

    public List<ExchangeRateResponse> getAllResponses() {
        return responseRepository.findAll();
    }

    public ExchangeRateResponse getLastResponse() {
        return responseRepository.findTopByOrderByIdDesc();
    }
}


