package co.edu.udem.isv.soap.endpoint;

import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.GetUserRequest;
import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.GetUserResponse;
import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.PostUser;
import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.UserErrorResponse;
import co.edu.udem.isv.soap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint("users")
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://www.udem.edu.co/isv/soap/gen";

    private UserRepository userRepository;

    @Autowired
    public UserEndpoint(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userRepository.findUser(request.getDNI()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postUser")
    @ResponsePayload
    public GetUserResponse createUser(@RequestPayload PostUser request) {
        GetUserResponse response = new GetUserResponse();
        try {
            response.setUser(userRepository.createUser(request.getUser()));
            return response;
        }
        catch (Exception e) {
            e.printStackTrace();
            UserErrorResponse errorResponse = new UserErrorResponse();
            errorResponse.setMessage("User created");
            errorResponse.setStatus("409");
            return null;
        }
    }
}
