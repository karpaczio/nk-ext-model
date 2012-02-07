package pl.nk.opensocial.model;

// CHECKSTYLE:DUPLICATE OFF

public class GiftImpl implements Gift {

  private String id;
  private String message;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(final String id) {
    this.id = id;
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public void setMessage(final String message) {
    this.message = message;
  }

}
