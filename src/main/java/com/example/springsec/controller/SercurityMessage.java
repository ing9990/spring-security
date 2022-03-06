package com.example.springsec.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;

/**
 * @author TaeWK
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SercurityMessage {

    private Authentication auth;
    private String message;

}
