package pl.nk.opensocial.model;

//CHECKSTYLE:DUPLICATE OFF

public class SchoolImpl implements School {

  private String id;
  private String name;
  private String city;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(final String id) {
    this.id = id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String getCity() {
    return city;
  }

  @Override
  public void setCity(final String city) {
    this.city = city;
  }

}
