package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.inject.ImplementedBy;

//CHECKSTYLE:DUPLICATE OFF

/**
 * OpenSocial payment object. This is used only for REST calls, so only a few fields are defined (those that are defined
 * match JS Payment object).
 * 
 * @author Janusz Dziemidowicz
 */
@Exportablebean
@ImplementedBy(PaymentImpl.class)
public interface Payment {

  /**
   * All of the fields Payment object can have.
   */
  public static enum Field {
    /**
     * Amount of EGB that will be transferred.
     */
    AMOUNT("amount"),
    /**
     * Message that will be visible to user.
     */
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

  Integer getAmount();

  void setAmount(Integer amount);

  String getMessage();

  void setMessage(String message);

}
