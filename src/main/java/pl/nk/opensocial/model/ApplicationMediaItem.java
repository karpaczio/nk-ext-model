package pl.nk.opensocial.model;

import org.apache.shindig.common.JsonProperty;
import org.apache.shindig.protocol.model.Exportablebean;
import org.apache.shindig.social.opensocial.model.Album;
import org.apache.shindig.social.opensocial.model.MediaItem;

import com.google.inject.ImplementedBy;

/**
 * 
 * @author Jakub Białek
 * 
 */
@Exportablebean
@ImplementedBy(ApplicationMediaItemImpl.class)
public interface ApplicationMediaItem extends MediaItem {

  @JsonProperty("nk_addedBy")
  String getAddedBy();

  @JsonProperty("nk_addedBy")
  void setAddedBy(final String addedBy);

  @JsonProperty("nkNumSuperVotes")
  String getNumSuperVotes();

  @JsonProperty("nkNumSuperVotes")
  void setNumSuperVotes(final String numSuperVotes);

  Long getNkCreatedTime();

  void setNkCreatedTime(final Long createdTime);

  Long getNkVotesSum();

  void setNkVotesSum(final Long votesSum);

  Album getNkAlbum();

  void setNkAlbum(final Album nkAlbum);

  public static enum NkField {
    ADDED_BY("nk_addedBy"),
    NUM_SUPER_VOTES("nkNumSuperVotes"),
    NK_CREATED_TIME("nkCreatedTime"),
    NK_VOTES_SUM("nkVotesSum"),
    NK_ALBUM("nkAlbum");

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
