/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ejula
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.example.soapclient");
        return marshaller;
    }

    @Bean
    public SoapClient soapClient(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setDefaultUri("URL_DEL_PI_SOAP_DEL_BANCO");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}


    
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    public Object getExchangeRate() {
        // Crear el objeto de solicitud y configurar los detalles necesarios
        Object request = new Object(); // Reemplazar con la clase de solicitud generada
        return getWebServiceTemplate()
                .marshalSendAndReceive("URL_DEL_PI_SOAP_DEL_BANCO", request, new SoapActionCallback("SOAP_ACTION"));
    }
}
