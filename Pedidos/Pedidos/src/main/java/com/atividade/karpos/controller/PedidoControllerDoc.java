package com.atividade.karpos.controller;

import com.atividade.karpos.model.Pedido;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@OpenAPIDefinition(
        info = @Info(
                title = "API de Pedidos",
                description = "Documentação da API do sistema de pedidos"
        ),
        tags = {
                @Tag(name = "Pedidos", description = "Operações relacionadas a pedidos")
        }
)
public interface PedidoControllerDoc {

    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "O pedido foi criado com sucesso!",
                    content = {
                            @Content(
                                    schema = @Schema(implementation = Pedido.class),
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    examples = {
                                            @ExampleObject(
                                                    name = "Exemplo de sucesso",
                                                    value = """
                                                            {
                                                                "id": "1",
                                                                "cliente": "Cliente Novo",
                                                                "pedido": "Mouse",
                                                                "preco": "10.50",
                                                                "tipoEntrega": "Sedex"
                                                            }
                                                            """
                                            )
                                    }
                            )
                    }
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Requisição inválida",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Erro interno no servidor",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    ResponseEntity<String> calcularFrete(
            @Parameter(description = "Dados do pedido para cálculo do frete", required = true)
            @Valid @RequestBody Pedido request
    );
}