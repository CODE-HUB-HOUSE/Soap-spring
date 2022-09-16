package co.edu.udem.isv.soap.repository;

import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.Tag;
import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.User;
import co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user.UserResponseDTO;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initData() {
        User bv = new User();
        bv.setDNI("1001234234");
        bv.setName("Brandon Velasquez Osorio");
        bv.setEmail("Brandon.velasquezz@gmail.com");
        bv.setTag(Tag.ADMIN01OPC);
        bv.setPassword("3904Q3JRFQER");
        users.put(bv.getDNI(), bv);
        User sg = new User();
        sg.setDNI("12830123");
        sg.setName("Sebastian Guzman");
        sg.setEmail("Sebas.guzman@gmail.com");
        sg.setTag(Tag.TEACH04SIS);
        sg.setPassword("3904Q3JasdaQER");
        users.put(sg.getDNI(),sg);
    }

    public UserResponseDTO findUser(String dni) {
        User userFound = users.get(dni);
        try {
            UserResponseDTO userResponseDTO = new UserResponseDTO();
            userResponseDTO.setName(userFound.getName());
            userResponseDTO.setEmail(userFound.getEmail());
            userResponseDTO.setTag(userFound.getTag());
            userResponseDTO.setPhoneNumber(userFound.getPhoneNumber());
            return userResponseDTO;
        }
        catch (NullPointerException e){
            return null;
        }

    }

    public UserResponseDTO createUser(User user) throws Exception {
        if (this.findUser(user.getDNI()) == null){
            users.put(user.getDNI(), user);
            UserResponseDTO userResponseDTO = new UserResponseDTO();
            userResponseDTO.setName(user.getName());
            userResponseDTO.setEmail(user.getEmail());
            userResponseDTO.setTag(user.getTag());
            userResponseDTO.setPhoneNumber(user.getPhoneNumber());
            return userResponseDTO;
        } else{
          throw new Exception();
        }

    }
}

