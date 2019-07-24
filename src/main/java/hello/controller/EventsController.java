package hello.controller;

import hello.errors.EventNotFoundException;
import hello.model.Event;
import hello.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class EventsController {

    @Autowired
    EventsRepository eventsRepository;

    @GetMapping("/events")
    public List<Event> fetchEvents() {
        return eventsRepository.findAll();
    }
    
    @GetMapping("/events/{idEvent}")
    public Event fetchEvent(@PathVariable Long idEvent) {
    	Optional<Event> eventOpt = eventsRepository.findById(idEvent);
    	if(!eventOpt.isPresent()) {
    		throw new EventNotFoundException();
    	}
    	Event e = eventOpt.get();
    	return e;	
    }
    
    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event) {
    	return eventsRepository.save(event);
    }
    
    @PutMapping("/events/{idEvent}")
    public Event editEvent(@PathVariable Long idEvent, @RequestBody Event event) {
    	Optional<Event> eventOpt = eventsRepository.findById(idEvent);
    	if(!eventOpt.isPresent()) {
    		throw new EventNotFoundException();
    	}
    	event.setId(idEvent);
    	return eventsRepository.save(event);
    }
    
    @DeleteMapping("/events/{idEvent}")
    public void deleteEvent(@PathVariable Long idEvent) {
    	eventsRepository.deleteById(idEvent);
    }
    
}

