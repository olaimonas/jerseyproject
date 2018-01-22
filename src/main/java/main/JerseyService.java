package main;

import org.jvnet.hk2.annotations.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service
@Path("titta")
public class JerseyService {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMsg() {
        return "Titta, du har ditt program köras!";
    }
}
