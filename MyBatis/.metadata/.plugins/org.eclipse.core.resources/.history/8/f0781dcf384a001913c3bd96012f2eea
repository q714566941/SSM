package test;

import adapters.IWorkerAdapter;
import adapters.impl.WorkAdapter;
import worker.ICooker;
import worker.IProgrammer;
import worker.impl.JdProgrammer;
import worker.impl.QjdCooker;

public class MyTest {

	public static void main(String[] args) {
		ICooker qjdCooker = new QjdCooker();
		IProgrammer jdpIProgrammer = new JdProgrammer();
		
		Object[] workers = {qjdCooker, jdpIProgrammer};
		//创建设配器对象
		IWorkerAdapter adapter = new WorkAdapter();
		//循环遍历每个工种对象，让每个work在适配器中逐个匹配
		for (Object worker : workers) {
			String workContentString = adapter.work(worker);
			System.out.println(workContentString);
		}
	}

}
