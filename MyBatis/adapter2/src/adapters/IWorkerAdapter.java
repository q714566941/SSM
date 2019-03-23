package adapters;

public interface IWorkerAdapter {
	String work(Object worker);
	boolean supports(Object worker);       //判断该适配器接口是否支持传过来的对象
}
