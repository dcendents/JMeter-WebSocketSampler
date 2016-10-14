package JMeter.plugins.functional.samplers.websocket;

import java.util.Deque;

import org.apache.jmeter.samplers.SampleResult;

public class WebSocketSampleResult extends SampleResult {

	private static final long serialVersionUID = 1L;

	protected int messageCounter;
	protected Deque<String> responeBacklog;

	public int getMessageCounter() {
		return messageCounter;
	}

	public void setMessageCounter(int messageCounter) {
		this.messageCounter = messageCounter;
	}

	public Deque<String> getResponeBacklog() {
		return responeBacklog;
	}

	public void setResponeBacklog(Deque<String> responeBacklog) {
		this.responeBacklog = responeBacklog;
	}
	
}
