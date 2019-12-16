package com.demo.revolut.controller;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/walletps")
public class WalletPsController {
    @PUT
    public void transfer() {}

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInfo() {
        return Response.status(200).entity("OK").build();
    }
}
