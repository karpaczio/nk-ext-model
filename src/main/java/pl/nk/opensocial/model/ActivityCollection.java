package pl.nk.opensocial.model;

import java.util.Set;

import org.apache.shindig.protocol.model.Exportablebean;
import org.apache.shindig.social.opensocial.model.EnumUtil;

import com.google.inject.ImplementedBy;

/**
 * 
 * @author Jakub Białek
 * 
 */
@Exportablebean
@ImplementedBy(ActivityCollectionImpl.class)
public interface ActivityCollection {

  /**
   * An enumeration of field names in a activity collection.
   */
  public static enum Field {
    APP_ID("appId"),
    /** the field name for total number of activities. */
    TOTAL("total"),
    /** the field name for the total number of unread activities. */
    UNREAD("unread"),
    /** the field name for the timestamp which indicate when activities from this collection were read. */
    LAST_READ_TIME("lastReadTime");

    /**
     * the name of the field.
     */
    private final String jsonString;

    public static final Set<String> ALL_FIELDS = EnumUtil.getEnumStrings(Field.values());

    /**
     * Create a field based on a name.
     * 
     * @param jsonString
     *          the name of the field
     */
    private Field(final String jsonString) {
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

  /**
   * Gets the APP ID of the activity collection, currently only sledzik.app is supported.
   * 
   * @return the APP ID of the activity collection
   */
  String getAppId();

  /**
   * Sets the unique APP ID of the activity collection.
   * 
   * @param appId
   *          the APP ID value to set
   */
  void setAppId(String appId);

  /**
   * Gets the total number of activities for this collection.
   * 
   * @return the total number of activities
   */
  Integer getTotal();

  /**
   * Sets the total number of activities for this collection
   * 
   * @param total
   *          the total number of activities
   */
  void setTotal(Integer total);

  /**
   * Gets the total number of unread activities.
   * 
   * @return the total number of unread activities
   */
  Integer getUnread();

  /**
   * Sets the total number of unread activities.
   * 
   * @param unread
   *          the number of unread activities
   */
  void setUnread(Integer unread);

  /**
   * Gets the time when activities from this collection were read.
   * 
   * @return time of the last read.
   */
  Long getLastReadTime();

  /**
   * Sets the time when activities from this collection were read.
   * 
   * @param timestamp
   *          time of the last read.
   */
  void setLastReadTime(Long timestamp);

}
