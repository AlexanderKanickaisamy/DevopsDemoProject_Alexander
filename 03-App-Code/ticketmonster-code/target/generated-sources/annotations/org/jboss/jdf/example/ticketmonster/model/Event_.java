package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SingularAttribute<Event, Boolean> major;
	public static volatile SingularAttribute<Event, String> name;
	public static volatile SingularAttribute<Event, String> description;
	public static volatile SingularAttribute<Event, Long> id;
	public static volatile SingularAttribute<Event, EventCategory> category;
	public static volatile SingularAttribute<Event, MediaItem> picture;

}

