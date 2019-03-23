package test;

import java.util.List;
import java.util.ArrayList;

import adapters.IWorkerAdapter;
import adapters.impl.CookerAdapter;
import adapters.impl.ProgrammerAdapter;
import worker.ICooker;
import worker.IProgrammer;
import worker.impl.JdProgrammer;
import worker.impl.QjdCooker;

public class MyTest {

	public static void main(String[] args) {
		ICooker qjdCooker = new QjdCooker();
		IProgrammer jdpIProgrammer = new JdProgrammer();
		
		Object[] workers = {qjdCooker, jdpIProgrammer};
		
		//循环遍历每个工种对象，让每个work在适配器中逐个匹配
		for (Object worker : workers) {
			IWorkerAdapter adapter = getAdapter(worker);
			System.out.println(adapter.work(worker));
		}
	}
	
	//根据worker获取相应适配器对象
	private static IWorkerAdapter getAdapter(Object worker) {     //获取支持该工种的适配器
		List<IWorkerAdapter> adapters = getAllAdapters();
		for (IWorkerAdapter adapter : adapters) {
			if (adapter.supports(worker)) {
				return adapter;
			}
		}
		return null;
	}
	
	//获取所有适配器
	private static List<IWorkerAdapter> getAllAdapters() {
		List<IWorkerAdapter> adapters = new ArrayList<>();
		adapters.add(new CookerAdapter());
		adapters.add(new ProgrammerAdapter());
		return adapters;
	}

}
