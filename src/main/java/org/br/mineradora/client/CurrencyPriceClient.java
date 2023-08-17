package org.br.mineradora.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.br.mineradora.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestPath;

@RegisterRestClient
@Path("/last")
public interface CurrencyPriceClient {

    @GET
    @Path("/{pair}")
    CurrencyPriceDTO getPriceByPair(@RestPath String pair);

}