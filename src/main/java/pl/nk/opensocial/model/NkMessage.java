package pl.nk.opensocial.model;

import org.apache.shindig.social.opensocial.model.Message;

public interface NkMessage extends Message {

  public Long getNkCreatedTime();

  public void setNkCreatedTime(final Long createdTime);

  public static enum NkField {
    NK_CREATED_TIME("nkCreatedTime");
    /**
     * The field name that the instance represents.
     */
    private final String jsonString;

    /**
     * create a field base on the an element name.
     * 
     * @param jsonString
     *          the name of the element
     */
    private NkField(final String jsonString) {
      this.jsonString = jsonString;
    }

    /**
     * @return a string representation of the enum.
     */
    @Override
    public String toString() {
      return this.jsonString;
    }
  }
}
