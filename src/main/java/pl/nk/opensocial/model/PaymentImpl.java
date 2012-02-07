package pl.nk.opensocial.model;

public class PaymentImpl implements Payment {

  private Integer amount;
  private String message;

  @Override
  public Integer getAmount() {
    return amount;
  }

  @Override
  public void setAmount(final Integer amount) {
    this.amount = amount;
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
