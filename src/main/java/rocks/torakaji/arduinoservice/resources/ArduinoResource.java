package rocks.torakaji.arduinoservice.resources;

import java.util.Collections;
import java.util.List;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rocks.torakaji.arduinoservice.models.ArduinoMessage;

@RestController
@RequestMapping("/messages")
public class ArduinoResource {

  @RequestMapping("/{messageNumber}")
  public List<ArduinoMessage> getMessage(@Nullable @PathVariable("messageNumber") String message){
    return Collections.singletonList(
        new ArduinoMessage("This is a test message!")
    );
  }
}
