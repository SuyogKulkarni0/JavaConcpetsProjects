
public class Event {
	private int eventId;
	private String eventName;
	private String eventDescr;
	public Event(int id,String name,String desc)
	{
		this.eventId=id;
		this.eventDescr=desc;
		this.eventName=name;
	}
	public int getId()
	{
		return eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public String getEventDescr() {
		return eventDescr;
	}

}
