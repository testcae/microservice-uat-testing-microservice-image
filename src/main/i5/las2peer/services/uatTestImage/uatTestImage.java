package i5.las2peer.services.uatTestImage;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;
import i5.las2peer.services.uatTestImage.database.DatabaseManager;
import java.sql.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;
 

/**
 *
 * uat-testing-microservice-image
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("image2/")
@ManualDeployment
public class uatTestImage extends RESTService {


  /*
   * Database configuration
   */
  private String jdbcDriverClassName;
  private String jdbcLogin;
  private String jdbcPass;
  private String jdbcUrl;
  private static DatabaseManager dbm;



  public uatTestImage() {
	super();
    // read and set properties values
    setFieldValues();
        // instantiate a database manager to handle database connection pooling and credentials
    dbm = new DatabaseManager(jdbcDriverClassName, jdbcLogin, jdbcPass, jdbcUrl);
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "uat-testing-microservice-image", version = "1",
          description = "Microservice for image for UAT testing",
          termsOfService = "LICENSE.txt",
          contact = @Contact(name = "Melisa Cecilia", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/testcae/microservice-uat-testing-microservice-image/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final uatTestImage service = (uatTestImage) Context.getCurrent().getService();

      /**
   * 
   * postImage
   *
   * 
   * @param payloadPostImage Payload post image for uat testing image aaaa a JSONObject
   * 
   * @return Response Response post image for uat testing image
   * 
   */
  @POST
  @Path("/postImage")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Response post image for uat testing image")
  })
  @ApiOperation(value = "postImage", notes = "$HTTP_Method_Description$")
  public Response postImage(classes.image payloadPostImage) {

    // responsePostImage
    boolean responsePostImage_condition = true;
    if(responsePostImage_condition) {
      JSONObject resultPostImage = new classes().new image().toJSON();
      return Response.status(HttpURLConnection.HTTP_OK).entity(resultPostImage.toJSONString()).build();
    }
    return null;
  }

  /**
   * 
   * getImage
   *
   * 
   *
   * 
   * @return Response Response get image UAT testing
   * 
   */
  @GET
  @Path("/getImage")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Response get image UAT testing")
  })
  @ApiOperation(value = "getImage", notes = "$HTTP_Method_Description$")
  public Response getImage() {
 
    try {

    } catch(Exception e) {
      JSONObject result = new JSONObject(); 
      return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(result.toJSONString()).build();
    } 
    
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

}
