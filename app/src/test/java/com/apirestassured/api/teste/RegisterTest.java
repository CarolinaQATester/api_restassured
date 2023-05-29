package com.apirestassured.api.teste;

import com.apirestassured.api.dominio.Usuario;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class RegisterTest extends BaseTest{
    private static final String REGISTRA_USUAIRO_ENDPOINT = "/register";
    @Test
    public void naodeveRealizarUmRegistroSemPass(){
        Usuario usuario = new Usuario("carolina", "analista de teste","teste@teste.com", "");
        given().body(usuario).post(REGISTRA_USUAIRO_ENDPOINT).then().statusCode(HttpStatus.SC_BAD_REQUEST).body("error", is("Missing password"));
    }



}
