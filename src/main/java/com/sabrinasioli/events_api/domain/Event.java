package com.sabrinasioli.events_api.domain;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "event")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

	@Id
	@GeneratedValue
	private UUID id;

	private String tittle;
	
	private String description;
	
	private String img_url;
	
	private String event_url;
	
	private Boolean remote;
	
	private Date date;

}
