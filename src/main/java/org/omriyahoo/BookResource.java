package org.omriyahoo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getBooks() {
//        return  Book.findAll(Sort.by("title")).list();
        return Book.findAll().list();
    }

    @GET
    @Path("{id}")
    public Book getBookById(@PathParam("id") Long id) {
        return Book.findById(id);
    }

    @GET
    @Path("/methodName")
    public String again() {
        return new Throwable().getStackTrace()[0].getMethodName();
    }

}
