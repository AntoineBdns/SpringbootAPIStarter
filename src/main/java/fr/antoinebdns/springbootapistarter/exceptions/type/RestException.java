package fr.antoinebdns.springbootapistarter.exceptions.type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class RestException {
    private String exCode;
    private String exMessage;
    private Exception exThrown;
}
