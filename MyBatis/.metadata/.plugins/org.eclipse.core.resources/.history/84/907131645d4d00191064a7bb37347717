package beans;

import java.util.Set;

//新闻栏目：当前的新闻栏目被看作一方，即父lanmu
public class NewsLabel {
	private Integer id;
	private String name;                      //栏目名称
	private Set<NewsLabel> children;           //子栏目也是栏目
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<NewsLabel> getChildren() {
		return children;
	}
	public void setChildre(Set<NewsLabel> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "NewsLable [id=" + id + ", name=" + name + ", children=" + children + "]";
	}
	
}
