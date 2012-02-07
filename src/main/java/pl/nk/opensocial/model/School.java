package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.inject.ImplementedBy;

//CHECKSTYLE:DUPLICATE OFF

@Exportablebean
@ImplementedBy(SchoolImpl.class)
public interface School {

  public static enum Field {
    ID("id"),
    NAME("name"),
    CITY("city");

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

  String getName();

  void setName(String name);

  String getCity();

  void setCity(String city);

}
