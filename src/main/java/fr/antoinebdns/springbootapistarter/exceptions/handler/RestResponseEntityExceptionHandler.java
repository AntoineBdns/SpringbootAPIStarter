package fr.antoinebdns.springbootapistarter.exceptions.handler;

import fr.antoinebdns.springbootapistarter.exceptions.type.RestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@Slf4j
public class RestResponseEntityExceptionHandler{

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected RestException handleException(Exception ex){
        log.error(ex.getMessage(),ex);
        return RestException.builder()
                .exCode("001")
                .exMessage("Une erreur est survenue")
                .exThrown(ex)
                .build();
    }
}
