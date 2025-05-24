package com.academy.security_jwt.controller;

import com.academy.security_jwt.dto.JwtRequestDto;
import com.academy.security_jwt.dto.JwtResponseDto;
import com.academy.security_jwt.util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final JwtTokenUtil jwtTokenUtil;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/auth")
    public JwtResponseDto auth(@RequestBody
                     JwtRequestDto requestDto) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(requestDto.getUsername(), requestDto.getPassword()));

        String token = jwtTokenUtil.generateToken(requestDto.getUsername());

        return new JwtResponseDto(token);
    }
}
