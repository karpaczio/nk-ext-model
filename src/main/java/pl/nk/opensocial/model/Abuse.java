package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.inject.ImplementedBy;

// CHECKSTYLE:DUPLICATE OFF

/**
 * 
 * @author Jakub Białek
 * 
 */
@Exportablebean
@ImplementedBy(AbuseImpl.class)
public interface Abuse {

  public static enum Field {
    BODY("body");

    private final String jsonString;

    private Field(final String jsonString) {
      this.jsonString = jsonString;
    }

    @Override
    public String toString() {
      return jsonString;
    }
  }

  String getBody();

  void setBody(String body);

}
