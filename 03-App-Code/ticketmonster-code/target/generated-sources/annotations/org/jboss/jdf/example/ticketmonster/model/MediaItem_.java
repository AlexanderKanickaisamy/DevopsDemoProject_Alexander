package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MediaItem.class)
public abstract class MediaItem_ {

	public static volatile SingularAttribute<MediaItem, MediaType> mediaType;
	public static volatile SingularAttribute<MediaItem, Long> id;
	public static volatile SingularAttribute<MediaItem, String> url;

}

