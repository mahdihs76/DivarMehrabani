package ir.sharif.divarmehrabani.webservices;

import ir.sharif.divarmehrabani.webservices.base.WebserviceException;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterProcess;
import ir.sharif.divarmehrabani.webservices.webservices.rest_auth.register.RegisterResponse;
import webservices.rest_auth.login.LoginResponse;
import webservices.rest_auth.read_charities.ReadCharitiesProcess;

import java.io.IOException;
import java.util.List;

public class WebserviceHelper {

    public static RegisterResponse register(String name, String email, String password, String lastName) throws IOException, WebserviceException {
        RegisterProcess process = new RegisterProcess(name, email, password, lastName);
        return process.process();
    }

    public static LoginResponse login(Boolean sucess) throws IOException, WebserviceException {
        LoginProcess process = new LoginProcess(sucess);
        return process.process();
    }

    public static SignupResponse signup(int age, String city, int district, String gender, String interests, String name, String phone, List<String> professions, String province) throws IOException, WebserviceException {
        SignupProcess process = new SignupProcess(age,city,district,gender,interests,name,phone,professions,province);
        return process.process();
    }

    public static readcharitiesResponse readcharities(String filter, int offset, int pageNumber, int pageSize, Boolean paged, Boolean sort, Boolean sort1, Boolean unpaged) throws IOException, WebserviceException {
        ReadCharitiesProcess process = new ReadCharitiesProcess(filter, offset, pageNumber, pageSize, paged, sort, sort1, unpaged);
        return process.process();
    }

}
