package pl.nk.opensocial.model;

/**
 * 
 * @author Jakub Białek
 * 
 */
public class AbuseImpl implements Abuse {

  private String body;

  @Override
  public String getBody() {
    return body;
  }

  @Override
  public void setBody(final String body) {
    this.body = body;
  }

}
