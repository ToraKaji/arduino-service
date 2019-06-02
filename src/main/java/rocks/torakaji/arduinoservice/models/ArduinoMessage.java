package rocks.torakaji.arduinoservice.models;

public class ArduinoMessage {
  String message;

  public ArduinoMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
