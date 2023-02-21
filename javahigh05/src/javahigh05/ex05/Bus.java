package javahigh05.ex05;

public class Bus {
	private String destination;
	private Integer busStop;
	
	public Bus(String destination, Integer busStop) {
		super();
		this.destination = destination;
		this.busStop = busStop;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getBusStop() {
		return busStop;
	}

	public void setBusStop(Integer busStop) {
		this.busStop = busStop;
	}
	
	
	 
}
