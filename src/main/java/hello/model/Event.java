package hello.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "events")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String name;
	private String venueCode;
	private LocalDateTime dateTime;
	
	@Column(precision=7, scale=2)
	private BigDecimal price;
	
    public Event() {}

    public Event(Long id, String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getVenueCode() {
		return venueCode;
	}

	public void setVenue(String venueCode) {
		this.venueCode = venueCode;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDate(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

    


}
