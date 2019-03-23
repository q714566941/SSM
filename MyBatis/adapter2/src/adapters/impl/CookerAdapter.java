package adapters.impl;

import adapters.IWorkerAdapter;
import worker.ICooker;

//每个工种有个适配器
public class CookerAdapter implements IWorkerAdapter {

	@Override
	public String work(Object worker) {
		return ((ICooker)worker).cook();
	}

	@Override
	public boolean supports(Object worker) {
		// TODO Auto-generated method stub
		return (worker instanceof ICooker);
	}

}
