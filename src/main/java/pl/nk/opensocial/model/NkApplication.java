package pl.nk.opensocial.model;

import java.util.Set;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.common.collect.ImmutableSet;
import com.google.inject.ImplementedBy;

@Exportablebean
@ImplementedBy(NkApplicationImpl.class)
public interface NkApplication {
  public static enum Field {
    ID("id"),
    NAME("name"),
    DESCRIPTION("description"),
    THUMBNAIL_URL("thumbnailUrl"),
    URL("url");

    private final String jsonString;

    private Field(final String jsonString) {
      this.jsonString = jsonString;
    }

    @Override
    public String toString() {
      return jsonString;
    }

    public static final Set<String> DEFAULT_FIELDS = ImmutableSet.of(ID.toString(), NAME.toString(), DESCRIPTION
        .toString(), THUMBNAIL_URL.toString());
  }

  String getId();

  void setId(String id);

  String getName();

  void setName(String name);

  String getDescription();

  void setDescription(String description);

  String getThumbnailUrl();

  void setThumbnailUrl(String thumbnailUrl);

  String getUrl();

  void setUrl(String url);
}
