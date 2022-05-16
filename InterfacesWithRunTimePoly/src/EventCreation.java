
public class EventCreation implements EventInterface{

	@Override
	public Event create(int id, String name, String desc) {
		return new Event(id,name,desc);
	}

}
