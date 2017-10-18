package service;

import metier.Compte;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mostafa ACHRAF on 9/27/2017.
 */

@Path("/banque")
public class BanqueService {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "test2";
    }

    @GET
    @Path("/conversion/{montant}")
    @Produces(MediaType.APPLICATION_JSON)
    public double conversion(@PathParam("montant") double mt) {
        return mt * 10;
    }

    @GET
    @Path("/compte")
    @Produces(MediaType.APPLICATION_XML)
    public Compte getCompte(@QueryParam(value = "code") int code) {
        return new Compte(code, Math.random() * 9000);
    }


    @GET
    @Path("/fruits")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> list() {
        List<String> fruits = new ArrayList<String>();

        fruits.add("orange");
        fruits.add("apple");
        fruits.add("pineApple");
        fruits.add("strawberry");

        return fruits;
    }

}
