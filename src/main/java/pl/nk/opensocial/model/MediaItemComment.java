package pl.nk.opensocial.model;

import org.apache.shindig.protocol.model.Exportablebean;

import com.google.inject.ImplementedBy;

/**
 * 
 * @author Jakub Białek
 * 
 */
@Exportablebean
@ImplementedBy(MediaItemCommentImpl.class)
public interface MediaItemComment extends Comment {

}
