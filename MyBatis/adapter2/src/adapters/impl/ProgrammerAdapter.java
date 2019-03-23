package adapters.impl;

import adapters.IWorkerAdapter;
import worker.IProgrammer;

//每个工种有个适配器
public class ProgrammerAdapter implements IWorkerAdapter {

	@Override
	public String work(Object worker) {
		return ((IProgrammer)worker).program();
	}

	@Override
	public boolean supports(Object worker) {
		// TODO Auto-generated method stub
		return (worker instanceof IProgrammer);
	}

}
