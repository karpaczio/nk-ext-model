package pl.nk.opensocial.model;

import java.util.List;

import org.apache.shindig.protocol.model.Exportablebean;
import org.apache.shindig.social.opensocial.model.Activity;

import com.google.inject.ImplementedBy;

/**
 * 
 * @author Jakub Białek
 * 
 */
@Exportablebean
@ImplementedBy(NkActivityImpl.class)
public interface NkActivity extends Activity {

  public static enum Field {
    /** the json field for appId. */
    APP_ID("appId"),
    /** the json field for body. */
    BODY("body"),
    /** the json field for bodyId. */
    BODY_ID("bodyId"),
    /** the json field for externalId. */
    EXTERNAL_ID("externalId"),
    /** the json field for id. */
    ID("id"),
    /** the json field for updated. */
    LAST_UPDATED("updated"), /* Needed to support the RESTful api */
    /** the json field for mediaItems. */
    MEDIA_ITEMS("mediaItems"),
    /** the json field for postedTime. */
    POSTED_TIME("postedTime"),
    /** the json field for priority. */
    PRIORITY("priority"),
    /** the json field for streamFaviconUrl. */
    STREAM_FAVICON_URL("streamFaviconUrl"),
    /** the json field for streamSourceUrl. */
    STREAM_SOURCE_URL("streamSourceUrl"),
    /** the json field for streamTitle. */
    STREAM_TITLE("streamTitle"),
    /** the json field for streamUrl. */
    STREAM_URL("streamUrl"),
    /** the json field for templateParams. */
    TEMPLATE_PARAMS("templateParams"),
    /** the json field for title. */
    TITLE("title"),
    /** the json field for titleId. */
    TITLE_ID("titleId"),
    /** the json field for url. */
    URL("url"),
    /** the json field for userId. */
    USER_ID("userId"),
    /** amount of comments. */
    NK_COMMENTS_COUNT("nkCommentsCount"),
    /** amount of stars. */
    NK_STARS_COUNT("nkStarsCount"),
    /** list of stars' authors. */
    NK_STARS_AUTHORS_IDS("nkStarsAuthorsIds"),
    /** identifier of application, that generated this shout. */
    NK_APP_ID("nkAppId"),
    /** identifier of group, that generated this shout. */
    NK_GROUP_ID("nkGroupId"),
    /** url to image of this shout. */
    NK_IMAGE_URL("nkImageUrl"),
    /** default description of this shout. */
    NK_DEFAULT_DESCRIPTION("nkDefaultDescription"),
    /** url of the site recommended in this shout. */
    NK_SITE_URL("nkSiteUrl"),
    /** description of the site recommended in this shout. */
    NK_SITE_DESCRIPTION("nkSiteDescription"),
    /** title of the site recommended in this shout. */
    NK_SITE_TITLE("nkSiteTitle"),
    /** url to image of the site recommended in this shout. */
    NK_SITE_IMAGE_URL("nkSiteImageUrl");

    /**
     * The json field that the instance represents.
     */
    private final String jsonString;

    /**
     * create a field base on the a json element.
     * 
     * @param jsonString
     *          the name of the element
     */
    private Field(final String jsonString) {
      this.jsonString = jsonString;
    }

    /**
     * emit the field as a json element.
     * 
     * @return the field name
     */
    @Override
    public String toString() {
      return jsonString;
    }
  }

  Integer getNkCommentsCount();

  void setNkCommentsCount(final Integer nkCommentsCount);

  Integer getNkStarsCount();

  void setNkStarsCount(final Integer nkStarsCount);

  List<String> getNkStarsAuthorsIds();

  void setNkStarsAuthorsIds(final List<String> nkStarsAuthorsIds);

  String getNkAppId();

  void setNkAppId(final String nkAppId);

  String getNkGroupId();

  void setNkGroupId(final String nkGroupId);

  List<String> getNkOrigins();

  void setNkOrigins(final List<String> nkOrigins);

  void setNkImageUrl(String nkImageUrl);

  String getNkImageUrl();

  void setNkDefaultDescription(String nkDefaultDescription);

  String getNkDefaultDescription();

  void setNkSiteUrl(String nkSiteUrl);

  String getNkSiteUrl();

  void setNkSiteDescription(String nkSiteDescription);

  String getNkSiteDescription();

  void setNkSiteTitle(String nkSiteTitle);

  String getNkSiteTitle();

  void setNkSiteImageUrl(String nkSiteImageUrl);

  String getNkSiteImageUrl();

}
