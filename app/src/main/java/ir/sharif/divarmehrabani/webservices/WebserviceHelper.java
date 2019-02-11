package ir.sharif.divarmehrabani.webservices;

import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterProcess;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterResponse;
import webservices.rest_auth.login.LoginResponse;

import java.io.IOException;

public class WebserviceHelper {

    public static RegisterResponse register(String name, String email, String password, String lastName) throws IOException, WebserviceException {
        RegisterProcess process = new RegisterProcess(name, email, password, lastName);
        return process.process();
    }

    public static LoginResponse register(String name, String email, String password, String lastName) throws IOException, WebserviceException {
        RegisterProcess process = new RegisterProcess(name, email, password, lastName);
        return process.process();
    }

}
