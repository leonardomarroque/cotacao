package org.br.mineradora.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class CurrencyPriceDTO {

    @JsonProperty("USDBRL")
    public USDBRL USDBRL;
}
