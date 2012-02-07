package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.inject.ImplementedBy;

//CHECKSTYLE:DUPLICATE OFF

@Exportablebean
@ImplementedBy(GiftImpl.class)
public interface Gift {

  public static enum Field {
    ID("id"),
    MESSAGE("message");

    private final String jsonString;

    private Field(final String jsonString) {
      this.jsonString = jsonString;
    }

    @Override
    public String toString() {
      return jsonString;
    }
  }

  String getId();

  void setId(String id);

  String getMessage();

  void setMessage(String message);

}
